/**
 */
package radioTeste.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import radioTeste.LogEntry;
import radioTeste.OpRole;
import radioTeste.OperationalRole;
import radioTeste.RadioTestePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link radioTeste.impl.OpRoleImpl#getRole <em>Role</em>}</li>
 *   <li>{@link radioTeste.impl.OpRoleImpl#getLogentry <em>Logentry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpRoleImpl extends MinimalEObjectImpl.Container implements OpRole {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final OperationalRole ROLE_EDEFAULT = OperationalRole.SOLDIER;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected OperationalRole role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogentry() <em>Logentry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogentry()
	 * @generated
	 * @ordered
	 */
	protected LogEntry logentry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RadioTestePackage.Literals.OP_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(OperationalRole newRole) {
		OperationalRole oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.OP_ROLE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogEntry getLogentry() {
		if (logentry != null && logentry.eIsProxy()) {
			InternalEObject oldLogentry = (InternalEObject) logentry;
			logentry = (LogEntry) eResolveProxy(oldLogentry);
			if (logentry != oldLogentry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadioTestePackage.OP_ROLE__LOGENTRY,
							oldLogentry, logentry));
			}
		}
		return logentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogEntry basicGetLogentry() {
		return logentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogentry(LogEntry newLogentry) {
		LogEntry oldLogentry = logentry;
		logentry = newLogentry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.OP_ROLE__LOGENTRY, oldLogentry,
					logentry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RadioTestePackage.OP_ROLE__ROLE:
			return getRole();
		case RadioTestePackage.OP_ROLE__LOGENTRY:
			if (resolve)
				return getLogentry();
			return basicGetLogentry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RadioTestePackage.OP_ROLE__ROLE:
			setRole((OperationalRole) newValue);
			return;
		case RadioTestePackage.OP_ROLE__LOGENTRY:
			setLogentry((LogEntry) newValue);
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
		case RadioTestePackage.OP_ROLE__ROLE:
			setRole(ROLE_EDEFAULT);
			return;
		case RadioTestePackage.OP_ROLE__LOGENTRY:
			setLogentry((LogEntry) null);
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
		case RadioTestePackage.OP_ROLE__ROLE:
			return role != ROLE_EDEFAULT;
		case RadioTestePackage.OP_ROLE__LOGENTRY:
			return logentry != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //OpRoleImpl
