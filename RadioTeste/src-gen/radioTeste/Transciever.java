/**
 */
package radioTeste;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transciever</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link radioTeste.Transciever#getId <em>Id</em>}</li>
 *   <li>{@link radioTeste.Transciever#getCarrierfreq <em>Carrierfreq</em>}</li>
 *   <li>{@link radioTeste.Transciever#getOprole <em>Oprole</em>}</li>
 *   <li>{@link radioTeste.Transciever#getMode <em>Mode</em>}</li>
 *   <li>{@link radioTeste.Transciever#getPerceives <em>Perceives</em>}</li>
 *   <li>{@link radioTeste.Transciever#getLog <em>Log</em>}</li>
 * </ul>
 *
 * @see radioTeste.RadioTestePackage#getTransciever()
 * @model
 * @generated
 */
public interface Transciever extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see radioTeste.RadioTestePackage#getTransciever_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link radioTeste.Transciever#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Carrierfreq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrierfreq</em>' reference.
	 * @see #setCarrierfreq(CarrierFreq)
	 * @see radioTeste.RadioTestePackage#getTransciever_Carrierfreq()
	 * @model
	 * @generated
	 */
	CarrierFreq getCarrierfreq();

	/**
	 * Sets the value of the '{@link radioTeste.Transciever#getCarrierfreq <em>Carrierfreq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrierfreq</em>' reference.
	 * @see #getCarrierfreq()
	 * @generated
	 */
	void setCarrierfreq(CarrierFreq value);

	/**
	 * Returns the value of the '<em><b>Oprole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oprole</em>' reference.
	 * @see #setOprole(OpRole)
	 * @see radioTeste.RadioTestePackage#getTransciever_Oprole()
	 * @model
	 * @generated
	 */
	OpRole getOprole();

	/**
	 * Sets the value of the '{@link radioTeste.Transciever#getOprole <em>Oprole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oprole</em>' reference.
	 * @see #getOprole()
	 * @generated
	 */
	void setOprole(OpRole value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"SILENCE"</code>.
	 * The literals are from the enumeration {@link radioTeste.SituationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see radioTeste.SituationMode
	 * @see #setMode(SituationMode)
	 * @see radioTeste.RadioTestePackage#getTransciever_Mode()
	 * @model default="SILENCE" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tif(self.log.logData.carrierfreq.Value = CarrierFrequency::A and self.log.logData.securityLevel.SecLevel = SecurityLevel::Low) then SituationMode::SILENCE\n\t\t\t\telse SituationMode::TALK\n\t\t\t\tendif'"
	 * @generated
	 */
	SituationMode getMode();

	/**
	 * Sets the value of the '{@link radioTeste.Transciever#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see radioTeste.SituationMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(SituationMode value);

	/**
	 * Returns the value of the '<em><b>Perceives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perceives</em>' reference.
	 * @see #setPerceives(SampleSignal)
	 * @see radioTeste.RadioTestePackage#getTransciever_Perceives()
	 * @model
	 * @generated
	 */
	SampleSignal getPerceives();

	/**
	 * Sets the value of the '{@link radioTeste.Transciever#getPerceives <em>Perceives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perceives</em>' reference.
	 * @see #getPerceives()
	 * @generated
	 */
	void setPerceives(SampleSignal value);

	/**
	 * Returns the value of the '<em><b>Log</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link radioTeste.Log#getTransciever <em>Transciever</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' reference.
	 * @see #setLog(Log)
	 * @see radioTeste.RadioTestePackage#getTransciever_Log()
	 * @see radioTeste.Log#getTransciever
	 * @model opposite="transciever"
	 * @generated
	 */
	Log getLog();

	/**
	 * Sets the value of the '{@link radioTeste.Transciever#getLog <em>Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' reference.
	 * @see #getLog()
	 * @generated
	 */
	void setLog(Log value);

} // Transciever
