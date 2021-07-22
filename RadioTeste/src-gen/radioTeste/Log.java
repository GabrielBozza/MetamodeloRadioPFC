/**
 */
package radioTeste;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link radioTeste.Log#getLogData <em>Log Data</em>}</li>
 *   <li>{@link radioTeste.Log#getTransciever <em>Transciever</em>}</li>
 * </ul>
 *
 * @see radioTeste.RadioTestePackage#getLog()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OrderTypeSeq OrderTypeSeq2 OrderTypeSeq3'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OrderTypeSeq='\n\t\t\t\tself.logData.TimeStamp-&gt;at(self.logData.TimeStamp-&gt;size()-1) = 1' OrderTypeSeq2='\n\t\t\t\tself.logData.TimeStamp-&gt;at(self.logData.TimeStamp-&gt;size()) = 33' OrderTypeSeq3='\n\t\t\t\tself.logData.TimeStamp-&gt;at(self.logData.TimeStamp-&gt;size()-2) = 5'"
 * @generated
 */
public interface Log extends EObject {
	/**
	 * Returns the value of the '<em><b>Log Data</b></em>' containment reference list.
	 * The list contents are of type {@link radioTeste.LogEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Data</em>' containment reference list.
	 * @see radioTeste.RadioTestePackage#getLog_LogData()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogEntry> getLogData();

	/**
	 * Returns the value of the '<em><b>Transciever</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link radioTeste.Transciever#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transciever</em>' reference.
	 * @see #setTransciever(Transciever)
	 * @see radioTeste.RadioTestePackage#getLog_Transciever()
	 * @see radioTeste.Transciever#getLog
	 * @model opposite="log"
	 * @generated
	 */
	Transciever getTransciever();

	/**
	 * Sets the value of the '{@link radioTeste.Log#getTransciever <em>Transciever</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transciever</em>' reference.
	 * @see #getTransciever()
	 * @generated
	 */
	void setTransciever(Transciever value);

} // Log
