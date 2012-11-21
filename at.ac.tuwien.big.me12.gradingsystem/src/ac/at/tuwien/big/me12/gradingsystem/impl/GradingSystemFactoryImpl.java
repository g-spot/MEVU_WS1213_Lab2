/**
 */
package ac.at.tuwien.big.me12.gradingsystem.impl;

import ac.at.tuwien.big.me12.gradingsystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GradingSystemFactoryImpl extends EFactoryImpl implements GradingSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GradingSystemFactory init() {
		try {
			GradingSystemFactory theGradingSystemFactory = (GradingSystemFactory)EPackage.Registry.INSTANCE.getEFactory("http://gradingsystem.me12.big.tuwien.ac.at/1.0"); 
			if (theGradingSystemFactory != null) {
				return theGradingSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GradingSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingSystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GradingSystemPackage.GRADING_SYSTEM: return createGradingSystem();
			case GradingSystemPackage.COURSE: return createCourse();
			case GradingSystemPackage.CONCRETE_TASK: return createConcreteTask();
			case GradingSystemPackage.TASK_GROUP: return createTaskGroup();
			case GradingSystemPackage.MIN_REQUIREMENT: return createMinRequirement();
			case GradingSystemPackage.GRADING_SCHEME: return createGradingScheme();
			case GradingSystemPackage.GRADE: return createGrade();
			case GradingSystemPackage.GRADING: return createGrading();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GradingSystemPackage.MIN_REQUIREMENTS_TYPE:
				return createMinRequirementsTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GradingSystemPackage.MIN_REQUIREMENTS_TYPE:
				return convertMinRequirementsTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingSystem createGradingSystem() {
		GradingSystemImpl gradingSystem = new GradingSystemImpl();
		return gradingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteTask createConcreteTask() {
		ConcreteTaskImpl concreteTask = new ConcreteTaskImpl();
		return concreteTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskGroup createTaskGroup() {
		TaskGroupImpl taskGroup = new TaskGroupImpl();
		return taskGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinRequirement createMinRequirement() {
		MinRequirementImpl minRequirement = new MinRequirementImpl();
		return minRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingScheme createGradingScheme() {
		GradingSchemeImpl gradingScheme = new GradingSchemeImpl();
		return gradingScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grade createGrade() {
		GradeImpl grade = new GradeImpl();
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grading createGrading() {
		GradingImpl grading = new GradingImpl();
		return grading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinRequirementsType createMinRequirementsTypeFromString(EDataType eDataType, String initialValue) {
		MinRequirementsType result = MinRequirementsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMinRequirementsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingSystemPackage getGradingSystemPackage() {
		return (GradingSystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GradingSystemPackage getPackage() {
		return GradingSystemPackage.eINSTANCE;
	}

} //GradingSystemFactoryImpl
