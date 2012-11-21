package at.ac.tuwien.big.me12.lab2.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Before;
import org.junit.Test;

import ac.at.tuwien.big.me12.gradingsystem.ConcreteTask;
import ac.at.tuwien.big.me12.gradingsystem.Course;
import ac.at.tuwien.big.me12.gradingsystem.Grade;
import ac.at.tuwien.big.me12.gradingsystem.Grading;
import ac.at.tuwien.big.me12.gradingsystem.GradingScheme;
import ac.at.tuwien.big.me12.gradingsystem.GradingSystem;
import ac.at.tuwien.big.me12.gradingsystem.MinRequirement;
import ac.at.tuwien.big.me12.gradingsystem.MinRequirementsType;
import ac.at.tuwien.big.me12.gradingsystem.Task;
import ac.at.tuwien.big.me12.gradingsystem.TaskGroup;

public class GrammarTest {

	private static final String MODEL_PATH = "gsml-models/";
	private static final String INPUT_MODEL_PATH = MODEL_PATH + "test2.gsml";

	private static final String COURSE_NAME_MODEL_ENGINEERING = "Model_Engineering";
	private static final String COURSE_NAME_WEB_ENGINEERING = "Web_Engineering";

	private final XtextExtractor extractor = new XtextExtractor();
	private Resource modelResource;

	@Before
	public void extractTestModels() throws IOException {
		modelResource = extractor.extract(INPUT_MODEL_PATH);
	}

	@Test
	public void testCourseExistenceAndName() {
		EList<Course> coursesInGradingSystem = getCoursesInGradingSystem();
		assertEquals(2, coursesInGradingSystem.size());
		checkCourseNames(coursesInGradingSystem);
	}

	private void checkCourseNames(EList<Course> courses) {
		assertTrue((courses.get(0).getName()
				.equals(COURSE_NAME_MODEL_ENGINEERING) && courses.get(1)
				.getName().equals(COURSE_NAME_WEB_ENGINEERING))
				|| (courses.get(1).getName()
						.equals(COURSE_NAME_MODEL_ENGINEERING) && courses
						.get(0).getName().equals(COURSE_NAME_WEB_ENGINEERING)));
	}

	private EList<Course> getCoursesInGradingSystem() {
		GradingSystem gradingSystem = getGradingSystem();
		EList<Course> coursesInGradingSystem = gradingSystem.getCourses();
		return coursesInGradingSystem;
	}

	private GradingSystem getGradingSystem() {
		return (GradingSystem) modelResource.getContents().get(0);
	}

	@Test
	public void testGradingExistenceAndSemester() {
		Course modelEngineering = getCourse(COURSE_NAME_MODEL_ENGINEERING);
		Course webEngineering = getCourse(COURSE_NAME_WEB_ENGINEERING);

		// check existence
		assertEquals(2, modelEngineering.getGradings().size());
		assertEquals(1, webEngineering.getGradings().size());

		// check semester
		Grading meGrading1 = modelEngineering.getGradings().get(0);
		Grading meGrading2 = modelEngineering.getGradings().get(1);
		checkMEGradingNames(meGrading1, meGrading2);

		Grading weGrading = webEngineering.getGradings().get(0);
		assertTrue("WS2012".equals(weGrading.getSemester()));
	}

	private void checkMEGradingNames(Grading meGrading1, Grading meGrading2) {
		assertTrue(("WS2011".equals(meGrading1.getSemester()) && "WS2012"
				.equals(meGrading2.getSemester()))
				|| ("WS2011".equals(meGrading2.getSemester()) && "WS2012"
						.equals(meGrading1.getSemester())));
	}

	private Course getCourse(String courseName) {
		for (Course course : getCoursesInGradingSystem()) {
			if (course.getName().equals(courseName))
				return course;
		}
		return null;
	}

	@Test
	public void testGradingScheme() {
		checkGradingSchemeME2012();
		checkGradingSchemeME2011();
	}

