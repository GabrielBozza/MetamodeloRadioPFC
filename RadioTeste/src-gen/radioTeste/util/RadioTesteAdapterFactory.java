/**
 */
package radioTeste.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import radioTeste.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see radioTeste.RadioTestePackage
 * @generated
 */
public class RadioTesteAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RadioTestePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioTesteAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RadioTestePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioTesteSwitch<Adapter> modelSwitch = new RadioTesteSwitch<Adapter>() {
		@Override
		public Adapter caseLogEntry(LogEntry object) {
			return createLogEntryAdapter();
		}

		@Override
		public Adapter caseTransciever(Transciever object) {
			return createTranscieverAdapter();
		}

		@Override
		public Adapter caseSampleSignal(SampleSignal object) {
			return createSampleSignalAdapter();
		}

		@Override
		public Adapter caseLog(Log object) {
			return createLogAdapter();
		}

		@Override
		public Adapter caseOpRole(OpRole object) {
			return createOpRoleAdapter();
		}

		@Override
		public Adapter caseCarrierFreq(CarrierFreq object) {
			return createCarrierFreqAdapter();
		}

		@Override
		public Adapter caseSecurity(Security object) {
			return createSecurityAdapter();
		}

		@Override
		public Adapter caseSampleValue(SampleValue object) {
			return createSampleValueAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link radioTeste.LogEntry <em>Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see radioTeste.LogEntry
	 * @generated
	 */
	public Adapter createLogEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link radioTeste.Transciever <em>Transciever</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see radioTeste.Transciever
	 * @generated
	 */
	public Adapter createTranscieverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link radioTeste.SampleSignal <em>Sample Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see radioTeste.SampleSignal
	 * @generated
	 */
	public Adapter createSampleSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link radioTeste.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see radioTeste.Log
	 * @generated
	 */
	public Adapter createLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link radioTeste.OpRole <em>Op Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see radioTeste.OpRole
	 * @generated
	 */
	public Adapter createOpRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link radioTeste.CarrierFreq <em>Carrier Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see radioTeste.CarrierFreq
	 * @generated
	 */
	public Adapter createCarrierFreqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link radioTeste.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see radioTeste.Security
	 * @generated
	 */
	public Adapter createSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link radioTeste.SampleValue <em>Sample Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see radioTeste.SampleValue
	 * @generated
	 */
	public Adapter createSampleValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RadioTesteAdapterFactory
