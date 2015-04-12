package com.koreinfotech.sms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.koreinfotech.sms.domain.PaymentMode;
import com.koreinfotech.sms.domain.PaymentStatus;
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
		boolean deleteSuccess = false;
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();

		PaymentStatus remPaymentStatus = (PaymentStatus) session.load(PaymentStatus.class, paymentStatusId);
		try {
			System.out.println("Checking if Item exists in DB... " + remPaymentStatus);
		}
		catch(ObjectNotFoundException err) {
			System.out.println("Item with ID: ["+ paymentStatusId +"] was not found.");
			HibernateUtils.closeSession(session);
			return deleteSuccess;
		}
		System.out.println("Proceeding to delete Item ["+ paymentStatusId +"].");
		session.delete(remPaymentStatus);
		tx.commit();
		//Explicitly checking if the Item is still found in the Database.
		remPaymentStatus = (PaymentStatus) session.load(PaymentStatus.class, paymentStatusId);
		try {
			System.out.println("Re-checking if Item exists in DB... "+remPaymentStatus);
		}
		catch(ObjectNotFoundException err) {
			System.out.println("Item with ID: ["+ paymentStatusId +"] was not found. Delete Succeeded.");
			deleteSuccess=true;
		}
		HibernateUtils.closeSession(session);
		return deleteSuccess;
	}

	@Override
	public List<PaymentStatus> listPaymentStatus() {
		Session session = HibernateUtils.openSession();
		Query query = session.createQuery("from PaymentStatus");
		@SuppressWarnings("unchecked")
		List<PaymentStatus> paymentStatusList = (ArrayList<PaymentStatus>) query.list();
		HibernateUtils.closeSession(session);
		return paymentStatusList;
	}

	@Override
	public PaymentStatus getPaymentStatusByName(String paymentStatusName) {
/*		Session session = HibernateUtils.openSession();
		PaymentStatus paymentStatus = (PaymentStatus) session.get(PaymentStatus.class, paymentStatusName);
		HibernateUtils.closeSession(session);
		return paymentStatus;*/
		
		return null;
	}

	@Override
	public PaymentStatus getPaymentStatusById(int paymentStatusId) {
		Session session = HibernateUtils.openSession();
		PaymentStatus paymentStatus = (PaymentStatus) session.get(PaymentStatus.class, paymentStatusId);
		HibernateUtils.closeSession(session);
		return paymentStatus;
	}

}
