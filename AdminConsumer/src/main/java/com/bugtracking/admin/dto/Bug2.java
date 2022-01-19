package com.bugtracking.admin.dto;

import java.sql.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import com.bugtracking.admin.enums.bugstatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Bug Entity")
public class Bug2 {
	@Min(value = 1, message = "value must atleast be 1")
	private long bugId;
	@NotEmpty
	@ApiModelProperty("Bug description should not be empty")
	private String bugDescription;
	@ApiModelProperty("Bug status should not be empty")
	private bugstatus bugStatus;
	private Date startDate;
	private Date endDate;
	private Employee2 employee;
	@NotEmpty
	@ApiModelProperty("Bug Type should not be empty")
	private String bugType;
	@NotEmpty
	@ApiModelProperty("Bug Priority should not be empty")
	private String bugPriority;
	private Project2 project;

	public Project2 getProject() {
		return project;
	}

	public void setProject(Project2 project) {
		this.project = project;
	}

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

	public Employee2 getEmployee() {
		return employee;
	}

	public void setEmployee(Employee2 employee) {
		this.employee = employee;
	}

	public Bug2(long bugId, String bugDescription, bugstatus bugStatus, Date startDate, Date endDate, Employee2 employee,
			String bugType, String bugPriority, Project2 project) {
		super();
		this.bugId = bugId;
		this.bugDescription = bugDescription;
		this.bugStatus = bugStatus;
		this.startDate = startDate;
		this.endDate = endDate;
		this.bugType = bugType;
		this.bugPriority = bugPriority;
		this.employee = employee;
		this.project = project;
	}

	public Bug2() {

	}
}
