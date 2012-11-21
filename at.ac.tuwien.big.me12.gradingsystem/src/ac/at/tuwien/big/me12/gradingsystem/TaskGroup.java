/**
 */
package ac.at.tuwien.big.me12.gradingsystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.TaskGroup#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getTaskGroup()
 * @model
 * @generated
 */
public interface TaskGroup extends Task {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link ac.at.tuwien.big.me12.gradingsystem.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getTaskGroup_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getContains();

} // TaskGroup
