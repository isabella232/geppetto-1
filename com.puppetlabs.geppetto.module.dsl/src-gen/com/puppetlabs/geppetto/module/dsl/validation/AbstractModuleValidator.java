/*
 * generated by Xtext
 */
package com.puppetlabs.geppetto.module.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractModuleValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.puppetlabs.geppetto.module.dsl.metadata.MetadataPackage.eINSTANCE);
		return result;
	}
}
