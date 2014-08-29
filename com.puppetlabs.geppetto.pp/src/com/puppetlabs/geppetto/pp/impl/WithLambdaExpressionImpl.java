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
package com.puppetlabs.geppetto.pp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.puppetlabs.geppetto.pp.Lambda;
import com.puppetlabs.geppetto.pp.PPPackage;
import com.puppetlabs.geppetto.pp.WithLambdaExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>With Lambda Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.puppetlabs.geppetto.pp.impl.WithLambdaExpressionImpl#getLambda <em>Lambda</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WithLambdaExpressionImpl extends ParameterizedExpressionImpl implements WithLambdaExpression {
	/**
	 * The cached value of the '{@link #getLambda() <em>Lambda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLambda()
	 * @generated
	 * @ordered
	 */
	protected Lambda lambda;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected WithLambdaExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetLambda(Lambda newLambda, NotificationChain msgs) {
		Lambda oldLambda = lambda;
		lambda = newLambda;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, PPPackage.WITH_LAMBDA_EXPRESSION__LAMBDA, oldLambda, newLambda);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case PPPackage.WITH_LAMBDA_EXPRESSION__LAMBDA:
				return getLambda();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case PPPackage.WITH_LAMBDA_EXPRESSION__LAMBDA:
				return basicSetLambda(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case PPPackage.WITH_LAMBDA_EXPRESSION__LAMBDA:
				return lambda != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case PPPackage.WITH_LAMBDA_EXPRESSION__LAMBDA:
				setLambda((Lambda) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PPPackage.Literals.WITH_LAMBDA_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case PPPackage.WITH_LAMBDA_EXPRESSION__LAMBDA:
				setLambda((Lambda) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Lambda getLambda() {
		return lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setLambda(Lambda newLambda) {
		if(newLambda != lambda) {
			NotificationChain msgs = null;
			if(lambda != null)
				msgs = ((InternalEObject) lambda).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE - PPPackage.WITH_LAMBDA_EXPRESSION__LAMBDA, null, msgs);
			if(newLambda != null)
				msgs = ((InternalEObject) newLambda).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE - PPPackage.WITH_LAMBDA_EXPRESSION__LAMBDA, null, msgs);
			msgs = basicSetLambda(newLambda, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PPPackage.WITH_LAMBDA_EXPRESSION__LAMBDA, newLambda, newLambda));
	}

} // WithLambdaExpressionImpl