	private GradingScheme getGradingScheme(String courseName, String semester) {
		Course course = getCourse(courseName);
		for (Grading grading : course.getGradings()) {
			if (semester.equals(grading.getSemester()))
				return grading.getGradingScheme();
		}
		return null;
	}

	private void checkGradingSchemeME2012() {
		GradingScheme gradingScheme = getGradingScheme(
				COURSE_NAME_MODEL_ENGINEERING, "WS2012");

		assertEquals(5, gradingScheme.getGrades().size());
		assertTrue(containsGrade(gradingScheme, "S1"));
		assertTrue(containsGrade(gradingScheme, "U2"));
		assertTrue(containsGrade(gradingScheme, "B3"));
		assertTrue(containsGrade(gradingScheme, "G4"));
		assertTrue(containsGrade(gradingScheme, "N5"));

		assertEquals(176, getGrade(gradingScheme, "S1").getRequiredPoints());
		assertEquals(150, getGrade(gradingScheme, "U2").getRequiredPoints());
		assertEquals(124, getGrade(gradingScheme, "B3").getRequiredPoints());
		assertEquals(100, getGrade(gradingScheme, "G4").getRequiredPoints());
		assertEquals(0, getGrade(gradingScheme, "N5").getRequiredPoints());

		Grade minReqNotFulFilledGrade = gradingScheme
				.getMinRequirementNotFulfilledGrade();
		assertEquals(getGrade(gradingScheme, "N5"), minReqNotFulFilledGrade);
	}

	private void checkGradingSchemeME2011() {
		GradingScheme gradingScheme = getGradingScheme(
				COURSE_NAME_MODEL_ENGINEERING, "WS2011");

		assertEquals(2, gradingScheme.getGrades().size());

		assertTrue(containsGrade(gradingScheme, "PASS"));
		assertTrue(containsGrade(gradingScheme, "FAIL"));

		assertEquals(0, getGrade(gradingScheme, "FAIL").getRequiredPoints());
		assertEquals(100, getGrade(gradingScheme, "PASS").getRequiredPoints());

		Grade minReqNotFulFilledGrade = gradingScheme
				.getMinRequirementNotFulfilledGrade();
		assertEquals(getGrade(gradingScheme, "FAIL"), minReqNotFulFilledGrade);
	}

	private boolean containsGrade(GradingScheme gradingScheme, String gradeName) {
		return getGrade(gradingScheme, gradeName) != null;
	}

	private Grade getGrade(GradingScheme gradingScheme, String gradeName) {
		for (Grade grade : gradingScheme.getGrades()) {
			if (gradeName.equals(grade.getName()))
				return grade;
		}
		return null;
	}

	@Test
	public void testTasks() {
		checkTasksME2012();
		checkTasksME2011();
	}

	private void checkTasksME2012() {
		EList<Task> tasks = getTasks(COURSE_NAME_MODEL_ENGINEERING, "WS2012");

		assertEquals(2, tasks.size());
		assertTrue(containsTask(tasks, "LecturePart"));
		assertTrue(containsTask(tasks, "LabPart"));

		checkLecturePartME2012(tasks);
		checkLabPartME2012(tasks);
	}

	private boolean containsTask(EList<Task> tasks, String taskName) {
		return getTask(tasks, taskName) != null;
	}

	private Task getTask(EList<Task> tasks, String taskName) {
		for (Task task : tasks) {
			if (taskName.equals(task.getName()))
				return task;
		}
		return null;
	}

