package mymoney.migiration.model;

import lombok.Data;
import mymoney.migiration.dcp.entity.FxRecord;

import java.util.List;

@Data
public class Response {
    List<FxRecord> fxRecord;

	public List<FxRecord> getFxRecord() {
		return fxRecord;
	}

	public void setFxRecord(List<FxRecord> fxRecord) {
		this.fxRecord = fxRecord;
	}
    
    
    
    
}
