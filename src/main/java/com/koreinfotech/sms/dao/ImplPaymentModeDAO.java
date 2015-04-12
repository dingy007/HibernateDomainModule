package com.koreinfotech.sms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Query;
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
	public boolean deletPaymentMode(Integer paymentModeId) {
		boolean deleteSuccess = false;
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		PaymentMode remPaymentMode = (PaymentMode) session.load(PaymentMode.class, paymentModeId);
		try {
			System.out.println("Checking if Item exists in DB... " + remPaymentMode);
		}
		catch(ObjectNotFoundException err) {
			System.out.println("Item with ID: ["+ paymentModeId +"] was not found.");
			HibernateUtils.closeSession(session);
			return deleteSuccess;
		}
		System.out.println("Proceeding to delete Item ["+ paymentModeId +"].");
		session.delete(remPaymentMode);
		tx.commit();
		//Explicitly checking if the Item is still found in the Database.
		remPaymentMode = (PaymentMode) session.load(PaymentMode.class, paymentModeId);
		try {
			System.out.println("Re-checking if Item exists in DB... "+remPaymentMode);
		}
		catch(ObjectNotFoundException err) {
			System.out.println("Item with ID: ["+ paymentModeId +"] was not found. Delete Succeeded.");
			deleteSuccess=true;
		}
		HibernateUtils.closeSession(session);
		return deleteSuccess;
	}

	@Override
	public List<PaymentMode> listPaymentMode() {
		Session session = HibernateUtils.openSession();
		Query query = session.createQuery("from PaymentMode");
		@SuppressWarnings("unchecked")
		ArrayList<PaymentMode> paymentModeList = (ArrayList<PaymentMode>) query.list();
		HibernateUtils.closeSession(session);
		return paymentModeList;
	}

	@Override
	public PaymentMode getPaymentModeByName(String PaymentModeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentMode getPaymentModeById(int PaymentModeId) {
		Session session = HibernateUtils.openSession();
		PaymentMode paymentMode = (PaymentMode) session.get(PaymentMode.class, PaymentModeId);
		HibernateUtils.closeSession(session);
		return paymentMode;
	}
	
}