	private void checkLecturePartME2012(EList<Task> tasks) {
		Task lecturePartTask = getTask(tasks, "LecturePart");
		assertTrue(lecturePartTask instanceof TaskGroup);
		TaskGroup lecturePartTaskGroup = (TaskGroup) lecturePartTask;
		assertEquals(2, lecturePartTaskGroup.getContains().size());
		assertTrue(containsTask(lecturePartTaskGroup.getContains(), "Exam1"));
		assertTrue(containsTask(lecturePartTaskGroup.getContains(), "Exam2"));
		Task exam1Task = getTask(lecturePartTaskGroup.getContains(), "Exam1");
		checkME2012ExamTask(exam1Task);
		Task exam2Task = getTask(lecturePartTaskGroup.getContains(), "Exam2");
		checkME2012ExamTask(exam2Task);
	}

	private void checkME2012ExamTask(Task examTask) {
		assertTrue(examTask instanceof ConcreteTask);
		ConcreteTask examConcreteTask = (ConcreteTask) examTask;
		assertEquals(50, examConcreteTask.getMaxPoints());
		assertEquals(50, examConcreteTask.getMinRequirement().getValue());
		assertEquals(MinRequirementsType.PERCENTAGE, examConcreteTask
				.getMinRequirement().getType());
	}

	private void checkLabPartME2012(EList<Task> tasks) {
		Task labPartTask = getTask(tasks, "LabPart");
		assertTrue(labPartTask instanceof TaskGroup);
		TaskGroup labPartTaskGroup = (TaskGroup) labPartTask;
		assertEquals(4, labPartTaskGroup.getContains().size());
		assertTrue(containsTask(labPartTaskGroup.getContains(), "Lab1"));
		assertTrue(containsTask(labPartTaskGroup.getContains(), "Lab2"));
		assertTrue(containsTask(labPartTaskGroup.getContains(), "Lab3"));
		assertTrue(containsTask(labPartTaskGroup.getContains(), "Lab4"));
		for (Task task : labPartTaskGroup.getContains()) {
			checkME2012LabTask(task);
		}
		MinRequirement minRequirement = labPartTaskGroup.getMinRequirement();
		assertEquals(50, minRequirement.getValue());
		assertEquals(MinRequirementsType.PERCENTAGE, minRequirement.getType());
	}

	private void checkME2012LabTask(Task task) {
		assertTrue(task instanceof ConcreteTask);
		ConcreteTask labConcreteTask = (ConcreteTask) task;
		assertEquals(25, labConcreteTask.getMaxPoints());
		assertEquals(8, labConcreteTask.getMinRequirement().getValue());
		assertEquals(MinRequirementsType.ABSOLUTE, labConcreteTask
				.getMinRequirement().getType());
	}

	private void checkTasksME2011() {
		EList<Task> tasks = getTasks(COURSE_NAME_MODEL_ENGINEERING, "WS2011");

		assertEquals(2, tasks.size());
		assertTrue(containsTask(tasks, "LecturePart"));
		assertTrue(containsTask(tasks, "Lab1"));

		assertTrue(getTask(tasks, "Lab1") instanceof ConcreteTask);
		assertTrue(getTask(tasks, "LecturePart") instanceof TaskGroup);

		TaskGroup lecturePart = (TaskGroup) getTask(tasks, "LecturePart");
		assertEquals(2, lecturePart.getContains().size());
		assertTrue(containsTask(lecturePart.getContains(), "OralLecturePart"));
		assertTrue(getTask(lecturePart.getContains(), "OralLecturePart") instanceof TaskGroup);
		assertTrue(containsTask(lecturePart.getContains(), "Exam3"));
		assertTrue(getTask(lecturePart.getContains(), "Exam3") instanceof ConcreteTask);

		TaskGroup oralLecturePart = (TaskGroup) getTask(
				lecturePart.getContains(), "OralLecturePart");
		assertEquals(2, oralLecturePart.getContains().size());
		assertTrue(oralLecturePart.getMinRequirement() == null);
	}

	private EList<Task> getTasks(String courseName, String semester) {
		Course course = getCourse(courseName);
		for (Grading grading : course.getGradings()) {
			if (semester.equals(grading.getSemester()))
				return grading.getTasks();
		}
		return null;
	}

}
