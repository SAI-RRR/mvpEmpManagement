package com.app.dto;

import java.util.Calendar;

public class LeaveDetailsFormDTO {

	private Integer leave_Id;
	private Calendar leave_Balance;
	private Calendar from_Date;
	private Calendar to_date;
	private String leave_Status;
	
	
	public Integer getLeave_Id() {
		return leave_Id;
	}
	public void setLeave_Id(Integer leave_Id) {
		this.leave_Id = leave_Id;
	}
	public Calendar getLeave_Balance() {
		return leave_Balance;
	}
	public void setLeave_Balance(Calendar leave_Balance) {
		this.leave_Balance = leave_Balance;
	}
	public Calendar getFrom_Date() {
		return from_Date;
	}
	public void setFrom_Date(Calendar from_Date) {
		this.from_Date = from_Date;
	}
	public Calendar getTo_date() {
		return to_date;
	}
	public void setTo_date(Calendar to_date) {
		this.to_date = to_date;
	}
	public String getLeave_Status() {
		return leave_Status;
	}
	public void setLeave_Status(String leave_Status) {
		this.leave_Status = leave_Status;
	}
	
	
}
