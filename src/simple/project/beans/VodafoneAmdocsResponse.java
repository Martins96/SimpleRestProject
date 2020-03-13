package simple.project.beans;

import java.util.List;

public class VodafoneAmdocsResponse {
	
	private String Status;
	private String emailAddress;
	private EntityClass entityClass; 
	private int Id;
	private List<Attributes> Attributes;
	private String type;
	private String displayName;
	private String createdDate;
	private String updatedDate;
	private String suspandedDate;
	private String deactivatedDate;
	private String activatedDate;
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public EntityClass getEntityClass() {
		return entityClass;
	}
	public void setEntityClass(EntityClass entityClass) {
		this.entityClass = entityClass;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public List<Attributes> getAttributes() {
		return Attributes;
	}
	public void setAttributes(List<Attributes> attributes) {
		Attributes = attributes;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getSuspandedDate() {
		return suspandedDate;
	}
	public void setSuspandedDate(String suspandedDate) {
		this.suspandedDate = suspandedDate;
	}
	public String getDeactivatedDate() {
		return deactivatedDate;
	}
	public void setDeactivatedDate(String deactivatedDate) {
		this.deactivatedDate = deactivatedDate;
	}
	public String getActivatedDate() {
		return activatedDate;
	}
	public void setActivatedDate(String activatedDate) {
		this.activatedDate = activatedDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Attributes == null) ? 0 : Attributes.hashCode());
		result = prime * result + Id;
		result = prime * result + ((Status == null) ? 0 : Status.hashCode());
		result = prime * result + ((activatedDate == null) ? 0 : activatedDate.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((deactivatedDate == null) ? 0 : deactivatedDate.hashCode());
		result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((entityClass == null) ? 0 : entityClass.hashCode());
		result = prime * result + ((suspandedDate == null) ? 0 : suspandedDate.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((updatedDate == null) ? 0 : updatedDate.hashCode());
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
		VodafoneAmdocsResponse other = (VodafoneAmdocsResponse) obj;
		if (Attributes == null) {
			if (other.Attributes != null)
				return false;
		} else if (!Attributes.equals(other.Attributes))
			return false;
		if (Id != other.Id)
			return false;
		if (Status == null) {
			if (other.Status != null)
				return false;
		} else if (!Status.equals(other.Status))
			return false;
		if (activatedDate == null) {
			if (other.activatedDate != null)
				return false;
		} else if (!activatedDate.equals(other.activatedDate))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (deactivatedDate == null) {
			if (other.deactivatedDate != null)
				return false;
		} else if (!deactivatedDate.equals(other.deactivatedDate))
			return false;
		if (displayName == null) {
			if (other.displayName != null)
				return false;
		} else if (!displayName.equals(other.displayName))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (entityClass != other.entityClass)
			return false;
		if (suspandedDate == null) {
			if (other.suspandedDate != null)
				return false;
		} else if (!suspandedDate.equals(other.suspandedDate))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (updatedDate == null) {
			if (other.updatedDate != null)
				return false;
		} else if (!updatedDate.equals(other.updatedDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "VodafoneAmdocsResponse [Status=" + Status + ", emailAddress=" + emailAddress + ", entityClass="
				+ entityClass + ", Id=" + Id + ", Attributes=" + Attributes + ", type=" + type + ", displayName="
				+ displayName + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", suspandedDate="
				+ suspandedDate + ", deactivatedDate=" + deactivatedDate + ", activatedDate=" + activatedDate + "]";
	}
	
	
	
	
	
}
