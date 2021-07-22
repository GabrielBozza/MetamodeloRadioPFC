/**
 */
package radioTeste.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import radioTeste.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RadioTesteFactoryImpl extends EFactoryImpl implements RadioTesteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RadioTesteFactory init() {
		try {
			RadioTesteFactory theRadioTesteFactory = (RadioTesteFactory) EPackage.Registry.INSTANCE
					.getEFactory(RadioTestePackage.eNS_URI);
			if (theRadioTesteFactory != null) {
				return theRadioTesteFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RadioTesteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioTesteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RadioTestePackage.LOG_ENTRY:
			return createLogEntry();
		case RadioTestePackage.TRANSCIEVER:
			return createTransciever();
		case RadioTestePackage.SAMPLE_SIGNAL:
			return createSampleSignal();
		case RadioTestePackage.LOG:
			return createLog();
		case RadioTestePackage.OP_ROLE:
			return createOpRole();
		case RadioTestePackage.CARRIER_FREQ:
			return createCarrierFreq();
		case RadioTestePackage.SECURITY:
			return createSecurity();
		case RadioTestePackage.SAMPLE_VALUE:
			return createSampleValue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RadioTestePackage.ORDER_TYPE:
			return createOrderTypeFromString(eDataType, initialValue);
		case RadioTestePackage.SECURITY_LEVEL:
			return createSecurityLevelFromString(eDataType, initialValue);
		case RadioTestePackage.CARRIER_FREQUENCY:
			return createCarrierFrequencyFromString(eDataType, initialValue);
		case RadioTestePackage.OPERATIONAL_ROLE:
			return createOperationalRoleFromString(eDataType, initialValue);
		case RadioTestePackage.SITUATION_MODE:
			return createSituationModeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RadioTestePackage.ORDER_TYPE:
			return convertOrderTypeToString(eDataType, instanceValue);
		case RadioTestePackage.SECURITY_LEVEL:
			return convertSecurityLevelToString(eDataType, instanceValue);
		case RadioTestePackage.CARRIER_FREQUENCY:
			return convertCarrierFrequencyToString(eDataType, instanceValue);
		case RadioTestePackage.OPERATIONAL_ROLE:
			return convertOperationalRoleToString(eDataType, instanceValue);
		case RadioTestePackage.SITUATION_MODE:
			return convertSituationModeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogEntry createLogEntry() {
		LogEntryImpl logEntry = new LogEntryImpl();
		return logEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transciever createTransciever() {
		TranscieverImpl transciever = new TranscieverImpl();
		return transciever;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleSignal createSampleSignal() {
		SampleSignalImpl sampleSignal = new SampleSignalImpl();
		return sampleSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log createLog() {
		LogImpl log = new LogImpl();
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRole createOpRole() {
		OpRoleImpl opRole = new OpRoleImpl();
		return opRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierFreq createCarrierFreq() {
		CarrierFreqImpl carrierFreq = new CarrierFreqImpl();
		return carrierFreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security createSecurity() {
		SecurityImpl security = new SecurityImpl();
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleValue createSampleValue() {
		SampleValueImpl sampleValue = new SampleValueImpl();
		return sampleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderTypeFromString(EDataType eDataType, String initialValue) {
		OrderType result = OrderType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel createSecurityLevelFromString(EDataType eDataType, String initialValue) {
		SecurityLevel result = SecurityLevel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierFrequency createCarrierFrequencyFromString(EDataType eDataType, String initialValue) {
		CarrierFrequency result = CarrierFrequency.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarrierFrequencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalRole createOperationalRoleFromString(EDataType eDataType, String initialValue) {
		OperationalRole result = OperationalRole.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationalRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationMode createSituationModeFromString(EDataType eDataType, String initialValue) {
		SituationMode result = SituationMode.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSituationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioTestePackage getRadioTestePackage() {
		return (RadioTestePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RadioTestePackage getPackage() {
		return RadioTestePackage.eINSTANCE;
	}

} //RadioTesteFactoryImpl
