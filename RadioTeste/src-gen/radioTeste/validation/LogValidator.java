/**
 *
 * $Id$
 */
package radioTeste.validation;

import org.eclipse.emf.common.util.EList;

import radioTeste.LogEntry;
import radioTeste.Transciever;

/**
 * A sample validator interface for {@link radioTeste.Log}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LogValidator {
	boolean validate();

	boolean validateLogData(EList<LogEntry> value);

	boolean validateTransciever(Transciever value);
}
