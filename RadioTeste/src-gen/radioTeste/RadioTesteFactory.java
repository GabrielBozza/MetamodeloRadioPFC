/**
 */
package radioTeste;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see radioTeste.RadioTestePackage
 * @generated
 */
public interface RadioTesteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RadioTesteFactory eINSTANCE = radioTeste.impl.RadioTesteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Entry</em>'.
	 * @generated
	 */
	LogEntry createLogEntry();

	/**
	 * Returns a new object of class '<em>Transciever</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transciever</em>'.
	 * @generated
	 */
	Transciever createTransciever();

	/**
	 * Returns a new object of class '<em>Sample Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample Signal</em>'.
	 * @generated
	 */
	SampleSignal createSampleSignal();

	/**
	 * Returns a new object of class '<em>Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log</em>'.
	 * @generated
	 */
	Log createLog();

	/**
	 * Returns a new object of class '<em>Op Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Op Role</em>'.
	 * @generated
	 */
	OpRole createOpRole();

	/**
	 * Returns a new object of class '<em>Carrier Freq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Freq</em>'.
	 * @generated
	 */
	CarrierFreq createCarrierFreq();

	/**
	 * Returns a new object of class '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security</em>'.
	 * @generated
	 */
	Security createSecurity();

	/**
	 * Returns a new object of class '<em>Sample Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample Value</em>'.
	 * @generated
	 */
	SampleValue createSampleValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RadioTestePackage getRadioTestePackage();

} //RadioTesteFactory
