package com.koreinfotech.sms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CourseStatus")
public class CourseStatus {
	@Id
	@Column(name="coursestatus_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int courseStatusId;
	@Column(name="courseStatusName")
	private String courseStatusName;
	@Column(name="courseStatusDesc")
	private String courseStatusDesc;
	
	//Constructor
	public CourseStatus(String courseStatusName, String courseStatusDesc) {
		super();
		this.courseStatusName = courseStatusName;
		this.courseStatusDesc = courseStatusDesc;
	}
	//Default constructor
	public CourseStatus(){
		super();
	}
	/**
	 * @return the courseStatusId
	 */
	public int getCourseStatusId() {
		return courseStatusId;
	}
	/**
	 * @param courseStatusId the courseStatusId to set
	 */
	public void setCourseStatusId(int courseStatusId) {
		this.courseStatusId = courseStatusId;
	}
	/**
	 * @return the courseStatusName
	 */
	public String getCourseStatusName() {
		return courseStatusName;
	}
	/**
	 * @param courseStatusName the courseStatusName to set
	 */
	public void setCourseStatusName(String courseStatusName) {
		this.courseStatusName = courseStatusName;
	}
	/**
	 * @return the courseStatusDesc
	 */
	public String getCourseStatusDesc() {
		return courseStatusDesc;
	}
	/**
	 * @param courseStatusDesc the courseStatusDesc to set
	 */
	public void setCourseStatusDesc(String courseStatusDesc) {
		this.courseStatusDesc = courseStatusDesc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CourseStatus [courseStatusId=");
		builder.append(courseStatusId);
		builder.append(", ");
		if (courseStatusName != null) {
			builder.append("courseStatusName=");
			builder.append(courseStatusName);
			builder.append(", ");
		}
		if (courseStatusDesc != null) {
			builder.append("courseStatusDesc=");
			builder.append(courseStatusDesc);
		}
		builder.append("]");
		return builder.toString();
	}
}
