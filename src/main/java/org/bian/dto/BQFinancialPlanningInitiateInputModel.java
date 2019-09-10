package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialPlanningInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQFinancialPlanningInitiateInputModelFinancialPlanningInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFinancialPlanningInitiateInputModel
 */
public class BQFinancialPlanningInitiateInputModel   {
  private BQFinancialPlanningInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;

  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private Object financialPlanningInitiateActionRecord = null;

  private BQFinancialPlanningInitiateInputModelFinancialPlanningInstanceRecord financialPlanningInstanceRecord = null;


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceRecord
   * @return consumerAdviceFulfillmentArrangementInstanceRecord
  **/

  public BQFinancialPlanningInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord getConsumerAdviceFulfillmentArrangementInstanceRecord() {
    return consumerAdviceFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceRecord(BQFinancialPlanningInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord) {
    this.consumerAdviceFulfillmentArrangementInstanceRecord = consumerAdviceFulfillmentArrangementInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return financialPlanningInitiateActionRecord
  **/

  public Object getFinancialPlanningInitiateActionRecord() {
    return financialPlanningInitiateActionRecord;
  }

  public void setFinancialPlanningInitiateActionRecord(Object financialPlanningInitiateActionRecord) {
    this.financialPlanningInitiateActionRecord = financialPlanningInitiateActionRecord;
  }


  /**
   * Get financialPlanningInstanceRecord
   * @return financialPlanningInstanceRecord
  **/

  public BQFinancialPlanningInitiateInputModelFinancialPlanningInstanceRecord getFinancialPlanningInstanceRecord() {
    return financialPlanningInstanceRecord;
  }

  public void setFinancialPlanningInstanceRecord(BQFinancialPlanningInitiateInputModelFinancialPlanningInstanceRecord financialPlanningInstanceRecord) {
    this.financialPlanningInstanceRecord = financialPlanningInstanceRecord;
  }


}

