package com.mna.dataCarrier.dto;

import java.time.Instant;

public class ProjectDetailsDTO {
	private String name;
	private String assignee;
	private String createdDate;
	private String location;

	
	
	public ProjectDetailsDTO(){
		
	}



	public ProjectDetailsDTO(String name, String assignee, String createdDate, String location) {
		super();
		this.name = name;
		this.assignee = assignee;
		this.createdDate = createdDate;
		this.location = location;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAssignee() {
		return assignee;
	}



	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}



	public String getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assignee == null) ? 0 : assignee.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectDetailsDTO other = (ProjectDetailsDTO) obj;
		if (assignee == null) {
			if (other.assignee != null)
				return false;
		} else if (!assignee.equals(other.assignee))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectDetailsDTO [name=");
		builder.append(name);
		builder.append(", assignee=");
		builder.append(assignee);
		builder.append(", createdDate=");
		builder.append(createdDate);
		builder.append(", location=");
		builder.append(location);
		builder.append("]");
		return builder.toString();
	}


	
	
	
}
