/**
 */
package radioTeste;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see radioTeste.RadioTesteFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RadioTestePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "radioTeste";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/radioTeste";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "radioTeste";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RadioTestePackage eINSTANCE = radioTeste.impl.RadioTestePackageImpl.init();

	/**
	 * The meta object id for the '{@link radioTeste.impl.LogEntryImpl <em>Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.impl.LogEntryImpl
	 * @see radioTeste.impl.RadioTestePackageImpl#getLogEntry()
	 * @generated
	 */
	int LOG_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__SIGNAL = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__TIME_STAMP = 1;

	/**
	 * The feature id for the '<em><b>Carrierfreq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__CARRIERFREQ = 2;

	/**
	 * The feature id for the '<em><b>Oprole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__OPROLE = 3;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__SECURITY_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Sample Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__SAMPLE_VALUE = 5;

	/**
	 * The number of structural features of the '<em>Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link radioTeste.impl.TranscieverImpl <em>Transciever</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.impl.TranscieverImpl
	 * @see radioTeste.impl.RadioTestePackageImpl#getTransciever()
	 * @generated
	 */
	int TRANSCIEVER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCIEVER__ID = 0;

	/**
	 * The feature id for the '<em><b>Carrierfreq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCIEVER__CARRIERFREQ = 1;

	/**
	 * The feature id for the '<em><b>Oprole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCIEVER__OPROLE = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCIEVER__MODE = 3;

	/**
	 * The feature id for the '<em><b>Perceives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCIEVER__PERCEIVES = 4;

	/**
	 * The feature id for the '<em><b>Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCIEVER__LOG = 5;

	/**
	 * The number of structural features of the '<em>Transciever</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCIEVER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Transciever</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCIEVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link radioTeste.impl.SampleSignalImpl <em>Sample Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.impl.SampleSignalImpl
	 * @see radioTeste.impl.RadioTestePackageImpl#getSampleSignal()
	 * @generated
	 */
	int SAMPLE_SIGNAL = 2;

	/**
	 * The feature id for the '<em><b>Securitylevel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_SIGNAL__SECURITYLEVEL = 0;

	/**
	 * The feature id for the '<em><b>Sample Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_SIGNAL__SAMPLE_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Sample Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_SIGNAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sample Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_SIGNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link radioTeste.impl.LogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.impl.LogImpl
	 * @see radioTeste.impl.RadioTestePackageImpl#getLog()
	 * @generated
	 */
	int LOG = 3;

	/**
	 * The feature id for the '<em><b>Log Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LOG_DATA = 0;

	/**
	 * The feature id for the '<em><b>Transciever</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__TRANSCIEVER = 1;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link radioTeste.impl.OpRoleImpl <em>Op Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.impl.OpRoleImpl
	 * @see radioTeste.impl.RadioTestePackageImpl#getOpRole()
	 * @generated
	 */
	int OP_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_ROLE__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Logentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_ROLE__LOGENTRY = 1;

	/**
	 * The number of structural features of the '<em>Op Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Op Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link radioTeste.impl.CarrierFreqImpl <em>Carrier Freq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.impl.CarrierFreqImpl
	 * @see radioTeste.impl.RadioTestePackageImpl#getCarrierFreq()
	 * @generated
	 */
	int CARRIER_FREQ = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_FREQ__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Carrier Freq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_FREQ_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Carrier Freq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_FREQ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link radioTeste.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.impl.SecurityImpl
	 * @see radioTeste.impl.RadioTestePackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 6;

	/**
	 * The feature id for the '<em><b>Sec Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__SEC_LEVEL = 0;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link radioTeste.impl.SampleValueImpl <em>Sample Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.impl.SampleValueImpl
	 * @see radioTeste.impl.RadioTestePackageImpl#getSampleValue()
	 * @generated
	 */
	int SAMPLE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Sample Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sample Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link radioTeste.OrderType <em>Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.OrderType
	 * @see radioTeste.impl.RadioTestePackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 8;

	/**
	 * The meta object id for the '{@link radioTeste.SecurityLevel <em>Security Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.SecurityLevel
	 * @see radioTeste.impl.RadioTestePackageImpl#getSecurityLevel()
	 * @generated
	 */
	int SECURITY_LEVEL = 9;

	/**
	 * The meta object id for the '{@link radioTeste.CarrierFrequency <em>Carrier Frequency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.CarrierFrequency
	 * @see radioTeste.impl.RadioTestePackageImpl#getCarrierFrequency()
	 * @generated
	 */
	int CARRIER_FREQUENCY = 10;

	/**
	 * The meta object id for the '{@link radioTeste.OperationalRole <em>Operational Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.OperationalRole
	 * @see radioTeste.impl.RadioTestePackageImpl#getOperationalRole()
	 * @generated
	 */
	int OPERATIONAL_ROLE = 11;

	/**
	 * The meta object id for the '{@link radioTeste.SituationMode <em>Situation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see radioTeste.SituationMode
	 * @see radioTeste.impl.RadioTestePackageImpl#getSituationMode()
	 * @generated
	 */
	int SITUATION_MODE = 12;

	/**
	 * Returns the meta object for class '{@link radioTeste.LogEntry <em>Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Entry</em>'.
	 * @see radioTeste.LogEntry
	 * @generated
	 */
	EClass getLogEntry();

	/**
	 * Returns the meta object for the containment reference '{@link radioTeste.LogEntry#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal</em>'.
	 * @see radioTeste.LogEntry#getSignal()
	 * @see #getLogEntry()
	 * @generated
	 */
	EReference getLogEntry_Signal();

	/**
	 * Returns the meta object for the attribute '{@link radioTeste.LogEntry#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see radioTeste.LogEntry#getTimeStamp()
	 * @see #getLogEntry()
	 * @generated
	 */
	EAttribute getLogEntry_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link radioTeste.LogEntry#getCarrierfreq <em>Carrierfreq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carrierfreq</em>'.
	 * @see radioTeste.LogEntry#getCarrierfreq()
	 * @see #getLogEntry()
	 * @generated
	 */
	EReference getLogEntry_Carrierfreq();

	/**
	 * Returns the meta object for the containment reference '{@link radioTeste.LogEntry#getOprole <em>Oprole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oprole</em>'.
	 * @see radioTeste.LogEntry#getOprole()
	 * @see #getLogEntry()
	 * @generated
	 */
	EReference getLogEntry_Oprole();

	/**
	 * Returns the meta object for the containment reference '{@link radioTeste.LogEntry#getSecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Level</em>'.
	 * @see radioTeste.LogEntry#getSecurityLevel()
	 * @see #getLogEntry()
	 * @generated
	 */
	EReference getLogEntry_SecurityLevel();

	/**
	 * Returns the meta object for the containment reference '{@link radioTeste.LogEntry#getSampleValue <em>Sample Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sample Value</em>'.
	 * @see radioTeste.LogEntry#getSampleValue()
	 * @see #getLogEntry()
	 * @generated
	 */
	EReference getLogEntry_SampleValue();

	/**
	 * Returns the meta object for class '{@link radioTeste.Transciever <em>Transciever</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transciever</em>'.
	 * @see radioTeste.Transciever
	 * @generated
	 */
	EClass getTransciever();

	/**
	 * Returns the meta object for the attribute '{@link radioTeste.Transciever#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see radioTeste.Transciever#getId()
	 * @see #getTransciever()
	 * @generated
	 */
	EAttribute getTransciever_Id();

	/**
	 * Returns the meta object for the reference '{@link radioTeste.Transciever#getCarrierfreq <em>Carrierfreq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrierfreq</em>'.
	 * @see radioTeste.Transciever#getCarrierfreq()
	 * @see #getTransciever()
	 * @generated
	 */
	EReference getTransciever_Carrierfreq();

	/**
	 * Returns the meta object for the reference '{@link radioTeste.Transciever#getOprole <em>Oprole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Oprole</em>'.
	 * @see radioTeste.Transciever#getOprole()
	 * @see #getTransciever()
	 * @generated
	 */
	EReference getTransciever_Oprole();

	/**
	 * Returns the meta object for the attribute '{@link radioTeste.Transciever#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see radioTeste.Transciever#getMode()
	 * @see #getTransciever()
	 * @generated
	 */
	EAttribute getTransciever_Mode();

	/**
	 * Returns the meta object for the reference '{@link radioTeste.Transciever#getPerceives <em>Perceives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perceives</em>'.
	 * @see radioTeste.Transciever#getPerceives()
	 * @see #getTransciever()
	 * @generated
	 */
	EReference getTransciever_Perceives();

	/**
	 * Returns the meta object for the reference '{@link radioTeste.Transciever#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Log</em>'.
	 * @see radioTeste.Transciever#getLog()
	 * @see #getTransciever()
	 * @generated
	 */
	EReference getTransciever_Log();

	/**
	 * Returns the meta object for class '{@link radioTeste.SampleSignal <em>Sample Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample Signal</em>'.
	 * @see radioTeste.SampleSignal
	 * @generated
	 */
	EClass getSampleSignal();

	/**
	 * Returns the meta object for the reference '{@link radioTeste.SampleSignal#getSecuritylevel <em>Securitylevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Securitylevel</em>'.
	 * @see radioTeste.SampleSignal#getSecuritylevel()
	 * @see #getSampleSignal()
	 * @generated
	 */
	EReference getSampleSignal_Securitylevel();

	/**
	 * Returns the meta object for the reference '{@link radioTeste.SampleSignal#getSampleValue <em>Sample Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sample Value</em>'.
	 * @see radioTeste.SampleSignal#getSampleValue()
	 * @see #getSampleSignal()
	 * @generated
	 */
	EReference getSampleSignal_SampleValue();

	/**
	 * Returns the meta object for class '{@link radioTeste.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see radioTeste.Log
	 * @generated
	 */
	EClass getLog();

	/**
	 * Returns the meta object for the containment reference list '{@link radioTeste.Log#getLogData <em>Log Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Data</em>'.
	 * @see radioTeste.Log#getLogData()
	 * @see #getLog()
	 * @generated
	 */
	EReference getLog_LogData();

	/**
	 * Returns the meta object for the reference '{@link radioTeste.Log#getTransciever <em>Transciever</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transciever</em>'.
	 * @see radioTeste.Log#getTransciever()
	 * @see #getLog()
	 * @generated
	 */
	EReference getLog_Transciever();

	/**
	 * Returns the meta object for class '{@link radioTeste.OpRole <em>Op Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Role</em>'.
	 * @see radioTeste.OpRole
	 * @generated
	 */
	EClass getOpRole();

	/**
	 * Returns the meta object for the attribute '{@link radioTeste.OpRole#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see radioTeste.OpRole#getRole()
	 * @see #getOpRole()
	 * @generated
	 */
	EAttribute getOpRole_Role();

	/**
	 * Returns the meta object for the reference '{@link radioTeste.OpRole#getLogentry <em>Logentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logentry</em>'.
	 * @see radioTeste.OpRole#getLogentry()
	 * @see #getOpRole()
	 * @generated
	 */
	EReference getOpRole_Logentry();

	/**
	 * Returns the meta object for class '{@link radioTeste.CarrierFreq <em>Carrier Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Freq</em>'.
	 * @see radioTeste.CarrierFreq
	 * @generated
	 */
	EClass getCarrierFreq();

	/**
	 * Returns the meta object for the attribute '{@link radioTeste.CarrierFreq#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see radioTeste.CarrierFreq#getValue()
	 * @see #getCarrierFreq()
	 * @generated
	 */
	EAttribute getCarrierFreq_Value();

	/**
	 * Returns the meta object for class '{@link radioTeste.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see radioTeste.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for the attribute '{@link radioTeste.Security#getSecLevel <em>Sec Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sec Level</em>'.
	 * @see radioTeste.Security#getSecLevel()
	 * @see #getSecurity()
	 * @generated
	 */
	EAttribute getSecurity_SecLevel();

	/**
	 * Returns the meta object for class '{@link radioTeste.SampleValue <em>Sample Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample Value</em>'.
	 * @see radioTeste.SampleValue
	 * @generated
	 */
	EClass getSampleValue();

	/**
	 * Returns the meta object for the attribute '{@link radioTeste.SampleValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see radioTeste.SampleValue#getValue()
	 * @see #getSampleValue()
	 * @generated
	 */
	EAttribute getSampleValue_Value();

	/**
	 * Returns the meta object for enum '{@link radioTeste.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Type</em>'.
	 * @see radioTeste.OrderType
	 * @generated
	 */
	EEnum getOrderType();

	/**
	 * Returns the meta object for enum '{@link radioTeste.SecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Level</em>'.
	 * @see radioTeste.SecurityLevel
	 * @generated
	 */
	EEnum getSecurityLevel();

	/**
	 * Returns the meta object for enum '{@link radioTeste.CarrierFrequency <em>Carrier Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Carrier Frequency</em>'.
	 * @see radioTeste.CarrierFrequency
	 * @generated
	 */
	EEnum getCarrierFrequency();

	/**
	 * Returns the meta object for enum '{@link radioTeste.OperationalRole <em>Operational Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operational Role</em>'.
	 * @see radioTeste.OperationalRole
	 * @generated
	 */
	EEnum getOperationalRole();

	/**
	 * Returns the meta object for enum '{@link radioTeste.SituationMode <em>Situation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Situation Mode</em>'.
	 * @see radioTeste.SituationMode
	 * @generated
	 */
	EEnum getSituationMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RadioTesteFactory getRadioTesteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link radioTeste.impl.LogEntryImpl <em>Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.impl.LogEntryImpl
		 * @see radioTeste.impl.RadioTestePackageImpl#getLogEntry()
		 * @generated
		 */
		EClass LOG_ENTRY = eINSTANCE.getLogEntry();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_ENTRY__SIGNAL = eINSTANCE.getLogEntry_Signal();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_ENTRY__TIME_STAMP = eINSTANCE.getLogEntry_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Carrierfreq</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_ENTRY__CARRIERFREQ = eINSTANCE.getLogEntry_Carrierfreq();

		/**
		 * The meta object literal for the '<em><b>Oprole</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_ENTRY__OPROLE = eINSTANCE.getLogEntry_Oprole();

		/**
		 * The meta object literal for the '<em><b>Security Level</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_ENTRY__SECURITY_LEVEL = eINSTANCE.getLogEntry_SecurityLevel();

		/**
		 * The meta object literal for the '<em><b>Sample Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_ENTRY__SAMPLE_VALUE = eINSTANCE.getLogEntry_SampleValue();

		/**
		 * The meta object literal for the '{@link radioTeste.impl.TranscieverImpl <em>Transciever</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.impl.TranscieverImpl
		 * @see radioTeste.impl.RadioTestePackageImpl#getTransciever()
		 * @generated
		 */
		EClass TRANSCIEVER = eINSTANCE.getTransciever();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSCIEVER__ID = eINSTANCE.getTransciever_Id();

		/**
		 * The meta object literal for the '<em><b>Carrierfreq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSCIEVER__CARRIERFREQ = eINSTANCE.getTransciever_Carrierfreq();

		/**
		 * The meta object literal for the '<em><b>Oprole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSCIEVER__OPROLE = eINSTANCE.getTransciever_Oprole();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSCIEVER__MODE = eINSTANCE.getTransciever_Mode();

		/**
		 * The meta object literal for the '<em><b>Perceives</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSCIEVER__PERCEIVES = eINSTANCE.getTransciever_Perceives();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSCIEVER__LOG = eINSTANCE.getTransciever_Log();

		/**
		 * The meta object literal for the '{@link radioTeste.impl.SampleSignalImpl <em>Sample Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.impl.SampleSignalImpl
		 * @see radioTeste.impl.RadioTestePackageImpl#getSampleSignal()
		 * @generated
		 */
		EClass SAMPLE_SIGNAL = eINSTANCE.getSampleSignal();

		/**
		 * The meta object literal for the '<em><b>Securitylevel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLE_SIGNAL__SECURITYLEVEL = eINSTANCE.getSampleSignal_Securitylevel();

		/**
		 * The meta object literal for the '<em><b>Sample Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLE_SIGNAL__SAMPLE_VALUE = eINSTANCE.getSampleSignal_SampleValue();

		/**
		 * The meta object literal for the '{@link radioTeste.impl.LogImpl <em>Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.impl.LogImpl
		 * @see radioTeste.impl.RadioTestePackageImpl#getLog()
		 * @generated
		 */
		EClass LOG = eINSTANCE.getLog();

		/**
		 * The meta object literal for the '<em><b>Log Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG__LOG_DATA = eINSTANCE.getLog_LogData();

		/**
		 * The meta object literal for the '<em><b>Transciever</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG__TRANSCIEVER = eINSTANCE.getLog_Transciever();

		/**
		 * The meta object literal for the '{@link radioTeste.impl.OpRoleImpl <em>Op Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.impl.OpRoleImpl
		 * @see radioTeste.impl.RadioTestePackageImpl#getOpRole()
		 * @generated
		 */
		EClass OP_ROLE = eINSTANCE.getOpRole();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_ROLE__ROLE = eINSTANCE.getOpRole_Role();

		/**
		 * The meta object literal for the '<em><b>Logentry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_ROLE__LOGENTRY = eINSTANCE.getOpRole_Logentry();

		/**
		 * The meta object literal for the '{@link radioTeste.impl.CarrierFreqImpl <em>Carrier Freq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.impl.CarrierFreqImpl
		 * @see radioTeste.impl.RadioTestePackageImpl#getCarrierFreq()
		 * @generated
		 */
		EClass CARRIER_FREQ = eINSTANCE.getCarrierFreq();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_FREQ__VALUE = eINSTANCE.getCarrierFreq_Value();

		/**
		 * The meta object literal for the '{@link radioTeste.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.impl.SecurityImpl
		 * @see radioTeste.impl.RadioTestePackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '<em><b>Sec Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY__SEC_LEVEL = eINSTANCE.getSecurity_SecLevel();

		/**
		 * The meta object literal for the '{@link radioTeste.impl.SampleValueImpl <em>Sample Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.impl.SampleValueImpl
		 * @see radioTeste.impl.RadioTestePackageImpl#getSampleValue()
		 * @generated
		 */
		EClass SAMPLE_VALUE = eINSTANCE.getSampleValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_VALUE__VALUE = eINSTANCE.getSampleValue_Value();

		/**
		 * The meta object literal for the '{@link radioTeste.OrderType <em>Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.OrderType
		 * @see radioTeste.impl.RadioTestePackageImpl#getOrderType()
		 * @generated
		 */
		EEnum ORDER_TYPE = eINSTANCE.getOrderType();

		/**
		 * The meta object literal for the '{@link radioTeste.SecurityLevel <em>Security Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.SecurityLevel
		 * @see radioTeste.impl.RadioTestePackageImpl#getSecurityLevel()
		 * @generated
		 */
		EEnum SECURITY_LEVEL = eINSTANCE.getSecurityLevel();

		/**
		 * The meta object literal for the '{@link radioTeste.CarrierFrequency <em>Carrier Frequency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.CarrierFrequency
		 * @see radioTeste.impl.RadioTestePackageImpl#getCarrierFrequency()
		 * @generated
		 */
		EEnum CARRIER_FREQUENCY = eINSTANCE.getCarrierFrequency();

		/**
		 * The meta object literal for the '{@link radioTeste.OperationalRole <em>Operational Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.OperationalRole
		 * @see radioTeste.impl.RadioTestePackageImpl#getOperationalRole()
		 * @generated
		 */
		EEnum OPERATIONAL_ROLE = eINSTANCE.getOperationalRole();

		/**
		 * The meta object literal for the '{@link radioTeste.SituationMode <em>Situation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see radioTeste.SituationMode
		 * @see radioTeste.impl.RadioTestePackageImpl#getSituationMode()
		 * @generated
		 */
		EEnum SITUATION_MODE = eINSTANCE.getSituationMode();

	}

} //RadioTestePackage
