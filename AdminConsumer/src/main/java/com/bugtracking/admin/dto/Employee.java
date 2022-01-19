package com.bugtracking.admin.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

public class Employee {
	private long empId;
	@ApiModelProperty("Employee name should not be empty")
	@NotEmpty
	public String empName;
	@ApiModelProperty("Employee email should not be empty")
	@NotEmpty
	@Email
	private String empEmail;
	@ApiModelProperty("Employee contactno should not be empty")
	@NotEmpty
	@Size(min=10,max=10)
	private String empContactNo;

	public Employee(long empId, String empName, String empEmail, String empContactNo, long projectId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empContactNo = empContactNo;
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

	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public Employee() {

	}
}
