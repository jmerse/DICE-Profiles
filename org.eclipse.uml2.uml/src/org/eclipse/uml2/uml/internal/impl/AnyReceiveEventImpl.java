/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 451350
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.AnyReceiveEvent;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Receive Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnyReceiveEventImpl
		extends MessageEventImpl
		implements AnyReceiveEvent {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyReceiveEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ANY_RECEIVE_EVENT;
	}

} //AnyReceiveEventImpl
