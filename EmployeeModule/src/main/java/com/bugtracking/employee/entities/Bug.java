package com.bugtracking.employee.entities;

import java.sql.Date;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import com.bugtracking.employee.enums.bugstatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Bug Entity")
public class Bug {
	@Id
	@Min(value = 1, message = "value must atleast be 1")
	private long bugId;
	@NotEmpty
	@ApiModelProperty("Bug description should not be empty")
	private String bugDescription;
	@NotEmpty
	@ApiModelProperty("Bug status should not be empty")
	private bugstatus bugStatus;
	private Date startDate;
	private Date endDate;
	@ManyToOne
	private Employee employee;
	@NotEmpty
	@ApiModelProperty("Bug Type should not be empty")
	private String bugType;
	@NotEmpty
	@ApiModelProperty("Bug Priority should not be empty")
	private String bugPriority;


	public long getBugId() {
		return bugId;
	}

	public void setBugId(long bugId) {
		this.bugId = bugId;
	}

	public String getBugDescription() {
		return bugDescription;
	}

	public void setBugDescription(String bugDescription) {
		this.bugDescription = bugDescription;
	}

	public bugstatus getBugStatus() {
		return bugStatus;
	}

	public void setBugStatus(bugstatus bugStatus) {
		this.bugStatus = bugStatus;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getBugType() {
		return bugType;
	}

	public void setBugType(String bugType) {
		this.bugType = bugType;
	}

	public String getBugPriority() {
		return bugPriority;
	}

	public void setBugPriority(String bugPriority) {
		this.bugPriority = bugPriority;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Bug(long bugId, String bugDescription, bugstatus bugStatus, Date startDate, Date endDate, Employee employee,
			String bugType, String bugPriority) {
		super();
		this.bugId = bugId;
		this.bugDescription = bugDescription;
		this.bugStatus = bugStatus;
		this.startDate = startDate;
		this.endDate = endDate;
		this.bugType = bugType;
		this.bugPriority = bugPriority;
		this.employee = employee;
	}

	public Bug() {

	}
}
