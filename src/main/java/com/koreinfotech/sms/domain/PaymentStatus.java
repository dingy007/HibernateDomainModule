package com.koreinfotech.sms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PaymentStatus")
public class PaymentStatus {
	@Id
	@Column(name="paymentStatus_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int paymentStatusId;
	@Column(name="paymentStatusName")
	private String paymentStatusName;
	@Column(name="paymentStatusDesc")
	private String paymentStatusDesc;
	public PaymentStatus(String paymentStatusName, String paymentStatusDesc) {
		super();
		this.paymentStatusName = paymentStatusName;
		this.paymentStatusDesc = paymentStatusDesc;
	}
	public PaymentStatus() {
		super();
	}
	/**
	 * @return the paymentStatusId
	 */
	public int getPaymentStatusId() {
		return paymentStatusId;
	}
	/**
	 * @param paymentStatusId the paymentStatusId to set
	 */
	public void setPaymentStatusId(int paymentStatusId) {
		this.paymentStatusId = paymentStatusId;
	}
	/**
	 * @return the paymentStatusName
	 */
	public String getPaymentStatusName() {
		return paymentStatusName;
	}
	/**
	 * @param paymentStatusName the paymentStatusName to set
	 */
	public void setPaymentStatusName(String paymentStatusName) {
		this.paymentStatusName = paymentStatusName;
	}
	/**
	 * @return the paymentStatusDesc
	 */
	public String getPaymentStatusDesc() {
		return paymentStatusDesc;
	}
	/**
	 * @param paymentStatusDesc the paymentStatusDesc to set
	 */
	public void setPaymentStatusDesc(String paymentStatusDesc) {
		this.paymentStatusDesc = paymentStatusDesc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentStatus [paymentStatusId=");
		builder.append(paymentStatusId);
		builder.append(", ");
		if (paymentStatusName != null) {
			builder.append("paymentStatusName=");
			builder.append(paymentStatusName);
			builder.append(", ");
		}
		if (paymentStatusDesc != null) {
			builder.append("paymentStatusDesc=");
			builder.append(paymentStatusDesc);
		}
		builder.append("]");
		return builder.toString();
	}
}
