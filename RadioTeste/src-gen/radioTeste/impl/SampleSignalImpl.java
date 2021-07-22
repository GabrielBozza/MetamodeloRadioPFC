/**
 */
package radioTeste.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import radioTeste.RadioTestePackage;
import radioTeste.SampleSignal;
import radioTeste.SampleValue;
import radioTeste.Security;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link radioTeste.impl.SampleSignalImpl#getSecuritylevel <em>Securitylevel</em>}</li>
 *   <li>{@link radioTeste.impl.SampleSignalImpl#getSampleValue <em>Sample Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SampleSignalImpl extends MinimalEObjectImpl.Container implements SampleSignal {
	/**
	 * The cached value of the '{@link #getSecuritylevel() <em>Securitylevel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritylevel()
	 * @generated
	 * @ordered
	 */
	protected Security securitylevel;

	/**
	 * The cached value of the '{@link #getSampleValue() <em>Sample Value</em>}' reference.
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
	protected SampleSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RadioTestePackage.Literals.SAMPLE_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security getSecuritylevel() {
		if (securitylevel != null && securitylevel.eIsProxy()) {
			InternalEObject oldSecuritylevel = (InternalEObject) securitylevel;
			securitylevel = (Security) eResolveProxy(oldSecuritylevel);
			if (securitylevel != oldSecuritylevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RadioTestePackage.SAMPLE_SIGNAL__SECURITYLEVEL, oldSecuritylevel, securitylevel));
			}
		}
		return securitylevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security basicGetSecuritylevel() {
		return securitylevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuritylevel(Security newSecuritylevel) {
		Security oldSecuritylevel = securitylevel;
		securitylevel = newSecuritylevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.SAMPLE_SIGNAL__SECURITYLEVEL,
					oldSecuritylevel, securitylevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleValue getSampleValue() {
		if (sampleValue != null && sampleValue.eIsProxy()) {
			InternalEObject oldSampleValue = (InternalEObject) sampleValue;
			sampleValue = (SampleValue) eResolveProxy(oldSampleValue);
			if (sampleValue != oldSampleValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RadioTestePackage.SAMPLE_SIGNAL__SAMPLE_VALUE, oldSampleValue, sampleValue));
			}
		}
		return sampleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleValue basicGetSampleValue() {
		return sampleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleValue(SampleValue newSampleValue) {
		SampleValue oldSampleValue = sampleValue;
		sampleValue = newSampleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RadioTestePackage.SAMPLE_SIGNAL__SAMPLE_VALUE,
					oldSampleValue, sampleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RadioTestePackage.SAMPLE_SIGNAL__SECURITYLEVEL:
			if (resolve)
				return getSecuritylevel();
			return basicGetSecuritylevel();
		case RadioTestePackage.SAMPLE_SIGNAL__SAMPLE_VALUE:
			if (resolve)
				return getSampleValue();
			return basicGetSampleValue();
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
		case RadioTestePackage.SAMPLE_SIGNAL__SECURITYLEVEL:
			setSecuritylevel((Security) newValue);
			return;
		case RadioTestePackage.SAMPLE_SIGNAL__SAMPLE_VALUE:
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
		case RadioTestePackage.SAMPLE_SIGNAL__SECURITYLEVEL:
			setSecuritylevel((Security) null);
			return;
		case RadioTestePackage.SAMPLE_SIGNAL__SAMPLE_VALUE:
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
		case RadioTestePackage.SAMPLE_SIGNAL__SECURITYLEVEL:
			return securitylevel != null;
		case RadioTestePackage.SAMPLE_SIGNAL__SAMPLE_VALUE:
			return sampleValue != null;
		}
		return super.eIsSet(featureID);
	}

} //SampleSignalImpl
