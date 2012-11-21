/**
 */
package ac.at.tuwien.big.me12.gradingsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.Grading#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.Grading#getGradingScheme <em>Grading Scheme</em>}</li>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.Grading#getSemester <em>Semester</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getGrading()
 * @model
 * @generated
 */
public interface Grading extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link ac.at.tuwien.big.me12.gradingsystem.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getGrading_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Grading Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grading Scheme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grading Scheme</em>' containment reference.
	 * @see #setGradingScheme(GradingScheme)
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getGrading_GradingScheme()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GradingScheme getGradingScheme();

	/**
	 * Sets the value of the '{@link ac.at.tuwien.big.me12.gradingsystem.Grading#getGradingScheme <em>Grading Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grading Scheme</em>' containment reference.
	 * @see #getGradingScheme()
	 * @generated
	 */
	void setGradingScheme(GradingScheme value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see #setSemester(String)
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getGrading_Semester()
	 * @model
	 * @generated
	 */
	String getSemester();

	/**
	 * Sets the value of the '{@link ac.at.tuwien.big.me12.gradingsystem.Grading#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(String value);

} // Grading
