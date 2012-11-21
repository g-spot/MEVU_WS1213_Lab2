/**
 */
package ac.at.tuwien.big.me12.gradingsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.Course#getName <em>Name</em>}</li>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.Course#getGradings <em>Gradings</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ac.at.tuwien.big.me12.gradingsystem.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gradings</b></em>' containment reference list.
	 * The list contents are of type {@link ac.at.tuwien.big.me12.gradingsystem.Grading}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradings</em>' containment reference list.
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getCourse_Gradings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Grading> getGradings();

} // Course
