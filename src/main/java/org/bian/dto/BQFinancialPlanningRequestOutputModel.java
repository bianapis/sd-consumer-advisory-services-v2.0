package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialPlanningRequestInputModelFinancialPlanningInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFinancialPlanningRequestOutputModel
 */
public class BQFinancialPlanningRequestOutputModel   {
  private BQFinancialPlanningRequestInputModelFinancialPlanningInstanceRecord financialPlanningInstanceRecord = null;

  private String financialPlanningRequestActionTaskReference = null;

  private Object financialPlanningRequestActionTaskRecord = null;

  private String financialPlanningRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get financialPlanningInstanceRecord
   * @return financialPlanningInstanceRecord
  **/

  public BQFinancialPlanningRequestInputModelFinancialPlanningInstanceRecord getFinancialPlanningInstanceRecord() {
    return financialPlanningInstanceRecord;
  }

  public void setFinancialPlanningInstanceRecord(BQFinancialPlanningRequestInputModelFinancialPlanningInstanceRecord financialPlanningInstanceRecord) {
    this.financialPlanningInstanceRecord = financialPlanningInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Planning instance request service call 
   * @return financialPlanningRequestActionTaskReference
  **/

  public String getFinancialPlanningRequestActionTaskReference() {
    return financialPlanningRequestActionTaskReference;
  }

  public void setFinancialPlanningRequestActionTaskReference(String financialPlanningRequestActionTaskReference) {
    this.financialPlanningRequestActionTaskReference = financialPlanningRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return financialPlanningRequestActionTaskRecord
  **/

  public Object getFinancialPlanningRequestActionTaskRecord() {
    return financialPlanningRequestActionTaskRecord;
  }

  public void setFinancialPlanningRequestActionTaskRecord(Object financialPlanningRequestActionTaskRecord) {
    this.financialPlanningRequestActionTaskRecord = financialPlanningRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Planning service request record 
   * @return financialPlanningRequestRecordReference
  **/

  public String getFinancialPlanningRequestRecordReference() {
    return financialPlanningRequestRecordReference;
  }

  public void setFinancialPlanningRequestRecordReference(String financialPlanningRequestRecordReference) {
    this.financialPlanningRequestRecordReference = financialPlanningRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

