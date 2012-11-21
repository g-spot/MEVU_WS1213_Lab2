/**
 */
package ac.at.tuwien.big.me12.gradingsystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemFactory
 * @model kind="package"
 * @generated
 */
public interface GradingSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gradingsystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gradingsystem.me12.big.tuwien.ac.at/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gradingsystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GradingSystemPackage eINSTANCE = ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemImpl <em>Grading System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemImpl
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getGradingSystem()
	 * @generated
	 */
	int GRADING_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SYSTEM__COURSES = 0;

	/**
	 * The number of structural features of the '<em>Grading System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.CourseImpl
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Gradings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__GRADINGS = 1;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.TaskImpl
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Min Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MIN_REQUIREMENT = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.ConcreteTaskImpl <em>Concrete Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.ConcreteTaskImpl
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getConcreteTask()
	 * @generated
	 */
	int CONCRETE_TASK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Min Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK__MIN_REQUIREMENT = TASK__MIN_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Max Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK__MAX_POINTS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.TaskGroupImpl <em>Task Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.TaskGroupImpl
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getTaskGroup()
	 * @generated
	 */
	int TASK_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Min Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__MIN_REQUIREMENT = TASK__MIN_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__CONTAINS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.MinRequirementImpl <em>Min Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.MinRequirementImpl
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getMinRequirement()
	 * @generated
	 */
	int MIN_REQUIREMENT = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_REQUIREMENT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_REQUIREMENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Min Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_REQUIREMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradingSchemeImpl <em>Grading Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSchemeImpl
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getGradingScheme()
	 * @generated
	 */
	int GRADING_SCHEME = 6;

	/**
	 * The feature id for the '<em><b>Grades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SCHEME__GRADES = 0;

	/**
	 * The feature id for the '<em><b>Min Requirement Not Fulfilled Grade</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SCHEME__MIN_REQUIREMENT_NOT_FULFILLED_GRADE = 1;

	/**
	 * The number of structural features of the '<em>Grading Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SCHEME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradeImpl
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Required Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__REQUIRED_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradingImpl <em>Grading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingImpl
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getGrading()
	 * @generated
	 */
	int GRADING = 8;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Grading Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING__GRADING_SCHEME = 1;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING__SEMESTER = 2;

	/**
	 * The number of structural features of the '<em>Grading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ac.at.tuwien.big.me12.gradingsystem.MinRequirementsType <em>Min Requirements Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.at.tuwien.big.me12.gradingsystem.MinRequirementsType
	 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getMinRequirementsType()
	 * @generated
	 */
	int MIN_REQUIREMENTS_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link ac.at.tuwien.big.me12.gradingsystem.GradingSystem <em>Grading System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grading System</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystem
	 * @generated
	 */
	EClass getGradingSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.at.tuwien.big.me12.gradingsystem.GradingSystem#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystem#getCourses()
	 * @see #getGradingSystem()
	 * @generated
	 */
	EReference getGradingSystem_Courses();

	/**
	 * Returns the meta object for class '{@link ac.at.tuwien.big.me12.gradingsystem.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link ac.at.tuwien.big.me12.gradingsystem.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.at.tuwien.big.me12.gradingsystem.Course#getGradings <em>Gradings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gradings</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Course#getGradings()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Gradings();

	/**
	 * Returns the meta object for class '{@link ac.at.tuwien.big.me12.gradingsystem.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link ac.at.tuwien.big.me12.gradingsystem.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ac.at.tuwien.big.me12.gradingsystem.Task#getMinRequirement <em>Min Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Requirement</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Task#getMinRequirement()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_MinRequirement();

	/**
	 * Returns the meta object for class '{@link ac.at.tuwien.big.me12.gradingsystem.ConcreteTask <em>Concrete Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Task</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.ConcreteTask
	 * @generated
	 */
	EClass getConcreteTask();

	/**
	 * Returns the meta object for the attribute '{@link ac.at.tuwien.big.me12.gradingsystem.ConcreteTask#getMaxPoints <em>Max Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Points</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.ConcreteTask#getMaxPoints()
	 * @see #getConcreteTask()
	 * @generated
	 */
	EAttribute getConcreteTask_MaxPoints();

	/**
	 * Returns the meta object for class '{@link ac.at.tuwien.big.me12.gradingsystem.TaskGroup <em>Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Group</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.TaskGroup
	 * @generated
	 */
	EClass getTaskGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.at.tuwien.big.me12.gradingsystem.TaskGroup#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.TaskGroup#getContains()
	 * @see #getTaskGroup()
	 * @generated
	 */
	EReference getTaskGroup_Contains();

	/**
	 * Returns the meta object for class '{@link ac.at.tuwien.big.me12.gradingsystem.MinRequirement <em>Min Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Requirement</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.MinRequirement
	 * @generated
	 */
	EClass getMinRequirement();

	/**
	 * Returns the meta object for the attribute '{@link ac.at.tuwien.big.me12.gradingsystem.MinRequirement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.MinRequirement#getValue()
	 * @see #getMinRequirement()
	 * @generated
	 */
	EAttribute getMinRequirement_Value();

	/**
	 * Returns the meta object for the attribute '{@link ac.at.tuwien.big.me12.gradingsystem.MinRequirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.MinRequirement#getType()
	 * @see #getMinRequirement()
	 * @generated
	 */
	EAttribute getMinRequirement_Type();

	/**
	 * Returns the meta object for class '{@link ac.at.tuwien.big.me12.gradingsystem.GradingScheme <em>Grading Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grading Scheme</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingScheme
	 * @generated
	 */
	EClass getGradingScheme();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.at.tuwien.big.me12.gradingsystem.GradingScheme#getGrades <em>Grades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grades</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingScheme#getGrades()
	 * @see #getGradingScheme()
	 * @generated
	 */
	EReference getGradingScheme_Grades();

	/**
	 * Returns the meta object for the reference '{@link ac.at.tuwien.big.me12.gradingsystem.GradingScheme#getMinRequirementNotFulfilledGrade <em>Min Requirement Not Fulfilled Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Requirement Not Fulfilled Grade</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingScheme#getMinRequirementNotFulfilledGrade()
	 * @see #getGradingScheme()
	 * @generated
	 */
	EReference getGradingScheme_MinRequirementNotFulfilledGrade();

	/**
	 * Returns the meta object for class '{@link ac.at.tuwien.big.me12.gradingsystem.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the attribute '{@link ac.at.tuwien.big.me12.gradingsystem.Grade#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Grade#getName()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_Name();

	/**
	 * Returns the meta object for the attribute '{@link ac.at.tuwien.big.me12.gradingsystem.Grade#getRequiredPoints <em>Required Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Points</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Grade#getRequiredPoints()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_RequiredPoints();

	/**
	 * Returns the meta object for class '{@link ac.at.tuwien.big.me12.gradingsystem.Grading <em>Grading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grading</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Grading
	 * @generated
	 */
	EClass getGrading();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.at.tuwien.big.me12.gradingsystem.Grading#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Grading#getTasks()
	 * @see #getGrading()
	 * @generated
	 */
	EReference getGrading_Tasks();

	/**
	 * Returns the meta object for the containment reference '{@link ac.at.tuwien.big.me12.gradingsystem.Grading#getGradingScheme <em>Grading Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grading Scheme</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Grading#getGradingScheme()
	 * @see #getGrading()
	 * @generated
	 */
	EReference getGrading_GradingScheme();

	/**
	 * Returns the meta object for the attribute '{@link ac.at.tuwien.big.me12.gradingsystem.Grading#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.Grading#getSemester()
	 * @see #getGrading()
	 * @generated
	 */
	EAttribute getGrading_Semester();

	/**
	 * Returns the meta object for enum '{@link ac.at.tuwien.big.me12.gradingsystem.MinRequirementsType <em>Min Requirements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Min Requirements Type</em>'.
	 * @see ac.at.tuwien.big.me12.gradingsystem.MinRequirementsType
	 * @generated
	 */
	EEnum getMinRequirementsType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GradingSystemFactory getGradingSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemImpl <em>Grading System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemImpl
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getGradingSystem()
		 * @generated
		 */
		EClass GRADING_SYSTEM = eINSTANCE.getGradingSystem();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING_SYSTEM__COURSES = eINSTANCE.getGradingSystem_Courses();

		/**
		 * The meta object literal for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.CourseImpl
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Gradings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__GRADINGS = eINSTANCE.getCourse_Gradings();

		/**
		 * The meta object literal for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.TaskImpl
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Min Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__MIN_REQUIREMENT = eINSTANCE.getTask_MinRequirement();

		/**
		 * The meta object literal for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.ConcreteTaskImpl <em>Concrete Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.ConcreteTaskImpl
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getConcreteTask()
		 * @generated
		 */
		EClass CONCRETE_TASK = eINSTANCE.getConcreteTask();

		/**
		 * The meta object literal for the '<em><b>Max Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_TASK__MAX_POINTS = eINSTANCE.getConcreteTask_MaxPoints();

		/**
		 * The meta object literal for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.TaskGroupImpl <em>Task Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.TaskGroupImpl
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getTaskGroup()
		 * @generated
		 */
		EClass TASK_GROUP = eINSTANCE.getTaskGroup();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_GROUP__CONTAINS = eINSTANCE.getTaskGroup_Contains();

		/**
		 * The meta object literal for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.MinRequirementImpl <em>Min Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.MinRequirementImpl
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getMinRequirement()
		 * @generated
		 */
		EClass MIN_REQUIREMENT = eINSTANCE.getMinRequirement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_REQUIREMENT__VALUE = eINSTANCE.getMinRequirement_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_REQUIREMENT__TYPE = eINSTANCE.getMinRequirement_Type();

		/**
		 * The meta object literal for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradingSchemeImpl <em>Grading Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSchemeImpl
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getGradingScheme()
		 * @generated
		 */
		EClass GRADING_SCHEME = eINSTANCE.getGradingScheme();

		/**
		 * The meta object literal for the '<em><b>Grades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING_SCHEME__GRADES = eINSTANCE.getGradingScheme_Grades();

		/**
		 * The meta object literal for the '<em><b>Min Requirement Not Fulfilled Grade</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING_SCHEME__MIN_REQUIREMENT_NOT_FULFILLED_GRADE = eINSTANCE.getGradingScheme_MinRequirementNotFulfilledGrade();

		/**
		 * The meta object literal for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradeImpl
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__NAME = eINSTANCE.getGrade_Name();

		/**
		 * The meta object literal for the '<em><b>Required Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__REQUIRED_POINTS = eINSTANCE.getGrade_RequiredPoints();

		/**
		 * The meta object literal for the '{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradingImpl <em>Grading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingImpl
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getGrading()
		 * @generated
		 */
		EClass GRADING = eINSTANCE.getGrading();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING__TASKS = eINSTANCE.getGrading_Tasks();

		/**
		 * The meta object literal for the '<em><b>Grading Scheme</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING__GRADING_SCHEME = eINSTANCE.getGrading_GradingScheme();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADING__SEMESTER = eINSTANCE.getGrading_Semester();

		/**
		 * The meta object literal for the '{@link ac.at.tuwien.big.me12.gradingsystem.MinRequirementsType <em>Min Requirements Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.at.tuwien.big.me12.gradingsystem.MinRequirementsType
		 * @see ac.at.tuwien.big.me12.gradingsystem.impl.GradingSystemPackageImpl#getMinRequirementsType()
		 * @generated
		 */
		EEnum MIN_REQUIREMENTS_TYPE = eINSTANCE.getMinRequirementsType();

	}

} //GradingSystemPackage
