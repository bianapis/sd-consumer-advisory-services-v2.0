package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialPlanningUpdateInputModelFinancialPlanningInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFinancialPlanningUpdateInputModel
 */
public class BQFinancialPlanningUpdateInputModel   {
  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private String financialPlanningInstanceReference = null;

  private BQFinancialPlanningUpdateInputModelFinancialPlanningInstanceRecord financialPlanningInstanceRecord = null;

  private Object financialPlanningUpdateActionTaskRecord = null;

  private String financialPlanningUpdateActionRequest = null;


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

  public BQFinancialPlanningUpdateInputModelFinancialPlanningInstanceRecord getFinancialPlanningInstanceRecord() {
    return financialPlanningInstanceRecord;
  }

  public void setFinancialPlanningInstanceRecord(BQFinancialPlanningUpdateInputModelFinancialPlanningInstanceRecord financialPlanningInstanceRecord) {
    this.financialPlanningInstanceRecord = financialPlanningInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return financialPlanningUpdateActionTaskRecord
  **/

  public Object getFinancialPlanningUpdateActionTaskRecord() {
    return financialPlanningUpdateActionTaskRecord;
  }

  public void setFinancialPlanningUpdateActionTaskRecord(Object financialPlanningUpdateActionTaskRecord) {
    this.financialPlanningUpdateActionTaskRecord = financialPlanningUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return financialPlanningUpdateActionRequest
  **/

  public String getFinancialPlanningUpdateActionRequest() {
    return financialPlanningUpdateActionRequest;
  }

  public void setFinancialPlanningUpdateActionRequest(String financialPlanningUpdateActionRequest) {
    this.financialPlanningUpdateActionRequest = financialPlanningUpdateActionRequest;
  }


}

