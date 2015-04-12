package com.koreinfotech.sms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.koreinfotech.sms.domain.PaymentMode;
import com.koreinfotech.sms.utilities.HibernateUtils;

public class ImplPaymentModeDAO implements IPaymentModeDAO{

	@Override
	public void addPaymentMode(PaymentMode paymentMode) {
		System.out.println("Adding PaymentMode");
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(paymentMode);
		tx.commit();
		HibernateUtils.closeSession(session);
	}

	@Override
	public boolean deletPaymentMode(Integer PaymentModeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<PaymentMode> listPaymentMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentMode getPaymentModeByName(String PaymentModeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentMode getPaymentModeById(int PaymentModeId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
