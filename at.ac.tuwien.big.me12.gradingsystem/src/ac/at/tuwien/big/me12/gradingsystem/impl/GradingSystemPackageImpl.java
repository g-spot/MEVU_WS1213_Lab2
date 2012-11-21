/**
 */
package ac.at.tuwien.big.me12.gradingsystem.impl;

import ac.at.tuwien.big.me12.gradingsystem.ConcreteTask;
import ac.at.tuwien.big.me12.gradingsystem.Course;
import ac.at.tuwien.big.me12.gradingsystem.Grade;
import ac.at.tuwien.big.me12.gradingsystem.Grading;
import ac.at.tuwien.big.me12.gradingsystem.GradingScheme;
import ac.at.tuwien.big.me12.gradingsystem.GradingSystem;
import ac.at.tuwien.big.me12.gradingsystem.GradingSystemFactory;
import ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage;
import ac.at.tuwien.big.me12.gradingsystem.MinRequirement;
import ac.at.tuwien.big.me12.gradingsystem.MinRequirementsType;
import ac.at.tuwien.big.me12.gradingsystem.Task;
import ac.at.tuwien.big.me12.gradingsystem.TaskGroup;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GradingSystemPackageImpl extends EPackageImpl implements GradingSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradingSchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum minRequirementsTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GradingSystemPackageImpl() {
		super(eNS_URI, GradingSystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GradingSystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GradingSystemPackage init() {
		if (isInited) return (GradingSystemPackage)EPackage.Registry.INSTANCE.getEPackage(GradingSystemPackage.eNS_URI);

		// Obtain or create and register package
		GradingSystemPackageImpl theGradingSystemPackage = (GradingSystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GradingSystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GradingSystemPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGradingSystemPackage.createPackageContents();

		// Initialize created meta-data
		theGradingSystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGradingSystemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GradingSystemPackage.eNS_URI, theGradingSystemPackage);
		return theGradingSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradingSystem() {
		return gradingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGradingSystem_Courses() {
		return (EReference)gradingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Name() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Gradings() {
		return (EReference)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_MinRequirement() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteTask() {
		return concreteTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteTask_MaxPoints() {
		return (EAttribute)concreteTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskGroup() {
		return taskGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskGroup_Contains() {
		return (EReference)taskGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinRequirement() {
		return minRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinRequirement_Value() {
		return (EAttribute)minRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinRequirement_Type() {
		return (EAttribute)minRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradingScheme() {
		return gradingSchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGradingScheme_Grades() {
		return (EReference)gradingSchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGradingScheme_MinRequirementNotFulfilledGrade() {
		return (EReference)gradingSchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrade() {
		return gradeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrade_Name() {
		return (EAttribute)gradeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrade_RequiredPoints() {
		return (EAttribute)gradeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrading() {
		return gradingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrading_Tasks() {
		return (EReference)gradingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrading_GradingScheme() {
		return (EReference)gradingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrading_Semester() {
		return (EAttribute)gradingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMinRequirementsType() {
		return minRequirementsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingSystemFactory getGradingSystemFactory() {
		return (GradingSystemFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gradingSystemEClass = createEClass(GRADING_SYSTEM);
		createEReference(gradingSystemEClass, GRADING_SYSTEM__COURSES);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__NAME);
		createEReference(courseEClass, COURSE__GRADINGS);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEReference(taskEClass, TASK__MIN_REQUIREMENT);

		concreteTaskEClass = createEClass(CONCRETE_TASK);
		createEAttribute(concreteTaskEClass, CONCRETE_TASK__MAX_POINTS);

		taskGroupEClass = createEClass(TASK_GROUP);
		createEReference(taskGroupEClass, TASK_GROUP__CONTAINS);

		minRequirementEClass = createEClass(MIN_REQUIREMENT);
		createEAttribute(minRequirementEClass, MIN_REQUIREMENT__VALUE);
		createEAttribute(minRequirementEClass, MIN_REQUIREMENT__TYPE);

		gradingSchemeEClass = createEClass(GRADING_SCHEME);
		createEReference(gradingSchemeEClass, GRADING_SCHEME__GRADES);
		createEReference(gradingSchemeEClass, GRADING_SCHEME__MIN_REQUIREMENT_NOT_FULFILLED_GRADE);

		gradeEClass = createEClass(GRADE);
		createEAttribute(gradeEClass, GRADE__NAME);
		createEAttribute(gradeEClass, GRADE__REQUIRED_POINTS);

		gradingEClass = createEClass(GRADING);
		createEReference(gradingEClass, GRADING__TASKS);
		createEReference(gradingEClass, GRADING__GRADING_SCHEME);
		createEAttribute(gradingEClass, GRADING__SEMESTER);

		// Create enums
		minRequirementsTypeEEnum = createEEnum(MIN_REQUIREMENTS_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		concreteTaskEClass.getESuperTypes().add(this.getTask());
		taskGroupEClass.getESuperTypes().add(this.getTask());

		// Initialize classes and features; add operations and parameters
		initEClass(gradingSystemEClass, GradingSystem.class, "GradingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGradingSystem_Courses(), this.getCourse(), null, "courses", null, 0, -1, GradingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Gradings(), this.getGrading(), null, "gradings", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_MinRequirement(), this.getMinRequirement(), null, "minRequirement", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteTaskEClass, ConcreteTask.class, "ConcreteTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteTask_MaxPoints(), ecorePackage.getEInt(), "maxPoints", null, 0, 1, ConcreteTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskGroupEClass, TaskGroup.class, "TaskGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskGroup_Contains(), this.getTask(), null, "contains", null, 1, -1, TaskGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minRequirementEClass, MinRequirement.class, "MinRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinRequirement_Value(), ecorePackage.getEInt(), "value", null, 0, 1, MinRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinRequirement_Type(), this.getMinRequirementsType(), "type", null, 0, 1, MinRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradingSchemeEClass, GradingScheme.class, "GradingScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGradingScheme_Grades(), this.getGrade(), null, "grades", null, 1, -1, GradingScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGradingScheme_MinRequirementNotFulfilledGrade(), this.getGrade(), null, "minRequirementNotFulfilledGrade", null, 1, 1, GradingScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradeEClass, Grade.class, "Grade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrade_Name(), ecorePackage.getEString(), "name", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrade_RequiredPoints(), ecorePackage.getEInt(), "requiredPoints", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradingEClass, Grading.class, "Grading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrading_Tasks(), this.getTask(), null, "tasks", null, 1, -1, Grading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrading_GradingScheme(), this.getGradingScheme(), null, "gradingScheme", null, 1, 1, Grading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrading_Semester(), ecorePackage.getEString(), "semester", null, 0, 1, Grading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(minRequirementsTypeEEnum, MinRequirementsType.class, "MinRequirementsType");
		addEEnumLiteral(minRequirementsTypeEEnum, MinRequirementsType.PERCENTAGE);
		addEEnumLiteral(minRequirementsTypeEEnum, MinRequirementsType.ABSOLUTE);

		// Create resource
		createResource(eNS_URI);
	}

} //GradingSystemPackageImpl
