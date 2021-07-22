/**
 */
package radioTeste;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Freq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link radioTeste.CarrierFreq#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see radioTeste.RadioTestePackage#getCarrierFreq()
 * @model
 * @generated
 */
public interface CarrierFreq extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"A"</code>.
	 * The literals are from the enumeration {@link radioTeste.CarrierFrequency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see radioTeste.CarrierFrequency
	 * @see #setValue(CarrierFrequency)
	 * @see radioTeste.RadioTestePackage#getCarrierFreq_Value()
	 * @model default="A"
	 * @generated
	 */
	CarrierFrequency getValue();

	/**
	 * Sets the value of the '{@link radioTeste.CarrierFreq#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see radioTeste.CarrierFrequency
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CarrierFrequency value);

} // CarrierFreq
