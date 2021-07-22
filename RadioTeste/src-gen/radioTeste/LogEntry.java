/**
 */
package radioTeste;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link radioTeste.LogEntry#getSignal <em>Signal</em>}</li>
 *   <li>{@link radioTeste.LogEntry#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link radioTeste.LogEntry#getCarrierfreq <em>Carrierfreq</em>}</li>
 *   <li>{@link radioTeste.LogEntry#getOprole <em>Oprole</em>}</li>
 *   <li>{@link radioTeste.LogEntry#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link radioTeste.LogEntry#getSampleValue <em>Sample Value</em>}</li>
 * </ul>
 *
 * @see radioTeste.RadioTestePackage#getLogEntry()
 * @model
 * @generated
 */
public interface LogEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference.
	 * @see #setSignal(SampleSignal)
	 * @see radioTeste.RadioTestePackage#getLogEntry_Signal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SampleSignal getSignal();

	/**
	 * Sets the value of the '{@link radioTeste.LogEntry#getSignal <em>Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' containment reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(SampleSignal value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(int)
	 * @see radioTeste.RadioTestePackage#getLogEntry_TimeStamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getTimeStamp();

	/**
	 * Sets the value of the '{@link radioTeste.LogEntry#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(int value);

	/**
	 * Returns the value of the '<em><b>Carrierfreq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrierfreq</em>' containment reference.
	 * @see #setCarrierfreq(CarrierFreq)
	 * @see radioTeste.RadioTestePackage#getLogEntry_Carrierfreq()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CarrierFreq getCarrierfreq();

	/**
	 * Sets the value of the '{@link radioTeste.LogEntry#getCarrierfreq <em>Carrierfreq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrierfreq</em>' containment reference.
	 * @see #getCarrierfreq()
	 * @generated
	 */
	void setCarrierfreq(CarrierFreq value);

	/**
	 * Returns the value of the '<em><b>Oprole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oprole</em>' containment reference.
	 * @see #setOprole(OpRole)
	 * @see radioTeste.RadioTestePackage#getLogEntry_Oprole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OpRole getOprole();

	/**
	 * Sets the value of the '{@link radioTeste.LogEntry#getOprole <em>Oprole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oprole</em>' containment reference.
	 * @see #getOprole()
	 * @generated
	 */
	void setOprole(OpRole value);

	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level</em>' containment reference.
	 * @see #setSecurityLevel(Security)
	 * @see radioTeste.RadioTestePackage#getLogEntry_SecurityLevel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Security getSecurityLevel();

	/**
	 * Sets the value of the '{@link radioTeste.LogEntry#getSecurityLevel <em>Security Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' containment reference.
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(Security value);

	/**
	 * Returns the value of the '<em><b>Sample Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Value</em>' containment reference.
	 * @see #setSampleValue(SampleValue)
	 * @see radioTeste.RadioTestePackage#getLogEntry_SampleValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SampleValue getSampleValue();

	/**
	 * Sets the value of the '{@link radioTeste.LogEntry#getSampleValue <em>Sample Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Value</em>' containment reference.
	 * @see #getSampleValue()
	 * @generated
	 */
	void setSampleValue(SampleValue value);

} // LogEntry
