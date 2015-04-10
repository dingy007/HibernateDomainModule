package com.koreinfotech.sms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PaymentMode")
public class PaymentMode {
	@Id
	@Column(name="paymentMode_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int paymentModeId;
	@Column(name="paymentMode")
	private String paymentMode;
	@Column(name="paymentModeDesc")
	private String paymentModeDesc;
	public PaymentMode(String paymentMode, String paymentModeDesc) {
		super();
		this.paymentMode = paymentMode;
		this.paymentModeDesc = paymentModeDesc;
	}
	
	public PaymentMode() {
		super();
	}

	/**
	 * @return the paymentModeId
	 */
	public int getPaymentModeId() {
		return paymentModeId;
	}

	/**
	 * @param paymentModeId the paymentModeId to set
	 */
	public void setPaymentModeId(int paymentModeId) {
		this.paymentModeId = paymentModeId;
	}

	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}

	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
	 * @return the paymentModeDesc
	 */
	public String getPaymentModeDesc() {
		return paymentModeDesc;
	}

	/**
	 * @param paymentModeDesc the paymentModeDesc to set
	 */
	public void setPaymentModeDesc(String paymentModeDesc) {
		this.paymentModeDesc = paymentModeDesc;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentMode [paymentModeId=");
		builder.append(paymentModeId);
		builder.append(", ");
		if (paymentMode != null) {
			builder.append("paymentMode=");
			builder.append(paymentMode);
			builder.append(", ");
		}
		if (paymentModeDesc != null) {
			builder.append("paymentModeDesc=");
			builder.append(paymentModeDesc);
		}
		builder.append("]");
		return builder.toString();
	}
	
}
