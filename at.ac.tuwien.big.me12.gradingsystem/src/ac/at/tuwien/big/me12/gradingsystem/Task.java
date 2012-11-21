/**
 */
package ac.at.tuwien.big.me12.gradingsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.Task#getName <em>Name</em>}</li>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.Task#getMinRequirement <em>Min Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends EObject {
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
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ac.at.tuwien.big.me12.gradingsystem.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Min Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Requirement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Requirement</em>' containment reference.
	 * @see #setMinRequirement(MinRequirement)
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getTask_MinRequirement()
	 * @model containment="true"
	 * @generated
	 */
	MinRequirement getMinRequirement();

	/**
	 * Sets the value of the '{@link ac.at.tuwien.big.me12.gradingsystem.Task#getMinRequirement <em>Min Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Requirement</em>' containment reference.
	 * @see #getMinRequirement()
	 * @generated
	 */
	void setMinRequirement(MinRequirement value);

} // Task
