package mymoney.migiration.dcp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;


// reading data from collaboration

@Entity
@Table(name = "amm_fx_record")
public class FxRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "FX_RECORD_ID")
	private Integer fxRecordId;

	@Lob
	@Column(name = "FX_FORM_REQUEST_INFO")
	private String fxFormRequestInfo;

	public Integer getFxRecordId() {
		return fxRecordId;
	}

	public void setFxRecordId(Integer fxRecordId) {
		this.fxRecordId = fxRecordId;
	}

	public String getFxFormRequestInfo() {
		return fxFormRequestInfo;
	}

	public void setFxFormRequestInfo(String fxFormRequestInfo) {
		this.fxFormRequestInfo = fxFormRequestInfo;
	}


	/*@Column(name = "STATUS")
	private Integer status;
	
	@Column(name = "ADMIN_VISIBLE")
	private Integer adminVisible;
	
	@Column(name = "CUST_VISIBLE")
	private Integer custVisible;
	
	@Column(name = "REGION")
	private Integer region;
	
	@Column(name = "CASE_TITLE")
	private Integer caseTitle;
	
	@Column(name = "CASE_TYPE")
	private Integer caseType;
	
	@Column(name = "CATEGORY")
	private Integer category;
	
	@Column(name = "DEPARTMENT")
	private Integer department;
	
	@Column(name = "VERSION")
	private Integer version;
	
	@Column(name = "FX_SIGNATURE_PROVIDED")
	private String fxSignatureProvided;
	
	@Column(name = "FX_USER_NAME")
	private String fxUserName;
	
	@Column(name = "REFERENCE_NO")
	private String referenceNo;
	
	@Column(name = "SBP_REF")
	private String sbpRef;
	
	@Column(name = "CASE_MODE")
	private String caseMode;
	
	@Column(name = "FORM_M_NO")
	private String formMNo;
	
	@Column(name = "WORKFLOW_REF_NO")
	private String workflowRefNo;
	
	@Column(name = "BANK_CLIENT_CODE")
	private String bankClientCode;
	
	@Column(name = "REMARKS")
	private String remarks;
	
	@Column(name = "SUBMITTED_ON")
	private Date submittedOn;
	
	@Column(name = "MODIFIED")
	private Date   modified;
	

	public Integer getFxRecordId() {
		return fxRecordId;
	}

	public void setFxRecordId(Integer fxRecordId) {
		this.fxRecordId = fxRecordId;
	}

	public String getFxFormRequestInfo() {
		return fxFormRequestInfo;
	}

	public void setFxFormRequestInfo(String fxFormRequestInfo) {
		this.fxFormRequestInfo = fxFormRequestInfo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getAdminVisible() {
		return adminVisible;
	}

	public void setAdminVisible(Integer adminVisible) {
		this.adminVisible = adminVisible;
	}

	public Integer getCustVisible() {
		return custVisible;
	}

	public void setCustVisible(Integer custVisible) {
		this.custVisible = custVisible;
	}

	public Integer getRegion() {
		return region;
	}

	public void setRegion(Integer region) {
		this.region = region;
	}

	public Integer getCaseTitle() {
		return caseTitle;
	}

	public void setCaseTitle(Integer caseTitle) {
		this.caseTitle = caseTitle;
	}

	public Integer getCaseType() {
		return caseType;
	}

	public void setCaseType(Integer caseType) {
		this.caseType = caseType;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getFxSignatureProvided() {
		return fxSignatureProvided;
	}

	public void setFxSignatureProvided(String fxSignatureProvided) {
		this.fxSignatureProvided = fxSignatureProvided;
	}

	public String getFxUserName() {
		return fxUserName;
	}

	public void setFxUserName(String fxUserName) {
		this.fxUserName = fxUserName;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getSbpRef() {
		return sbpRef;
	}

	public void setSbpRef(String sbpRef) {
		this.sbpRef = sbpRef;
	}

	public String getCaseMode() {
		return caseMode;
	}

	public void setCaseMode(String caseMode) {
		this.caseMode = caseMode;
	}

	public String getFormMNo() {
		return formMNo;
	}

	public void setFormMNo(String formMNo) {
		this.formMNo = formMNo;
	}

	public String getWorkflowRefNo() {
		return workflowRefNo;
	}

	public void setWorkflowRefNo(String workflowRefNo) {
		this.workflowRefNo = workflowRefNo;
	}

	public String getBankClientCode() {
		return bankClientCode;
	}

	public void setBankClientCode(String bankClientCode) {
		this.bankClientCode = bankClientCode;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	 @Column(name="timeStamp", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	 @Temporal(TemporalType.TIMESTAMP)
	 public Date getModified() {
       return modified;
     }

	 public void setModified(Date modified) {
       this.modified = modified;
	  }

      @Column(name="timeStamp", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
      @Temporal(TemporalType.TIMESTAMP)
      public Date getSubmittedOn() {
        return submittedOn;
      }

      public void setSumbittedOn(Date submittedOn) {
    	  this.submittedOn = submittedOn;
	  }
		*/

}