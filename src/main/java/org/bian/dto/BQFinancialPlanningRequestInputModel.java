package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialPlanningRequestInputModelFinancialPlanningInstanceRecord;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQFinancialPlanningRequestInputModel
 */
public class BQFinancialPlanningRequestInputModel   {
  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private String financialPlanningInstanceReference = null;

  private BQFinancialPlanningRequestInputModelFinancialPlanningInstanceRecord financialPlanningInstanceRecord = null;

  private Object financialPlanningRequestActionTaskRecord = null;

  private CRConsumerAdviceFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Consumer Advice Fulfillment Arrangement instance 
   * @return consumerAdviceFulfillmentArrangementInstanceReference
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceReference() {
    return consumerAdviceFulfillmentArrangementInstanceReference;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceReference(String consumerAdviceFulfillmentArrangementInstanceReference) {
    this.consumerAdviceFulfillmentArrangementInstanceReference = consumerAdviceFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Planning instance 
   * @return financialPlanningInstanceReference
  **/

  public String getFinancialPlanningInstanceReference() {
    return financialPlanningInstanceReference;
  }

  public void setFinancialPlanningInstanceReference(String financialPlanningInstanceReference) {
    this.financialPlanningInstanceReference = financialPlanningInstanceReference;
  }


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRConsumerAdviceFulfillmentArrangementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRConsumerAdviceFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

