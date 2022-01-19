package com.bugtracking.employee.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Employee Entity")
public class EmployeeDto{
	private long empId;
	@NotEmpty
	@ApiModelProperty("name should not empty")
	private String empName;
	@NotEmpty
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
	
	public EmployeeDto(long empId, String empName, String empEmail, String empContactNo, long projectId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empContactNo = empContactNo;
	}
	
	public EmployeeDto() {
		
	}
}