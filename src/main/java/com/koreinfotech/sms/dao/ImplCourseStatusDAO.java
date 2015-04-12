package com.koreinfotech.sms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;

import com.koreinfotech.sms.domain.CourseStatus;
import com.koreinfotech.sms.domain.PaymentMode;
import com.koreinfotech.sms.utilities.HibernateUtils;

public class ImplCourseStatusDAO implements ICourseStatusDAO{

	@Override
	public void addCourseStatus(CourseStatus courseStatus) {
		System.out.println("Adding Course");
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(courseStatus);
		tx.commit();
		HibernateUtils.closeSession(session);
	}

	@Override
	public boolean deletCourseStatus(Integer courseStatusId) {
		boolean deleteSuccess = false;
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		CourseStatus remCouseStatus = (CourseStatus) session.load(CourseStatus.class, courseStatusId);
		try {
			System.out.println("Checking if Item exists in DB... " + remCouseStatus);
		}
		catch(ObjectNotFoundException err) {
			System.out.println("Item with ID: ["+ courseStatusId +"] was not found.");
			HibernateUtils.closeSession(session);
			return deleteSuccess;
		}
		System.out.println("Proceeding to delete Item ["+ courseStatusId +"].");
		session.delete(remCouseStatus);
		tx.commit();
		//Explicitly checking if the Item is still found in the Database.
		remCouseStatus = (CourseStatus) session.load(CourseStatus.class, courseStatusId);
		try {
			System.out.println("Re-checking if Item exists in DB... "+remCouseStatus);
		}
		catch(ObjectNotFoundException err) {
			System.out.println("Item with ID: ["+ courseStatusId +"] was not found. Delete Succeeded.");
			deleteSuccess=true;
		}
		HibernateUtils.closeSession(session);
		return deleteSuccess;
	}

	@Override
	public List<CourseStatus> listCourseStatus() {
		Session session = HibernateUtils.openSession();
		Query query = session.createQuery("from CourseStatus");
		ArrayList<CourseStatus> courseStatusList = (ArrayList<CourseStatus>) query.list();
		HibernateUtils.closeSession(session);
		return courseStatusList;
	}

	@Override
	public CourseStatus getCourseStatusByName(String CourseStatusName) {
		//TODO
		return null;
	}

	@Override
	public CourseStatus getCourseStatusById(int courseStatusId) {
		Session session = HibernateUtils.openSession();
		CourseStatus courseStatus = (CourseStatus) session.get(CourseStatus.class, courseStatusId);
		HibernateUtils.closeSession(session);
		return courseStatus;
	}
	
}
