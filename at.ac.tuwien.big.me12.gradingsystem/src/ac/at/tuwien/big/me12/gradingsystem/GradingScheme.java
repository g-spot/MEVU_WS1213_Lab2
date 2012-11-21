/**
 */
package ac.at.tuwien.big.me12.gradingsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grading Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.GradingScheme#getGrades <em>Grades</em>}</li>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.GradingScheme#getMinRequirementNotFulfilledGrade <em>Min Requirement Not Fulfilled Grade</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getGradingScheme()
 * @model
 * @generated
 */
public interface GradingScheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Grades</b></em>' containment reference list.
	 * The list contents are of type {@link ac.at.tuwien.big.me12.gradingsystem.Grade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grades</em>' containment reference list.
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getGradingScheme_Grades()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Grade> getGrades();

	/**
	 * Returns the value of the '<em><b>Min Requirement Not Fulfilled Grade</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Requirement Not Fulfilled Grade</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Requirement Not Fulfilled Grade</em>' reference.
	 * @see #setMinRequirementNotFulfilledGrade(Grade)
	 * @see ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage#getGradingScheme_MinRequirementNotFulfilledGrade()
	 * @model required="true"
	 * @generated
	 */
	Grade getMinRequirementNotFulfilledGrade();

	/**
	 * Sets the value of the '{@link ac.at.tuwien.big.me12.gradingsystem.GradingScheme#getMinRequirementNotFulfilledGrade <em>Min Requirement Not Fulfilled Grade</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Requirement Not Fulfilled Grade</em>' reference.
	 * @see #getMinRequirementNotFulfilledGrade()
	 * @generated
	 */
	void setMinRequirementNotFulfilledGrade(Grade value);

} // GradingScheme
