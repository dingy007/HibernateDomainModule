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
	 * @param PaymentMode
	 */
	public void addPaymentMode(PaymentMode PaymentMode);
	/**
	 * Delete a PaymentMode based on the PaymentModeID field.
	 * @param PaymentModeId
	 */
	public boolean deletPaymentMode(Integer PaymentModeId);
	/**
	 * Retrieve all the PaymentMode as a List&lt;>
	 * @return List&lt;PaymentMode>
	 */
	public List<PaymentMode> listPaymentMode();
	/**
	 * Returns a PaymentMode, given the Name (String) of a PaymentMode. It may be used to search the databases.
	 * @param PaymentModeName
	 * @return
	 */
	public PaymentMode getPaymentModeByName(String PaymentModeName);
	
	/**
	 * Returns the PaymentMode given the Id(int) value of a PaymentMode.
	 * @param PaymentModeId
	 * @return
	 */
	public PaymentMode getPaymentModeById(int PaymentModeId);
	
}
