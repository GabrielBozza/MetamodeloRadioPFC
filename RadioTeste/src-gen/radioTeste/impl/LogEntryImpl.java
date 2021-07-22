/**
 */
package radioTeste.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import radioTeste.CarrierFreq;
import radioTeste.LogEntry;
import radioTeste.OpRole;
import radioTeste.RadioTestePackage;
import radioTeste.SampleSignal;
import radioTeste.SampleValue;
import radioTeste.Security;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link radioTeste.impl.LogEntryImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link radioTeste.impl.LogEntryImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link radioTeste.impl.LogEntryImpl#getCarrierfreq <em>Carrierfreq</em>}</li>
 *   <li>{@link radioTeste.impl.LogEntryImpl#getOprole <em>Oprole</em>}</li>
 *   <li>{@link radioTeste.impl.LogEntryImpl#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link radioTeste.impl.LogEntryImpl#getSampleValue <em>Sample Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogEntryImpl extends MinimalEObjectImpl.Container implements LogEntry {
	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected SampleSignal signal;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_STAMP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected int timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCarrierfreq() <em>Carrierfreq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierfreq()
	 * @generated
	 * @ordered
	 */
	protected CarrierFreq carrierfreq;

	/**
	 * The cached value of the '{@link #getOprole() <em>Oprole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOprole()
	 * @generated
	 * @ordered
	 */
	protected OpRole oprole;

	/**
	 * The cached value of the '{@link #getSecurityLevel() <em>Security Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected Security securityLevel;

	/**
	 * The cached value of the '{@link #getSampleValue() <em>Sample Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleValue()
	 * @generated
	 * @ordered
	 */
	protected SampleValue sampleValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RadioTestePackage.Literals.LOG_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleSignal getSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignal(SampleSignal newSignal, NotificationChain msgs) {
		SampleSignal oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RadioTestePackage.LOG_ENTRY__SIGNAL, oldSignal, newSignal);
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
	public void setSignal(SampleSignal newSignal) {
		if (newSignal != signal) {
			NotificationChain msgs = null;
			if (signal != null)
				msgs = ((InternalEObject) signal).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RadioTestePackage.LOG_ENTRY__SIGNAL, null, msgs);
			if (newSignal != null)
				msgs = ((InternalEObject) newSignal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RadioTestePackage.LOG_ENTRY__SIGNAL, null, msgs);
			msgs = basicSetSignal(newSignal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.LOG_ENTRY__SIGNAL, newSignal,
					newSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(int newTimeStamp) {
		int oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.LOG_ENTRY__TIME_STAMP, oldTimeStamp,
					timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierFreq getCarrierfreq() {
		return carrierfreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarrierfreq(CarrierFreq newCarrierfreq, NotificationChain msgs) {
		CarrierFreq oldCarrierfreq = carrierfreq;
		carrierfreq = newCarrierfreq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RadioTestePackage.LOG_ENTRY__CARRIERFREQ, oldCarrierfreq, newCarrierfreq);
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
	public void setCarrierfreq(CarrierFreq newCarrierfreq) {
		if (newCarrierfreq != carrierfreq) {
			NotificationChain msgs = null;
			if (carrierfreq != null)
				msgs = ((InternalEObject) carrierfreq).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RadioTestePackage.LOG_ENTRY__CARRIERFREQ, null, msgs);
			if (newCarrierfreq != null)
				msgs = ((InternalEObject) newCarrierfreq).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RadioTestePackage.LOG_ENTRY__CARRIERFREQ, null, msgs);
			msgs = basicSetCarrierfreq(newCarrierfreq, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.LOG_ENTRY__CARRIERFREQ,
					newCarrierfreq, newCarrierfreq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRole getOprole() {
		return oprole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOprole(OpRole newOprole, NotificationChain msgs) {
		OpRole oldOprole = oprole;
		oprole = newOprole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RadioTestePackage.LOG_ENTRY__OPROLE, oldOprole, newOprole);
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
	public void setOprole(OpRole newOprole) {
		if (newOprole != oprole) {
			NotificationChain msgs = null;
			if (oprole != null)
				msgs = ((InternalEObject) oprole).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RadioTestePackage.LOG_ENTRY__OPROLE, null, msgs);
			if (newOprole != null)
				msgs = ((InternalEObject) newOprole).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RadioTestePackage.LOG_ENTRY__OPROLE, null, msgs);
			msgs = basicSetOprole(newOprole, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.LOG_ENTRY__OPROLE, newOprole,
					newOprole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security getSecurityLevel() {
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityLevel(Security newSecurityLevel, NotificationChain msgs) {
		Security oldSecurityLevel = securityLevel;
		securityLevel = newSecurityLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RadioTestePackage.LOG_ENTRY__SECURITY_LEVEL, oldSecurityLevel, newSecurityLevel);
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
	public void setSecurityLevel(Security newSecurityLevel) {
		if (newSecurityLevel != securityLevel) {
			NotificationChain msgs = null;
			if (securityLevel != null)
				msgs = ((InternalEObject) securityLevel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RadioTestePackage.LOG_ENTRY__SECURITY_LEVEL, null, msgs);
			if (newSecurityLevel != null)
				msgs = ((InternalEObject) newSecurityLevel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RadioTestePackage.LOG_ENTRY__SECURITY_LEVEL, null, msgs);
			msgs = basicSetSecurityLevel(newSecurityLevel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.LOG_ENTRY__SECURITY_LEVEL,
					newSecurityLevel, newSecurityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleValue getSampleValue() {
		return sampleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSampleValue(SampleValue newSampleValue, NotificationChain msgs) {
		SampleValue oldSampleValue = sampleValue;
		sampleValue = newSampleValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RadioTestePackage.LOG_ENTRY__SAMPLE_VALUE, oldSampleValue, newSampleValue);
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
	public void setSampleValue(SampleValue newSampleValue) {
		if (newSampleValue != sampleValue) {
			NotificationChain msgs = null;
			if (sampleValue != null)
				msgs = ((InternalEObject) sampleValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RadioTestePackage.LOG_ENTRY__SAMPLE_VALUE, null, msgs);
			if (newSampleValue != null)
				msgs = ((InternalEObject) newSampleValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RadioTestePackage.LOG_ENTRY__SAMPLE_VALUE, null, msgs);
			msgs = basicSetSampleValue(newSampleValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.LOG_ENTRY__SAMPLE_VALUE,
					newSampleValue, newSampleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RadioTestePackage.LOG_ENTRY__SIGNAL:
			return basicSetSignal(null, msgs);
		case RadioTestePackage.LOG_ENTRY__CARRIERFREQ:
			return basicSetCarrierfreq(null, msgs);
		case RadioTestePackage.LOG_ENTRY__OPROLE:
			return basicSetOprole(null, msgs);
		case RadioTestePackage.LOG_ENTRY__SECURITY_LEVEL:
			return basicSetSecurityLevel(null, msgs);
		case RadioTestePackage.LOG_ENTRY__SAMPLE_VALUE:
			return basicSetSampleValue(null, msgs);
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
		case RadioTestePackage.LOG_ENTRY__SIGNAL:
			return getSignal();
		case RadioTestePackage.LOG_ENTRY__TIME_STAMP:
			return getTimeStamp();
		case RadioTestePackage.LOG_ENTRY__CARRIERFREQ:
			return getCarrierfreq();
		case RadioTestePackage.LOG_ENTRY__OPROLE:
			return getOprole();
		case RadioTestePackage.LOG_ENTRY__SECURITY_LEVEL:
			return getSecurityLevel();
		case RadioTestePackage.LOG_ENTRY__SAMPLE_VALUE:
			return getSampleValue();
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
		case RadioTestePackage.LOG_ENTRY__SIGNAL:
			setSignal((SampleSignal) newValue);
			return;
		case RadioTestePackage.LOG_ENTRY__TIME_STAMP:
			setTimeStamp((Integer) newValue);
			return;
		case RadioTestePackage.LOG_ENTRY__CARRIERFREQ:
			setCarrierfreq((CarrierFreq) newValue);
			return;
		case RadioTestePackage.LOG_ENTRY__OPROLE:
			setOprole((OpRole) newValue);
			return;
		case RadioTestePackage.LOG_ENTRY__SECURITY_LEVEL:
			setSecurityLevel((Security) newValue);
			return;
		case RadioTestePackage.LOG_ENTRY__SAMPLE_VALUE:
			setSampleValue((SampleValue) newValue);
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
		case RadioTestePackage.LOG_ENTRY__SIGNAL:
			setSignal((SampleSignal) null);
			return;
		case RadioTestePackage.LOG_ENTRY__TIME_STAMP:
			setTimeStamp(TIME_STAMP_EDEFAULT);
			return;
		case RadioTestePackage.LOG_ENTRY__CARRIERFREQ:
			setCarrierfreq((CarrierFreq) null);
			return;
		case RadioTestePackage.LOG_ENTRY__OPROLE:
			setOprole((OpRole) null);
			return;
		case RadioTestePackage.LOG_ENTRY__SECURITY_LEVEL:
			setSecurityLevel((Security) null);
			return;
		case RadioTestePackage.LOG_ENTRY__SAMPLE_VALUE:
			setSampleValue((SampleValue) null);
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
		case RadioTestePackage.LOG_ENTRY__SIGNAL:
			return signal != null;
		case RadioTestePackage.LOG_ENTRY__TIME_STAMP:
			return timeStamp != TIME_STAMP_EDEFAULT;
		case RadioTestePackage.LOG_ENTRY__CARRIERFREQ:
			return carrierfreq != null;
		case RadioTestePackage.LOG_ENTRY__OPROLE:
			return oprole != null;
		case RadioTestePackage.LOG_ENTRY__SECURITY_LEVEL:
			return securityLevel != null;
		case RadioTestePackage.LOG_ENTRY__SAMPLE_VALUE:
			return sampleValue != null;
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
		result.append(" (TimeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

} //LogEntryImpl
