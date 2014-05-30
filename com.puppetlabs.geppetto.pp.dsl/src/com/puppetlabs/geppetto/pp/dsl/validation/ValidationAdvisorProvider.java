/**
 * Copyright (c) 2013 Puppet Labs, Inc. and other contributors, as listed below.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Puppet Labs
 */
package com.puppetlabs.geppetto.pp.dsl.validation;

import com.google.inject.Provider;

/**
 * A parameterized provider of validation advisor.
 *
 */
public class ValidationAdvisorProvider<T extends IValidationAdvisor> implements Provider<IValidationAdvisor> {
	public static <T extends IValidationAdvisor> ValidationAdvisorProvider<T> create(
			IValidationAdvisor.ComplianceLevel level) {
		return new ValidationAdvisorProvider<T>(level, null);
	}

	public static <T extends IValidationAdvisor> ValidationAdvisorProvider<T> create(
			IValidationAdvisor.ComplianceLevel level, IPotentialProblemsAdvisor problemsAdvisor) {
		return new ValidationAdvisorProvider<T>(level, problemsAdvisor);
	}

	private final IValidationAdvisor.ComplianceLevel level;

	private final IPotentialProblemsAdvisor problemsAdvisor;

	public ValidationAdvisorProvider(IValidationAdvisor.ComplianceLevel level, IPotentialProblemsAdvisor problemsAdvisor) {
		this.level = level;
		this.problemsAdvisor = problemsAdvisor;
	}

	/**
	 * Provides an IValidatioNAdvisor configured from the ComplianceLevel and (optional) ProblemsAdvisor
	 *
	 * If the problems advisor is null, an instance of {@link DefaultPotentialProblemsAdvisor} is used.
	 */
	@Override
	public IValidationAdvisor get() {
		return level.createValidationAdvisor(problemsAdvisor != null
				? problemsAdvisor
				: new DefaultPotentialProblemsAdvisor());
	}

}
