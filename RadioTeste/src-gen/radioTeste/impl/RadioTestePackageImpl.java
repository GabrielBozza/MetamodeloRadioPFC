/**
 */
package radioTeste.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import radioTeste.CarrierFreq;
import radioTeste.CarrierFrequency;
import radioTeste.Log;
import radioTeste.LogEntry;
import radioTeste.OpRole;
import radioTeste.OperationalRole;
import radioTeste.OrderType;
import radioTeste.RadioTesteFactory;
import radioTeste.RadioTestePackage;
import radioTeste.SampleSignal;
import radioTeste.SampleValue;
import radioTeste.Security;
import radioTeste.SecurityLevel;
import radioTeste.SituationMode;
import radioTeste.Transciever;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RadioTestePackageImpl extends EPackageImpl implements RadioTestePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transcieverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierFreqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carrierFrequencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationalRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum situationModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see radioTeste.RadioTestePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RadioTestePackageImpl() {
		super(eNS_URI, RadioTesteFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RadioTestePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RadioTestePackage init() {
		if (isInited)
			return (RadioTestePackage) EPackage.Registry.INSTANCE.getEPackage(RadioTestePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRadioTestePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RadioTestePackageImpl theRadioTestePackage = registeredRadioTestePackage instanceof RadioTestePackageImpl
				? (RadioTestePackageImpl) registeredRadioTestePackage
				: new RadioTestePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRadioTestePackage.createPackageContents();

		// Initialize created meta-data
		theRadioTestePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRadioTestePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RadioTestePackage.eNS_URI, theRadioTestePackage);
		return theRadioTestePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogEntry() {
		return logEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogEntry_Signal() {
		return (EReference) logEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogEntry_TimeStamp() {
		return (EAttribute) logEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogEntry_Carrierfreq() {
		return (EReference) logEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogEntry_Oprole() {
		return (EReference) logEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogEntry_SecurityLevel() {
		return (EReference) logEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogEntry_SampleValue() {
		return (EReference) logEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransciever() {
		return transcieverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransciever_Id() {
		return (EAttribute) transcieverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransciever_Carrierfreq() {
		return (EReference) transcieverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransciever_Oprole() {
		return (EReference) transcieverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransciever_Mode() {
		return (EAttribute) transcieverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransciever_Perceives() {
		return (EReference) transcieverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransciever_Log() {
		return (EReference) transcieverEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleSignal() {
		return sampleSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampleSignal_Securitylevel() {
		return (EReference) sampleSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampleSignal_SampleValue() {
		return (EReference) sampleSignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLog() {
		return logEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLog_LogData() {
		return (EReference) logEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLog_Transciever() {
		return (EReference) logEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpRole() {
		return opRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpRole_Role() {
		return (EAttribute) opRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarrierFreq() {
		return carrierFreqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarrierFreq_Value() {
		return (EAttribute) carrierFreqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurity_SecLevel() {
		return (EAttribute) securityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleValue() {
		return sampleValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleValue_Value() {
		return (EAttribute) sampleValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderType() {
		return orderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecurityLevel() {
		return securityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarrierFrequency() {
		return carrierFrequencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationalRole() {
		return operationalRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSituationMode() {
		return situationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioTesteFactory getRadioTesteFactory() {
		return (RadioTesteFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		logEntryEClass = createEClass(LOG_ENTRY);
		createEReference(logEntryEClass, LOG_ENTRY__SIGNAL);
		createEAttribute(logEntryEClass, LOG_ENTRY__TIME_STAMP);
		createEReference(logEntryEClass, LOG_ENTRY__CARRIERFREQ);
		createEReference(logEntryEClass, LOG_ENTRY__OPROLE);
		createEReference(logEntryEClass, LOG_ENTRY__SECURITY_LEVEL);
		createEReference(logEntryEClass, LOG_ENTRY__SAMPLE_VALUE);

		transcieverEClass = createEClass(TRANSCIEVER);
		createEAttribute(transcieverEClass, TRANSCIEVER__ID);
		createEReference(transcieverEClass, TRANSCIEVER__CARRIERFREQ);
		createEReference(transcieverEClass, TRANSCIEVER__OPROLE);
		createEAttribute(transcieverEClass, TRANSCIEVER__MODE);
		createEReference(transcieverEClass, TRANSCIEVER__PERCEIVES);
		createEReference(transcieverEClass, TRANSCIEVER__LOG);

		sampleSignalEClass = createEClass(SAMPLE_SIGNAL);
		createEReference(sampleSignalEClass, SAMPLE_SIGNAL__SECURITYLEVEL);
		createEReference(sampleSignalEClass, SAMPLE_SIGNAL__SAMPLE_VALUE);

		logEClass = createEClass(LOG);
		createEReference(logEClass, LOG__LOG_DATA);
		createEReference(logEClass, LOG__TRANSCIEVER);

		opRoleEClass = createEClass(OP_ROLE);
		createEAttribute(opRoleEClass, OP_ROLE__ROLE);

		carrierFreqEClass = createEClass(CARRIER_FREQ);
		createEAttribute(carrierFreqEClass, CARRIER_FREQ__VALUE);

		securityEClass = createEClass(SECURITY);
		createEAttribute(securityEClass, SECURITY__SEC_LEVEL);

		sampleValueEClass = createEClass(SAMPLE_VALUE);
		createEAttribute(sampleValueEClass, SAMPLE_VALUE__VALUE);

		// Create enums
		orderTypeEEnum = createEEnum(ORDER_TYPE);
		securityLevelEEnum = createEEnum(SECURITY_LEVEL);
		carrierFrequencyEEnum = createEEnum(CARRIER_FREQUENCY);
		operationalRoleEEnum = createEEnum(OPERATIONAL_ROLE);
		situationModeEEnum = createEEnum(SITUATION_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(logEntryEClass, LogEntry.class, "LogEntry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogEntry_Signal(), this.getSampleSignal(), null, "signal", null, 1, 1, LogEntry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogEntry_TimeStamp(), theXMLTypePackage.getTime(), "TimeStamp", null, 0, 1, LogEntry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogEntry_Carrierfreq(), this.getCarrierFreq(), null, "carrierfreq", null, 1, 1,
				LogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogEntry_Oprole(), this.getOpRole(), null, "oprole", null, 1, 1, LogEntry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogEntry_SecurityLevel(), this.getSecurity(), null, "securityLevel", null, 1, 1,
				LogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogEntry_SampleValue(), this.getSampleValue(), null, "SampleValue", null, 1, 1,
				LogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transcieverEClass, Transciever.class, "Transciever", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransciever_Id(), ecorePackage.getEString(), "id", null, 0, 1, Transciever.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransciever_Carrierfreq(), this.getCarrierFreq(), null, "carrierfreq", null, 0, 1,
				Transciever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransciever_Oprole(), this.getOpRole(), null, "oprole", null, 0, 1, Transciever.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransciever_Mode(), this.getSituationMode(), "Mode", "SILENCE", 0, 1, Transciever.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransciever_Perceives(), this.getSampleSignal(), null, "perceives", null, 0, 1,
				Transciever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransciever_Log(), this.getLog(), this.getLog_Transciever(), "log", null, 0, 1,
				Transciever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampleSignalEClass, SampleSignal.class, "SampleSignal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSampleSignal_Securitylevel(), this.getSecurity(), null, "securitylevel", null, 0, 1,
				SampleSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampleSignal_SampleValue(), this.getSampleValue(), null, "SampleValue", null, 1, 1,
				SampleSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logEClass, Log.class, "Log", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLog_LogData(), this.getLogEntry(), null, "logData", null, 0, -1, Log.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLog_Transciever(), this.getTransciever(), this.getTransciever_Log(), "transciever", null, 0,
				1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opRoleEClass, OpRole.class, "OpRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpRole_Role(), this.getOperationalRole(), "Role", "Soldier", 0, 1, OpRole.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierFreqEClass, CarrierFreq.class, "CarrierFreq", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarrierFreq_Value(), this.getCarrierFrequency(), "Value", "A", 0, 1, CarrierFreq.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityEClass, Security.class, "Security", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurity_SecLevel(), this.getSecurityLevel(), "SecLevel", "Low", 0, 1, Security.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampleValueEClass, SampleValue.class, "SampleValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampleValue_Value(), theXMLTypePackage.getDouble(), "Value", null, 0, 1, SampleValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(orderTypeEEnum, OrderType.class, "OrderType");
		addEEnumLiteral(orderTypeEEnum, OrderType.ASC);
		addEEnumLiteral(orderTypeEEnum, OrderType.DESC);

		initEEnum(securityLevelEEnum, SecurityLevel.class, "SecurityLevel");
		addEEnumLiteral(securityLevelEEnum, SecurityLevel.LOW);
		addEEnumLiteral(securityLevelEEnum, SecurityLevel.HIGH);

		initEEnum(carrierFrequencyEEnum, CarrierFrequency.class, "CarrierFrequency");
		addEEnumLiteral(carrierFrequencyEEnum, CarrierFrequency.A);
		addEEnumLiteral(carrierFrequencyEEnum, CarrierFrequency.B);

		initEEnum(operationalRoleEEnum, OperationalRole.class, "OperationalRole");
		addEEnumLiteral(operationalRoleEEnum, OperationalRole.CMD);
		addEEnumLiteral(operationalRoleEEnum, OperationalRole.SOLDIER);

		initEEnum(situationModeEEnum, SituationMode.class, "SituationMode");
		addEEnumLiteral(situationModeEEnum, SituationMode.SILENCE);
		addEEnumLiteral(situationModeEEnum, SituationMode.TALK);
		addEEnumLiteral(situationModeEEnum, SituationMode.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

	@Override
	public EReference getOpRole_Logentry() {
		// TODO Auto-generated method stub
		return null;
	}

} //RadioTestePackageImpl
