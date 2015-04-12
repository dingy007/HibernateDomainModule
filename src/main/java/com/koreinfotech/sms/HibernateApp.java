package com.koreinfotech.sms;

import com.koreinfotech.sms.dao.ICourseStatusDAO;
import com.koreinfotech.sms.dao.IPaymentModeDAO;
import com.koreinfotech.sms.dao.IPaymentStatusDAO;
import com.koreinfotech.sms.dao.ImplCourseStatusDAO;
import com.koreinfotech.sms.dao.ImplPaymentModeDAO;
import com.koreinfotech.sms.dao.ImplPaymentStatusDAO;
import com.koreinfotech.sms.domain.CourseStatus;
import com.koreinfotech.sms.domain.PaymentMode;
import com.koreinfotech.sms.domain.PaymentStatus;
import com.koreinfotech.sms.utilities.HibernateUtils;

public class HibernateApp {

	public static void main(String[] args) {
		
		CourseStatus courseStatus1 = new CourseStatus("Core Java", "Core Java Class");
		CourseStatus courseStatus2 = new CourseStatus("Core C++", "Core C++ Class");
		CourseStatus courseStatus3 = new CourseStatus("Core Perl", "Core Perl Class");
		
		ICourseStatusDAO courseAdd = new ImplCourseStatusDAO();
//		courseAdd.addCourseStatus(courseStatus1);
//		courseAdd.addCourseStatus(courseStatus2);
//		courseAdd.addCourseStatus(courseStatus3);
		System.out.println("Completed adding Course Status");
		
		PaymentMode paymentMode1 = new PaymentMode("Cash", "Cash Payment");
		PaymentMode paymentMode2 = new PaymentMode("Cheque", "Cash Payment");
		PaymentMode paymentMode3 = new PaymentMode("Credit Card", "Cash Payment");
		
		IPaymentModeDAO paymentMode = new ImplPaymentModeDAO();
		
//		paymentMode.addPaymentMode(paymentMode1);
//		paymentMode.addPaymentMode(paymentMode2);
//		paymentMode.addPaymentMode(paymentMode3);
		
		System.out.println(paymentMode.listPaymentMode());
		String deleteStatus = (paymentMode.deletPaymentMode(2))? "Succeeded":"Failed";
		System.out.println("Trying delete Payments: " + deleteStatus);
		System.out.println("Completed adding Payment Mode");
		
		PaymentStatus paymentStatus1 = new PaymentStatus("Completed", "Payments fully made.");
		PaymentStatus paymentStatus2 = new PaymentStatus("Started", "Payments started.");
		
		IPaymentStatusDAO paymentStatusAdd = new ImplPaymentStatusDAO();
		
//		paymentStatusAdd.addPaymentStatus(paymentStatus1);
//		paymentStatusAdd.addPaymentStatus(paymentStatus2);
		System.out.println("Completed adding Payment Status");
		
		System.out.println("Explicitly closing the Hibernate Session Factory.");
		HibernateUtils.closeSessionFactory();
		
	}

}
