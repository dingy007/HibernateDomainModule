package com.koreinfotech.sms.dao;

import java.util.List;

import com.koreinfotech.sms.domain.PaymentMode;

/**
 * @author Administrator
 *
 */
public interface IPaymentModeDAO {

	/**
	 * Add a new PaymentMode to the existing table.
	 * @return
	 * @param paymentMode
	 */
	public void addPaymentMode(PaymentMode paymentMode);
	/**
	 * Delete a PaymentMode based on the PaymentModeID field.
	 * @param paymentModeId
	 */
	public boolean deletPaymentMode(Integer paymentModeId);
	/**
	 * Retrieve all the PaymentMode as a List&lt;>
	 * @return List&lt;PaymentMode>
	 */
	public List<PaymentMode> listPaymentMode();
	/**
	 * Returns a PaymentMode, given the Name (String) of a PaymentMode. It may be used to search the databases.
	 * @param paymentModeName
	 * @return
	 */
	public PaymentMode getPaymentModeByName(String paymentModeName);
	
	/**
	 * Returns the PaymentMode given the Id(int) value of a PaymentMode.
	 * @param paymentModeId
	 * @return
	 */
	public PaymentMode getPaymentModeById(int paymentModeId);
	
}
