/**
 */
package radioTeste;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link radioTeste.OpRole#getRole <em>Role</em>}</li>
 *   <li>{@link radioTeste.OpRole#getLogentry <em>Logentry</em>}</li>
 * </ul>
 *
 * @see radioTeste.RadioTestePackage#getOpRole()
 * @model
 * @generated
 */
public interface OpRole extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The default value is <code>"Soldier"</code>.
	 * The literals are from the enumeration {@link radioTeste.OperationalRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see radioTeste.OperationalRole
	 * @see #setRole(OperationalRole)
	 * @see radioTeste.RadioTestePackage#getOpRole_Role()
	 * @model default="Soldier"
	 * @generated
	 */
	OperationalRole getRole();

	/**
	 * Sets the value of the '{@link radioTeste.OpRole#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see radioTeste.OperationalRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(OperationalRole value);

	/**
	 * Returns the value of the '<em><b>Logentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logentry</em>' reference.
	 * @see #setLogentry(LogEntry)
	 * @see radioTeste.RadioTestePackage#getOpRole_Logentry()
	 * @model
	 * @generated
	 */
	LogEntry getLogentry();

	/**
	 * Sets the value of the '{@link radioTeste.OpRole#getLogentry <em>Logentry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logentry</em>' reference.
	 * @see #getLogentry()
	 * @generated
	 */
	void setLogentry(LogEntry value);

} // OpRole
