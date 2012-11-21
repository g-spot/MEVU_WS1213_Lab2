/**
 */
package ac.at.tuwien.big.me12.gradingsystem.impl;

import ac.at.tuwien.big.me12.gradingsystem.Grading;
import ac.at.tuwien.big.me12.gradingsystem.GradingScheme;
import ac.at.tuwien.big.me12.gradingsystem.GradingSystemPackage;
import ac.at.tuwien.big.me12.gradingsystem.Task;

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
 * An implementation of the model object '<em><b>Grading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradingImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradingImpl#getGradingScheme <em>Grading Scheme</em>}</li>
 *   <li>{@link ac.at.tuwien.big.me12.gradingsystem.impl.GradingImpl#getSemester <em>Semester</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradingImpl extends EObjectImpl implements Grading {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getGradingScheme() <em>Grading Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradingScheme()
	 * @generated
	 * @ordered
	 */
	protected GradingScheme gradingScheme;

	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMESTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected String semester = SEMESTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GradingSystemPackage.Literals.GRADING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, GradingSystemPackage.GRADING__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingScheme getGradingScheme() {
		return gradingScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGradingScheme(GradingScheme newGradingScheme, NotificationChain msgs) {
		GradingScheme oldGradingScheme = gradingScheme;
		gradingScheme = newGradingScheme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GradingSystemPackage.GRADING__GRADING_SCHEME, oldGradingScheme, newGradingScheme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradingScheme(GradingScheme newGradingScheme) {
		if (newGradingScheme != gradingScheme) {
			NotificationChain msgs = null;
			if (gradingScheme != null)
				msgs = ((InternalEObject)gradingScheme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GradingSystemPackage.GRADING__GRADING_SCHEME, null, msgs);
			if (newGradingScheme != null)
				msgs = ((InternalEObject)newGradingScheme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GradingSystemPackage.GRADING__GRADING_SCHEME, null, msgs);
			msgs = basicSetGradingScheme(newGradingScheme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradingSystemPackage.GRADING__GRADING_SCHEME, newGradingScheme, newGradingScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(String newSemester) {
		String oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradingSystemPackage.GRADING__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GradingSystemPackage.GRADING__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case GradingSystemPackage.GRADING__GRADING_SCHEME:
				return basicSetGradingScheme(null, msgs);
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
			case GradingSystemPackage.GRADING__TASKS:
				return getTasks();
			case GradingSystemPackage.GRADING__GRADING_SCHEME:
				return getGradingScheme();
			case GradingSystemPackage.GRADING__SEMESTER:
				return getSemester();
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
			case GradingSystemPackage.GRADING__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case GradingSystemPackage.GRADING__GRADING_SCHEME:
				setGradingScheme((GradingScheme)newValue);
				return;
			case GradingSystemPackage.GRADING__SEMESTER:
				setSemester((String)newValue);
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
			case GradingSystemPackage.GRADING__TASKS:
				getTasks().clear();
				return;
			case GradingSystemPackage.GRADING__GRADING_SCHEME:
				setGradingScheme((GradingScheme)null);
				return;
			case GradingSystemPackage.GRADING__SEMESTER:
				setSemester(SEMESTER_EDEFAULT);
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
			case GradingSystemPackage.GRADING__TASKS:
				return tasks != null && !tasks.isEmpty();
			case GradingSystemPackage.GRADING__GRADING_SCHEME:
				return gradingScheme != null;
			case GradingSystemPackage.GRADING__SEMESTER:
				return SEMESTER_EDEFAULT == null ? semester != null : !SEMESTER_EDEFAULT.equals(semester);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (semester: ");
		result.append(semester);
		result.append(')');
		return result.toString();
	}

} //GradingImpl
