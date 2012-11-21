
package at.ac.tuwien.big.me12;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GSMLDslStandaloneSetup extends GSMLDslStandaloneSetupGenerated{

	public static void doSetup() {
		new GSMLDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

