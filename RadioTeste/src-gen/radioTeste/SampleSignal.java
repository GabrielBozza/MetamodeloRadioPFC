/**
 */
package radioTeste;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link radioTeste.SampleSignal#getSecuritylevel <em>Securitylevel</em>}</li>
 *   <li>{@link radioTeste.SampleSignal#getSampleValue <em>Sample Value</em>}</li>
 * </ul>
 *
 * @see radioTeste.RadioTestePackage#getSampleSignal()
 * @model
 * @generated
 */
public interface SampleSignal extends EObject {
	/**
	 * Returns the value of the '<em><b>Securitylevel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitylevel</em>' reference.
	 * @see #setSecuritylevel(Security)
	 * @see radioTeste.RadioTestePackage#getSampleSignal_Securitylevel()
	 * @model
	 * @generated
	 */
	Security getSecuritylevel();

	/**
	 * Sets the value of the '{@link radioTeste.SampleSignal#getSecuritylevel <em>Securitylevel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitylevel</em>' reference.
	 * @see #getSecuritylevel()
	 * @generated
	 */
	void setSecuritylevel(Security value);

	/**
	 * Returns the value of the '<em><b>Sample Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Value</em>' reference.
	 * @see #setSampleValue(SampleValue)
	 * @see radioTeste.RadioTestePackage#getSampleSignal_SampleValue()
	 * @model required="true"
	 * @generated
	 */
	SampleValue getSampleValue();

	/**
	 * Sets the value of the '{@link radioTeste.SampleSignal#getSampleValue <em>Sample Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Value</em>' reference.
	 * @see #getSampleValue()
	 * @generated
	 */
	void setSampleValue(SampleValue value);

} // SampleSignal
