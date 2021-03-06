/**
 *
 * $Id$
 */
package radioTeste.validation;

import radioTeste.SampleValue;
import radioTeste.Security;

/**
 * A sample validator interface for {@link radioTeste.SampleSignal}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SampleSignalValidator {
	boolean validate();

	boolean validateSecuritylevel(Security value);

	boolean validateSampleValue(SampleValue value);
}
