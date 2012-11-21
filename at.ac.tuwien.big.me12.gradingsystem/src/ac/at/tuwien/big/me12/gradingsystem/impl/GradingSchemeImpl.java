/**
 */
package ac.at.tuwien.big.me12.gradingsystem.impl;

import ac.at.tuwien.big.me12.gradingsystem.Grade;
import ac.at.tuwien.big.me12.gradingsystem.GradingScheme;
import ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grading Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradingSchemeImpl#getGrades <em>Grades</em>}</li>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradingSchemeImpl#getMinRequirementNotFulfilledGrade <em>Min Requirement Not Fulfilled Grade</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradingSchemeImpl extends EObjectImpl implements GradingScheme {
	/**
	 * The cached value of the '{@link #getGrades() <em>Grades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrades()
	 * @generated
	 * @ordered
	 */
	protected EList<Grade> grades;

	/**
	 * The cached value of the '{@link #getMinRequirementNotFulfilledGrade() <em>Min Requirement Not Fulfilled Grade</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequirementNotFulfilledGrade()
	 * @generated
	 * @ordered
	 */
	protected Grade minRequirementNotFulfilledGrade;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradingSchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GradingSystemPackage.Literals.GRADING_SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grade> getGrades() {
		if (grades == null) {
			grades = new EObjectContainmentEList<Grade>(Grade.class, this, GradingSystemPackage.GRADING_SCHEME__GRADES);
		}
		return grades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grade getMinRequirementNotFulfilledGrade() {
		if (minRequirementNotFulfilledGrade != null && minRequirementNotFulfilledGrade.eIsProxy()) {
			InternalEObject oldMinRequirementNotFulfilledGrade = (InternalEObject)minRequirementNotFulfilledGrade;
			minRequirementNotFulfilledGrade = (Grade)eResolveProxy(oldMinRequirementNotFulfilledGrade);
			if (minRequirementNotFulfilledGrade != oldMinRequirementNotFulfilledGrade) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GradingSystemPackage.GRADING_SCHEME__MIN_REQUIREMENT_NOT_FULFILLED_GRADE, oldMinRequirementNotFulfilledGrade, minRequirementNotFulfilledGrade));
			}
		}
		return minRequirementNotFulfilledGrade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grade basicGetMinRequirementNotFulfilledGrade() {
		return minRequirementNotFulfilledGrade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRequirementNotFulfilledGrade(Grade newMinRequirementNotFulfilledGrade) {
		Grade oldMinRequirementNotFulfilledGrade = minRequirementNotFulfilledGrade;
		minRequirementNotFulfilledGrade = newMinRequirementNotFulfilledGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradingSystemPackage.GRADING_SCHEME__MIN_REQUIREMENT_NOT_FULFILLED_GRADE, oldMinRequirementNotFulfilledGrade, minRequirementNotFulfilledGrade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GradingSystemPackage.GRADING_SCHEME__GRADES:
				return ((InternalEList<?>)getGrades()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GradingSystemPackage.GRADING_SCHEME__GRADES:
				return getGrades();
			case GradingSystemPackage.GRADING_SCHEME__MIN_REQUIREMENT_NOT_FULFILLED_GRADE:
				if (resolve) return getMinRequirementNotFulfilledGrade();
				return basicGetMinRequirementNotFulfilledGrade();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GradingSystemPackage.GRADING_SCHEME__GRADES:
				getGrades().clear();
				getGrades().addAll((Collection<? extends Grade>)newValue);
				return;
			case GradingSystemPackage.GRADING_SCHEME__MIN_REQUIREMENT_NOT_FULFILLED_GRADE:
				setMinRequirementNotFulfilledGrade((Grade)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GradingSystemPackage.GRADING_SCHEME__GRADES:
				getGrades().clear();
				return;
			case GradingSystemPackage.GRADING_SCHEME__MIN_REQUIREMENT_NOT_FULFILLED_GRADE:
				setMinRequirementNotFulfilledGrade((Grade)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GradingSystemPackage.GRADING_SCHEME__GRADES:
				return grades != null && !grades.isEmpty();
			case GradingSystemPackage.GRADING_SCHEME__MIN_REQUIREMENT_NOT_FULFILLED_GRADE:
				return minRequirementNotFulfilledGrade != null;
		}
		return super.eIsSet(featureID);
	}

} //GradingSchemeImpl
