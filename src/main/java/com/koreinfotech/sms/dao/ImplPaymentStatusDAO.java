package com.koreinfotech.sms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.koreinfotech.sms.domain.PaymentStatus;
import com.koreinfotech.sms.utilities.HibernateUtils;

public class ImplPaymentStatusDAO implements IPaymentStatusDAO{

	@Override
	public void addPaymentStatus(PaymentStatus paymentStatus) {
		System.out.println("Adding PaymentMode");
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(paymentStatus);
		tx.commit();
		HibernateUtils.closeSession(session);
	}

	@Override
	public boolean deletPaymentStatus(Integer paymentStatusId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<PaymentStatus> listPaymentStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentStatus getPaymentStatusByName(String paymentStatusName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentStatus getPaymentStatusById(int paymentStatusId) {
		// TODO Auto-generated method stub
		return null;
	}

}
