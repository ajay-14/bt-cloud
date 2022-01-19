package com.bugtracking.employee.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel("Employee Entity")
public class Employee{
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private long empId;
	@NotEmpty
	@ApiModelProperty("name should not empty")
	private String empName;
	@Email
	private String empEmail;
	@NotEmpty
	@Size(min=10,max=10)
	private String empContactNo;
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpContactNo() {
		return empContactNo;
	}
	public void setEmpContactNo(String empContactNo) {
		this.empContactNo = empContactNo;
	}
	
	public Employee(long empId, String empName, String empEmail, String empContactNo, long projectId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empContactNo = empContactNo;
	}
	
	public Employee() {
		
	}
}