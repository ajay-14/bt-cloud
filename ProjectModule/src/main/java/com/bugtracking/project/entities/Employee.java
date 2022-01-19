package com.bugtracking.project.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;
@Entity
public class Employee {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long empId;
	@NotEmpty
	@ApiModelProperty("Employee name should not be empty")
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

	public String getempEmail() {
		return empEmail;
	}

	public void setempEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpContactNo() {
		return empContactNo;
	}

	public void setEmpContactNo(String empContactNo) {
		this.empContactNo = empContactNo;
	}

	public Employee() {

	}
}
