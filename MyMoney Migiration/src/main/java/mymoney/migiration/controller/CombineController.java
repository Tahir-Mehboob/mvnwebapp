package mymoney.migiration.controller;

import java.util.List;
import java.util.*;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mymoney.migiration.dcp.entity.FxRecord;
import mymoney.migiration.dcp.repository.FxRecordRepository;
import mymoney.migiration.Collaboration.entity.CollaborationFxRecord;
import mymoney.migiration.Collaboration.repository.CollaborationFxRecordRepository;

@RestController
public class CombineController {

	 @Autowired
	 FxRecordRepository fxRecordRepository;
	 
	 @Autowired
	 CollaborationFxRecordRepository collaborationFxRecordRepository;
	 
  /*  @GetMapping(value = "/")
    public Response getResponse(){
        Response response = new Response();
        response.setFxRecord(fxRecordRepository.findAll());
        return response;
    }	*/
    
    @GetMapping("/fxrecords")
    public  List<FxRecord>  listAll(Model model) {
    	
    	int recordNo = 0;
    	
        List<FxRecord> listFxRecords = fxRecordRepository.findAll();
        
        JSONObject dynamicFieldValueMapObj = null;
        
        if (listFxRecords != null) {
            for (FxRecord fxRecordData : listFxRecords) {
            	
                String content =fxRecordData.getFxFormRequestInfo();
                if(content != null) {
                recordNo++;
                Integer fxRecordId  = fxRecordData.getFxRecordId();
               /* Integer status = fxRecordData.getStatus();
                Integer adminVisible = fxRecordData.getAdminVisible();
                Integer custVisible = fxRecordData.getCustVisible();
                Integer region = fxRecordData.getRegion();
                Integer caseTitle = fxRecordData.getCaseTitle();
                Integer caseType = fxRecordData.getCaseType();
                Integer category = fxRecordData.getCategory();
                Integer department = fxRecordData.getDepartment();
                Integer version = fxRecordData.getVersion();

                String fxSignatureProvided = fxRecordData.getFxSignatureProvided();
                String fxUsername = fxRecordData.getFxUserName();
                String referenceNo = fxRecordData.getReferenceNo();
                String sbpRef = fxRecordData.getSbpRef();
                String caseMode = fxRecordData.getCaseMode();
                String formMNo = fxRecordData.getFormMNo();
                String workflowRefNo = fxRecordData.getWorkflowRefNo();
                String bankClientCode = fxRecordData.getBankClientCode();
                String remarks = fxRecordData.getRemarks();

                Date submittedOn = fxRecordData.getSubmittedOn();
                Date modified = fxRecordData.getModified();*/
                
                
               // JSONObject jsonObj = new JSONObject(content);
               // dynamicFieldValueMapObj = jsonObj.getJSONObject("dynamicFieldValueMap");
                //System.out.println("dynamicFieldValueMapObj: "+ dynamicFieldValueMapObj);
           
                CollaborationFxRecord cbFxRecord = new CollaborationFxRecord();
                
              /*  for (String keyStr : dynamicFieldValueMapObj.keySet()) {
                    Object keyvalue = dynamicFieldValueMapObj.get(keyStr);
                    //	System.out.println(keyStr +" --- "+keyvalue);
                    	if(keyStr != null) {
                    	 if(keyStr.equals("formMNo")) {
                      	   tfFxRecord.setFormMNo(keyvalue.equals(null) ? null : keyvalue.toString());
                         }else if(keyStr.equals("taxWillBeBorneBy")) {
                      	   tfFxRecord.setTaxWillBeBornBy(keyvalue.equals(null) ? null : keyvalue.toString());
                         }else if(keyStr.equals("applicantName") || keyStr.equals("applicantsNamepr")) {
                      	   tfFxRecord.setApplicantName(keyvalue.equals(null) ? null : keyvalue.toString());
                         }else if(keyStr.equals("briefProfile")) {
                      	   tfFxRecord.setBriefProfile(keyvalue.equals(null) ? null : keyvalue.toString());
                         }else if(keyStr.equals("ntn") || keyStr.equals("ntn8")) {
                      	   tfFxRecord.setNtn(keyvalue.equals(null) ? null : keyvalue.toString());
                         }else if(keyStr.equals("address") || keyStr.equals("address6") ) {
                      	   tfFxRecord.setAddress(keyvalue.equals(null) ? null : keyvalue.toString());
                         }else if(keyStr.equals("emailId")) {
                      	   tfFxRecord.setEmailId(keyvalue.equals(null) ? null : keyvalue.toString());
                        // }else if(map.containsKey("formMNo")) {
                      	   
                         }else if(keyStr.equals("ownershipStructure")) {
                      	   tfFxRecord.setOwnershipStructure(keyvalue.equals(null) ? null : keyvalue.toString());
                         }else if(keyStr.equals("beneficiaryName") || keyStr.equals("beneficiaryNamepr")) {
                      	   tfFxRecord.setBeneficiaryName(keyvalue.equals(null) ? null : keyvalue.toString());
                         }else if(keyStr.equals("country")) {
                      	   tfFxRecord.setCountry(keyvalue.equals(null) ? null : keyvalue.toString());
                         }else if(keyStr.equals("currency")) {
                      	   tfFxRecord.setCurrency(keyvalue.equals(null) ? null : keyvalue.toString());
                         }else if(keyStr.equals("requestedAmount") || keyStr.equals("amount")) {
                      	   tfFxRecord.setRequestedAmount(keyvalue.equals(null) ? null : keyvalue.toString());
                         }
                    	}
                }*/
               // System.out.println(recordNo +"  record inserted successfully ");
               // break;

                    cbFxRecord.setFxRecordId(fxRecordId);
                    cbFxRecord.setFxFormRequestInfo(content);
               /* tfFxRecord.setStatus(status);
                tfFxRecord.setAdminVisible(adminVisible);
                tfFxRecord.setCustVisible(custVisible);
                tfFxRecord.setRegion(region);
                tfFxRecord.setCaseTitle(caseTitle);
                tfFxRecord.setCaseType(caseType);
                tfFxRecord.setCategory(category);
                tfFxRecord.setDepartment(department);
                tfFxRecord.setVersion(version);
                
                tfFxRecord.setFxSignatureProvided(fxSignatureProvided);
                tfFxRecord.setFxUserName(fxUsername);
                tfFxRecord.setReferenceNo(referenceNo);
                tfFxRecord.setSbpRef(sbpRef);
                tfFxRecord.setCaseMode(caseMode);
                tfFxRecord.setFormMNo(formMNo);
                tfFxRecord.setWorkflowRefNo(workflowRefNo);
                tfFxRecord.setBankClientCode(bankClientCode);
                tfFxRecord.setRemarks(remarks);
                
                tfFxRecord.setModified(modified);
                tfFxRecord.setSubmittedOn(submittedOn);*/
                
                CollaborationFxRecordRepository.save(cbFxRecord);
                System.out.println(recordNo +"  record inserted successfully ");
                
                }   
            }
            System.out.println(" Total record :  "+ recordNo); 
        }

        model.addAttribute("listRecords", listFxRecords);
        return null;
    }
     
    
}
