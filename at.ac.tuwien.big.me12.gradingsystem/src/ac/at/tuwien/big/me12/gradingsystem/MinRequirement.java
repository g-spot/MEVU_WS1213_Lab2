/**
 */
package ac.at.tuwien.big.me12.gradingsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.MinRequirement#getValue <em>Value</em>}</li>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.MinRequirement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getMinRequirement()
 * @model
 * @generated
 */
public interface MinRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getMinRequirement_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link ac.at.tuwien.big.me12.gradingsystem.MinRequirement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ac.at.tuwien.big.me12.gradingsystem.MinRequirementsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ac.at.tuwien.big.me12.gradingsystem.MinRequirementsType
	 * @see #setType(MinRequirementsType)
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getMinRequirement_Type()
	 * @model
	 * @generated
	 */
	MinRequirementsType getType();

	/**
	 * Sets the value of the '{@link ac.at.tuwien.big.me12.gradingsystem.MinRequirement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ac.at.tuwien.big.me12.gradingsystem.MinRequirementsType
	 * @see #getType()
	 * @generated
	 */
	void setType(MinRequirementsType value);

} // MinRequirement
