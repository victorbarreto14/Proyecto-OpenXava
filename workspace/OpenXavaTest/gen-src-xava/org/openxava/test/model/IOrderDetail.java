

// File generated by OpenXava: Thu Nov 05 14:23:03 CET 2015
// Archivo generado por OpenXava: Thu Nov 05 14:23:03 CET 2015

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Order		Java interface for aggregate/Interfaz java para Agregado: OrderDetail

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IOrderDetail  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_amount = "amount"; 	
	java.math.BigDecimal getAmount() throws RemoteException; 	
	public static final String PROPERTY_id = "id"; 	
	String getId() throws RemoteException; 	
	public static final String PROPERTY_quantity = "quantity"; 
	int getQuantity() throws RemoteException;
	void setQuantity(int quantity) throws RemoteException;		

	// References/Referencias 

	// Product : Reference/Referencia
	
	org.openxava.test.model.IProduct2 getProduct() throws RemoteException;
	void setProduct(org.openxava.test.model.IProduct2 newProduct) throws RemoteException; 

	// Order : Reference/Referencia
	
	org.openxava.test.model.IOrder getOrder() throws RemoteException;
	void setOrder(org.openxava.test.model.IOrder newOrder) throws RemoteException;

	// Methods 


}