package com.app.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leave_request_form")
public class LeaveDetailsFormEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private Integer leave_id;
	
	@Column(name="Emp_Start_Date")
	private Calendar start_Date;
	
	@Column(name="Emp_End_Date")
	private Calendar end_Date;
	
	@Column(name = "leave_status", columnDefinition = "varchar(20) check (leave_status in ('Applied','Approved','Rejected'))")
//    @Enumerated(EnumType.STRING)
	private String leave_Status;

public Integer getLeave_id() {
		return leave_id;
	}
	public void setLeave_id(Integer leave_id) {
		this.leave_id = leave_id;
	}
	public Calendar getStart_Date() {
		return start_Date;
	}
	public void setStart_Date(Calendar start_Date) {
		this.start_Date = start_Date;
	}
	public Calendar getEnd_Date() {
		return end_Date;
	}
	public void setEnd_Date(Calendar end_Date) {
		this.end_Date = end_Date;
	}
	public String getLeave_Status() {
		return leave_Status;
	}
	public void setLeave_Status(String leave_Status) {
		this.leave_Status = leave_Status;
	}



}
