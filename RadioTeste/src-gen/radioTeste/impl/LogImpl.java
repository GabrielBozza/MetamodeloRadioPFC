/**
 */
package radioTeste.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import radioTeste.Log;
import radioTeste.LogEntry;
import radioTeste.RadioTestePackage;
import radioTeste.Transciever;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link radioTeste.impl.LogImpl#getLogData <em>Log Data</em>}</li>
 *   <li>{@link radioTeste.impl.LogImpl#getTransciever <em>Transciever</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogImpl extends MinimalEObjectImpl.Container implements Log {
	/**
	 * The cached value of the '{@link #getLogData() <em>Log Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogData()
	 * @generated
	 * @ordered
	 */
	protected EList<LogEntry> logData;

	/**
	 * The cached value of the '{@link #getTransciever() <em>Transciever</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransciever()
	 * @generated
	 * @ordered
	 */
	protected Transciever transciever;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RadioTestePackage.Literals.LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogEntry> getLogData() {
		if (logData == null) {
			logData = new EObjectContainmentEList<LogEntry>(LogEntry.class, this, RadioTestePackage.LOG__LOG_DATA);
		}
		return logData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transciever getTransciever() {
		if (transciever != null && transciever.eIsProxy()) {
			InternalEObject oldTransciever = (InternalEObject) transciever;
			transciever = (Transciever) eResolveProxy(oldTransciever);
			if (transciever != oldTransciever) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadioTestePackage.LOG__TRANSCIEVER,
							oldTransciever, transciever));
			}
		}
		return transciever;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transciever basicGetTransciever() {
		return transciever;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransciever(Transciever newTransciever, NotificationChain msgs) {
		Transciever oldTransciever = transciever;
		transciever = newTransciever;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RadioTestePackage.LOG__TRANSCIEVER, oldTransciever, newTransciever);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransciever(Transciever newTransciever) {
		if (newTransciever != transciever) {
			NotificationChain msgs = null;
			if (transciever != null)
				msgs = ((InternalEObject) transciever).eInverseRemove(this, RadioTestePackage.TRANSCIEVER__LOG,
						Transciever.class, msgs);
			if (newTransciever != null)
				msgs = ((InternalEObject) newTransciever).eInverseAdd(this, RadioTestePackage.TRANSCIEVER__LOG,
						Transciever.class, msgs);
			msgs = basicSetTransciever(newTransciever, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.LOG__TRANSCIEVER, newTransciever,
					newTransciever));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RadioTestePackage.LOG__TRANSCIEVER:
			if (transciever != null)
				msgs = ((InternalEObject) transciever).eInverseRemove(this, RadioTestePackage.TRANSCIEVER__LOG,
						Transciever.class, msgs);
			return basicSetTransciever((Transciever) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RadioTestePackage.LOG__LOG_DATA:
			return ((InternalEList<?>) getLogData()).basicRemove(otherEnd, msgs);
		case RadioTestePackage.LOG__TRANSCIEVER:
			return basicSetTransciever(null, msgs);
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
		case RadioTestePackage.LOG__LOG_DATA:
			return getLogData();
		case RadioTestePackage.LOG__TRANSCIEVER:
			if (resolve)
				return getTransciever();
			return basicGetTransciever();
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
		case RadioTestePackage.LOG__LOG_DATA:
			getLogData().clear();
			getLogData().addAll((Collection<? extends LogEntry>) newValue);
			return;
		case RadioTestePackage.LOG__TRANSCIEVER:
			setTransciever((Transciever) newValue);
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
		case RadioTestePackage.LOG__LOG_DATA:
			getLogData().clear();
			return;
		case RadioTestePackage.LOG__TRANSCIEVER:
			setTransciever((Transciever) null);
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
		case RadioTestePackage.LOG__LOG_DATA:
			return logData != null && !logData.isEmpty();
		case RadioTestePackage.LOG__TRANSCIEVER:
			return transciever != null;
		}
		return super.eIsSet(featureID);
	}

} //LogImpl
