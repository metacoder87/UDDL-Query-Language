/*
 * generated by Xtext 2.28.0
 */
package com.epstimis.uddl.query;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class QueryStandaloneSetup extends QueryStandaloneSetupGenerated {

	public static void doSetup() {
		new QueryStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
