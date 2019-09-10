package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTaxOptimizationInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQTaxOptimizationInitiateInputModelTaxOptimizationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationInitiateInputModel
 */
public class BQTaxOptimizationInitiateInputModel   {
  private BQTaxOptimizationInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;

  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private Object taxOptimizationInitiateActionRecord = null;

  private BQTaxOptimizationInitiateInputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord = null;


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceRecord
   * @return consumerAdviceFulfillmentArrangementInstanceRecord
  **/

  public BQTaxOptimizationInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord getConsumerAdviceFulfillmentArrangementInstanceRecord() {
    return consumerAdviceFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceRecord(BQTaxOptimizationInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord) {
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
   * @return taxOptimizationInitiateActionRecord
  **/

  public Object getTaxOptimizationInitiateActionRecord() {
    return taxOptimizationInitiateActionRecord;
  }

  public void setTaxOptimizationInitiateActionRecord(Object taxOptimizationInitiateActionRecord) {
    this.taxOptimizationInitiateActionRecord = taxOptimizationInitiateActionRecord;
  }


  /**
   * Get taxOptimizationInstanceRecord
   * @return taxOptimizationInstanceRecord
  **/

  public BQTaxOptimizationInitiateInputModelTaxOptimizationInstanceRecord getTaxOptimizationInstanceRecord() {
    return taxOptimizationInstanceRecord;
  }

  public void setTaxOptimizationInstanceRecord(BQTaxOptimizationInitiateInputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord) {
    this.taxOptimizationInstanceRecord = taxOptimizationInstanceRecord;
  }


}

