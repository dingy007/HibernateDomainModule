package com.koreinfotech.sms.dao;

import java.util.List;

import com.koreinfotech.sms.domain.CourseStatus;

/**
 * @author Administrator
 *
 */
public interface ICourseStatusDAO {

	/**
	 * Add a new CourseStatus to the existing table.
	 * @return
	 * @param courseStatus
	 */
	public void addCourseStatus(CourseStatus courseStatus);
	/**
	 * Delete a CourseStatus based on the CourseStatusID field.
	 * @param courseStatusId
	 */
	public boolean deletCourseStatus(Integer courseStatusId);
	/**
	 * Retrieve all the CourseStatus as a List&lt;>
	 * @return List&lt;CourseStatus>
	 */
	public List<CourseStatus> listCourseStatus();
	/**
	 * Returns a CourseStatus, given the Name (String) of a CourseStatus. It may be used to search the databases.
	 * @param CourseStatusName
	 * @return
	 */
	public CourseStatus getCourseStatusByName(String CourseStatusName);
	
	/**
	 * Returns the CourseStatus given the Id(int) value of a CourseStatus.
	 * @param courseStatusId
	 * @return
	 */
	public CourseStatus getCourseStatusById(int courseStatusId);
	
}
