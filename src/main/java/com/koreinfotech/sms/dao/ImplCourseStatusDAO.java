package com.koreinfotech.sms.dao;

import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.Session;

import com.koreinfotech.sms.domain.CourseStatus;
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
		return false;
	}

	@Override
	public List<CourseStatus> listCourseStatus() {
		return null;
	}

	@Override
	public CourseStatus getCourseStatusByName(String CourseStatusName) {
		return null;
	}

	@Override
	public CourseStatus getCourseStatusById(int courseStatusId) {
		return null;
	}
	
}
