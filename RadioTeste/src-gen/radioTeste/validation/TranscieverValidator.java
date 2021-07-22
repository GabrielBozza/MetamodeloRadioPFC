/**
 *
 * $Id$
 */
package radioTeste.validation;

import radioTeste.CarrierFreq;
import radioTeste.Log;
import radioTeste.OpRole;
import radioTeste.SampleSignal;
import radioTeste.SituationMode;

/**
 * A sample validator interface for {@link radioTeste.Transciever}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TranscieverValidator {
	boolean validate();

	boolean validateId(String value);

	boolean validateCarrierfreq(CarrierFreq value);

	boolean validateOprole(OpRole value);

	boolean validateMode(SituationMode value);

	boolean validatePerceives(SampleSignal value);

	boolean validateLog(Log value);
}
