/**
 */
package radioTeste.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import radioTeste.CarrierFreq;
import radioTeste.Log;
import radioTeste.OpRole;
import radioTeste.RadioTestePackage;
import radioTeste.SampleSignal;
import radioTeste.SituationMode;
import radioTeste.Transciever;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transciever</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link radioTeste.impl.TranscieverImpl#getId <em>Id</em>}</li>
 *   <li>{@link radioTeste.impl.TranscieverImpl#getCarrierfreq <em>Carrierfreq</em>}</li>
 *   <li>{@link radioTeste.impl.TranscieverImpl#getOprole <em>Oprole</em>}</li>
 *   <li>{@link radioTeste.impl.TranscieverImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link radioTeste.impl.TranscieverImpl#getPerceives <em>Perceives</em>}</li>
 *   <li>{@link radioTeste.impl.TranscieverImpl#getLog <em>Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TranscieverImpl extends MinimalEObjectImpl.Container implements Transciever {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCarrierfreq() <em>Carrierfreq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierfreq()
	 * @generated
	 * @ordered
	 */
	protected CarrierFreq carrierfreq;

	/**
	 * The cached value of the '{@link #getOprole() <em>Oprole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOprole()
	 * @generated
	 * @ordered
	 */
	protected OpRole oprole;

	/**
	 * The cached setting delegate for the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MODE__ESETTING_DELEGATE = ((EStructuralFeature.Internal) RadioTestePackage.Literals.TRANSCIEVER__MODE)
			.getSettingDelegate();

	/**
	 * The cached value of the '{@link #getPerceives() <em>Perceives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerceives()
	 * @generated
	 * @ordered
	 */
	protected SampleSignal perceives;

	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected Log log;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranscieverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RadioTestePackage.Literals.TRANSCIEVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.TRANSCIEVER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierFreq getCarrierfreq() {
		if (carrierfreq != null && carrierfreq.eIsProxy()) {
			InternalEObject oldCarrierfreq = (InternalEObject) carrierfreq;
			carrierfreq = (CarrierFreq) eResolveProxy(oldCarrierfreq);
			if (carrierfreq != oldCarrierfreq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RadioTestePackage.TRANSCIEVER__CARRIERFREQ, oldCarrierfreq, carrierfreq));
			}
		}
		return carrierfreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierFreq basicGetCarrierfreq() {
		return carrierfreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierfreq(CarrierFreq newCarrierfreq) {
		CarrierFreq oldCarrierfreq = carrierfreq;
		carrierfreq = newCarrierfreq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.TRANSCIEVER__CARRIERFREQ,
					oldCarrierfreq, carrierfreq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRole getOprole() {
		if (oprole != null && oprole.eIsProxy()) {
			InternalEObject oldOprole = (InternalEObject) oprole;
			oprole = (OpRole) eResolveProxy(oldOprole);
			if (oprole != oldOprole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadioTestePackage.TRANSCIEVER__OPROLE,
							oldOprole, oprole));
			}
		}
		return oprole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRole basicGetOprole() {
		return oprole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOprole(OpRole newOprole) {
		OpRole oldOprole = oprole;
		oprole = newOprole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.TRANSCIEVER__OPROLE, oldOprole,
					oprole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationMode getMode() {
		return (SituationMode) MODE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(SituationMode newMode) {
		MODE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleSignal getPerceives() {
		if (perceives != null && perceives.eIsProxy()) {
			InternalEObject oldPerceives = (InternalEObject) perceives;
			perceives = (SampleSignal) eResolveProxy(oldPerceives);
			if (perceives != oldPerceives) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadioTestePackage.TRANSCIEVER__PERCEIVES,
							oldPerceives, perceives));
			}
		}
		return perceives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleSignal basicGetPerceives() {
		return perceives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerceives(SampleSignal newPerceives) {
		SampleSignal oldPerceives = perceives;
		perceives = newPerceives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.TRANSCIEVER__PERCEIVES,
					oldPerceives, perceives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log getLog() {
		if (log != null && log.eIsProxy()) {
			InternalEObject oldLog = (InternalEObject) log;
			log = (Log) eResolveProxy(oldLog);
			if (log != oldLog) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadioTestePackage.TRANSCIEVER__LOG,
							oldLog, log));
			}
		}
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log basicGetLog() {
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLog(Log newLog, NotificationChain msgs) {
		Log oldLog = log;
		log = newLog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RadioTestePackage.TRANSCIEVER__LOG, oldLog, newLog);
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
	public void setLog(Log newLog) {
		if (newLog != log) {
			NotificationChain msgs = null;
			if (log != null)
				msgs = ((InternalEObject) log).eInverseRemove(this, RadioTestePackage.LOG__TRANSCIEVER, Log.class,
						msgs);
			if (newLog != null)
				msgs = ((InternalEObject) newLog).eInverseAdd(this, RadioTestePackage.LOG__TRANSCIEVER, Log.class,
						msgs);
			msgs = basicSetLog(newLog, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.TRANSCIEVER__LOG, newLog, newLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RadioTestePackage.TRANSCIEVER__LOG:
			if (log != null)
				msgs = ((InternalEObject) log).eInverseRemove(this, RadioTestePackage.LOG__TRANSCIEVER, Log.class,
						msgs);
			return basicSetLog((Log) otherEnd, msgs);
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
		case RadioTestePackage.TRANSCIEVER__LOG:
			return basicSetLog(null, msgs);
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
		case RadioTestePackage.TRANSCIEVER__ID:
			return getId();
		case RadioTestePackage.TRANSCIEVER__CARRIERFREQ:
			if (resolve)
				return getCarrierfreq();
			return basicGetCarrierfreq();
		case RadioTestePackage.TRANSCIEVER__OPROLE:
			if (resolve)
				return getOprole();
			return basicGetOprole();
		case RadioTestePackage.TRANSCIEVER__MODE:
			return getMode();
		case RadioTestePackage.TRANSCIEVER__PERCEIVES:
			if (resolve)
				return getPerceives();
			return basicGetPerceives();
		case RadioTestePackage.TRANSCIEVER__LOG:
			if (resolve)
				return getLog();
			return basicGetLog();
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
		case RadioTestePackage.TRANSCIEVER__ID:
			setId((String) newValue);
			return;
		case RadioTestePackage.TRANSCIEVER__CARRIERFREQ:
			setCarrierfreq((CarrierFreq) newValue);
			return;
		case RadioTestePackage.TRANSCIEVER__OPROLE:
			setOprole((OpRole) newValue);
			return;
		case RadioTestePackage.TRANSCIEVER__MODE:
			setMode((SituationMode) newValue);
			return;
		case RadioTestePackage.TRANSCIEVER__PERCEIVES:
			setPerceives((SampleSignal) newValue);
			return;
		case RadioTestePackage.TRANSCIEVER__LOG:
			setLog((Log) newValue);
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
		case RadioTestePackage.TRANSCIEVER__ID:
			setId(ID_EDEFAULT);
			return;
		case RadioTestePackage.TRANSCIEVER__CARRIERFREQ:
			setCarrierfreq((CarrierFreq) null);
			return;
		case RadioTestePackage.TRANSCIEVER__OPROLE:
			setOprole((OpRole) null);
			return;
		case RadioTestePackage.TRANSCIEVER__MODE:
			MODE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
			return;
		case RadioTestePackage.TRANSCIEVER__PERCEIVES:
			setPerceives((SampleSignal) null);
			return;
		case RadioTestePackage.TRANSCIEVER__LOG:
			setLog((Log) null);
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
		case RadioTestePackage.TRANSCIEVER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case RadioTestePackage.TRANSCIEVER__CARRIERFREQ:
			return carrierfreq != null;
		case RadioTestePackage.TRANSCIEVER__OPROLE:
			return oprole != null;
		case RadioTestePackage.TRANSCIEVER__MODE:
			return MODE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case RadioTestePackage.TRANSCIEVER__PERCEIVES:
			return perceives != null;
		case RadioTestePackage.TRANSCIEVER__LOG:
			return log != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TranscieverImpl
