package com.koreinfotech.sms.dao;

import java.util.List;

import com.koreinfotech.sms.domain.PaymentStatus;

/**
 * @author Administrator
 *
 */
public interface IPaymentStatusDAO {

	/**
	 * Add a new PaymentStatus to the existing table.
	 * @return
	 * @param paymentStatus
	 */
	public void addPaymentStatus(PaymentStatus paymentStatus);
	/**
	 * Delete a PaymentStatus based on the PaymentStatusID field.
	 * @param paymentStatusId
	 */
	public boolean deletPaymentStatus(Integer paymentStatusId);
	/**
	 * Retrieve all the PaymentStatus as a List&lt;>
	 * @return List&lt;PaymentStatus>
	 */
	public List<PaymentStatus> listPaymentStatus();
	/**
	 * Returns a PaymentStatus, given the Name (String) of a PaymentStatus. It may be used to search the databases.
	 * @param paymentStatusName
	 * @return
	 */
	public PaymentStatus getPaymentStatusByName(String paymentStatusName);
	
	/**
	 * Returns the PaymentStatus given the Id(int) value of a PaymentStatus.
	 * @param paymentStatusId
	 * @return
	 */
	public PaymentStatus getPaymentStatusById(int paymentStatusId);
	
}
