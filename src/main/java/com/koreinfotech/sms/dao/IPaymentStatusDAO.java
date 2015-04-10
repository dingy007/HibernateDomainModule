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
	 * @param PaymentStatus
	 */
	public void addPaymentStatus(PaymentStatus PaymentStatus);
	/**
	 * Delete a PaymentStatus based on the PaymentStatusID field.
	 * @param PaymentStatusId
	 */
	public boolean deletPaymentStatus(Integer PaymentStatusId);
	/**
	 * Retrieve all the PaymentStatus as a List&lt;>
	 * @return List&lt;PaymentStatus>
	 */
	public List<PaymentStatus> listPaymentStatus();
	/**
	 * Returns a PaymentStatus, given the Name (String) of a PaymentStatus. It may be used to search the databases.
	 * @param PaymentStatusName
	 * @return
	 */
	public PaymentStatus getPaymentStatusByName(String PaymentStatusName);
	
	/**
	 * Returns the PaymentStatus given the Id(int) value of a PaymentStatus.
	 * @param PaymentStatusId
	 * @return
	 */
	public PaymentStatus getPaymentStatusById(int PaymentStatusId);
	
}
