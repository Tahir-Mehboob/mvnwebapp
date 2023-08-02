package mymoney.migiration.dfe.entity;

import lombok.Data;

import java.util.Date;

import javax.persistence.*;

// insert data local MyDcp

@Data
@Entity
@Table(name = "FX_RECORD")
public class CollaborationFxRecord {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FX_RECORD_ID")
    private Integer fxRecordId;
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
*//*
	@Column(name = "SUBMITTED_ON")
	private Timestamp  submittedOn;
	
	@Column(name = "MODIFIED")
	private Timestamp  modified;
	
*//*
	@Column(name = "FORM_M_NUMBER")
	private String formMNumber;
	
	@Column(name = "TAX_WILL_BE_BORN_BY")
	private String taxWillBeBornBy;
	
	@Column(name = "APPLICANT_REQUEST_FILE")
	private String applicantRequestFile;
	
	@Column(name = "AGREEMENT_FILE")
	private String agreementFile;
	
	@Column(name = "INVOICE_OR_DEBIT_NOTE_FILE")
	private String invoiceOrDebitNoteFile;
	
	@Column(name = "FORM_M_FILE")
	private String formMFile;
	
	@Column(name = "TAX_EXEMPTION_CERTIFICATE_FILE")
	private String taxExemptionCertificateFile;
	
	@Column(name = "OTHER_DOCUMENTS_FILE")
	private String otherDocumentsFile;
	
	@Column(name = "APPLICANT_NAME") 
	private String applicantName;
	
	@Column(name = "BRIEF_PROFILE")
	private String briefProfile;
	
	@Column(name = "NTN")
	private String ntn;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@Column(name = "BENEFICIARY_BRIEF_PROFILE")
	private String beneficiaryBreifProfile;
	
	@Column(name = "OWNERSHIP_STRUCTURE")
	private String ownershipStructure;
	
	@Column(name = "BENEFICIARY_NAME")
	private String beneficiaryName;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name = "REQUESTED_AMOUNT")
	private String requestedAmount;
	
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
	public String getFormMNumber() {
		return formMNumber;
	}
	public void setFormMNumber(String formMNumber) {
		this.formMNumber = formMNumber;
	}
	public String getTaxWillBeBornBy() {
		return taxWillBeBornBy;
	}
	public void setTaxWillBeBornBy(String taxWillBeBornBy) {
		this.taxWillBeBornBy = taxWillBeBornBy;
	}
	public String getApplicantRequestFile() {
		return applicantRequestFile;
	}
	public void setApplicantRequestFile(String applicantRequestFile) {
		this.applicantRequestFile = applicantRequestFile;
	}
	public String getAgreementFile() {
		return agreementFile;
	}
	public void setAgreementFile(String agreementFile) {
		this.agreementFile = agreementFile;
	}
	public String getInvoiceOrDebitNoteFile() {
		return invoiceOrDebitNoteFile;
	}
	public void setInvoiceOrDebitNoteFile(String invoiceOrDebitNoteFile) {
		this.invoiceOrDebitNoteFile = invoiceOrDebitNoteFile;
	}
	public String getFormMFile() {
		return formMFile;
	}
	public void setFormMFile(String formMFile) {
		this.formMFile = formMFile;
	}
	public String getTaxExemptionCertificateFile() {
		return taxExemptionCertificateFile;
	}
	public void setTaxExemptionCertificateFile(String taxExemptionCertificateFile) {
		this.taxExemptionCertificateFile = taxExemptionCertificateFile;
	}
	public String getOtherDocumentsFile() {
		return otherDocumentsFile;
	}
	public void setOtherDocumentsFile(String otherDocumentsFile) {
		this.otherDocumentsFile = otherDocumentsFile;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getBriefProfile() {
		return briefProfile;
	}
	public void setBriefProfile(String briefProfile) {
		this.briefProfile = briefProfile;
	}
	public String getNtn() {
		return ntn;
	}
	public void setNtn(String ntn) {
		this.ntn = ntn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getBeneficiaryBreifProfile() {
		return beneficiaryBreifProfile;
	}
	public void setBeneficiaryBreifProfile(String beneficiaryBreifProfile) {
		this.beneficiaryBreifProfile = beneficiaryBreifProfile;
	}
	public String getOwnershipStructure() {
		return ownershipStructure;
	}
	public void setOwnershipStructure(String ownershipStructure) {
		this.ownershipStructure = ownershipStructure;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getRequestedAmount() {
		return requestedAmount;
	}
	public void setRequestedAmount(String requestedAmount) {
		this.requestedAmount = requestedAmount;
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

      public void setSubmittedOn(Date submittedOn) {
    	  this.submittedOn = submittedOn;
	  }
    */
}
