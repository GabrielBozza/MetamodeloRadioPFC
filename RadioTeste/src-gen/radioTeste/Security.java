/**
 */
package radioTeste;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link radioTeste.Security#getSecLevel <em>Sec Level</em>}</li>
 * </ul>
 *
 * @see radioTeste.RadioTestePackage#getSecurity()
 * @model
 * @generated
 */
public interface Security extends EObject {
	/**
	 * Returns the value of the '<em><b>Sec Level</b></em>' attribute.
	 * The default value is <code>"Low"</code>.
	 * The literals are from the enumeration {@link radioTeste.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sec Level</em>' attribute.
	 * @see radioTeste.SecurityLevel
	 * @see #setSecLevel(SecurityLevel)
	 * @see radioTeste.RadioTestePackage#getSecurity_SecLevel()
	 * @model default="Low"
	 * @generated
	 */
	SecurityLevel getSecLevel();

	/**
	 * Sets the value of the '{@link radioTeste.Security#getSecLevel <em>Sec Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sec Level</em>' attribute.
	 * @see radioTeste.SecurityLevel
	 * @see #getSecLevel()
	 * @generated
	 */
	void setSecLevel(SecurityLevel value);

} // Security
