/**
 */
package ac.at.tuwien.big.me12.gradingsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.Grade#getName <em>Name</em>}</li>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.Grade#getRequiredPoints <em>Required Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getGrade()
 * @model
 * @generated
 */
public interface Grade extends EObject {
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
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getGrade_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ac.at.tuwien.big.me12.gradingsystem.Grade#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Required Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Points</em>' attribute.
	 * @see #setRequiredPoints(int)
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getGrade_RequiredPoints()
	 * @model
	 * @generated
	 */
	int getRequiredPoints();

	/**
	 * Sets the value of the '{@link ac.at.tuwien.big.me12.gradingsystem.Grade#getRequiredPoints <em>Required Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Points</em>' attribute.
	 * @see #getRequiredPoints()
	 * @generated
	 */
	void setRequiredPoints(int value);

} // Grade
