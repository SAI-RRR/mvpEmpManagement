package com.app.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Leave_Request_Form")
public class LeaveRequestEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Emp_Id")
	private Long id;
	
	@Column(name="Emp_Name")
	private String empname;
	
	@Column(name="Leave_Type")
	private String leaveType;
	
	@Column(name="Emp_Start_Date")
	private Calendar empStartDate;
	
	@Column(name="Emp_End_Date")
	private Calendar empEndDate;
	
	@Column(name="Emp_Reason")
	private String empreason;
	
	public Long getId() {
		return id;
	}
	

	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getEmpname() {
		return empname;
	}
	
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
	public Calendar getEmpStartDate() {
		return empStartDate;
	}
	public void setEmpStartDate(Calendar empStartDate) {
		this.empStartDate = empStartDate;
	}
	
	
	public Calendar getEmpEndDate() {
		return empEndDate;
	}
	
	
	public void setEmpEndDate(Calendar empEndDate) {
		this.empEndDate = empEndDate;
	}
	
	
	public String getEmpreason() {
		return empreason;
	}
	public void setEmpreason(String empreason) {
		this.empreason = empreason;
	}
	
	
	public String getLeaveType() {
		return leaveType;
	}
	
	
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	
	
}
