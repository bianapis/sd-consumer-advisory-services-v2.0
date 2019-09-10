package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTaxOptimizationInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQTaxOptimizationInitiateOutputModelTaxOptimizationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationInitiateOutputModel
 */
public class BQTaxOptimizationInitiateOutputModel   {
  private BQTaxOptimizationInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;

  private String taxOptimizationInstanceReference = null;

  private String taxOptimizationInitiateActionReference = null;

  private Object taxOptimizationInitiateActionRecord = null;

  private String taxOptimizationInstanceStatus = null;

  private BQTaxOptimizationInitiateOutputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord = null;


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceRecord
   * @return consumerAdviceFulfillmentArrangementInstanceRecord
  **/

  public BQTaxOptimizationInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord getConsumerAdviceFulfillmentArrangementInstanceRecord() {
    return consumerAdviceFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceRecord(BQTaxOptimizationInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord) {
    this.consumerAdviceFulfillmentArrangementInstanceRecord = consumerAdviceFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Tax Optimization instance 
   * @return taxOptimizationInstanceReference
  **/

  public String getTaxOptimizationInstanceReference() {
    return taxOptimizationInstanceReference;
  }

  public void setTaxOptimizationInstanceReference(String taxOptimizationInstanceReference) {
    this.taxOptimizationInstanceReference = taxOptimizationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return taxOptimizationInitiateActionReference
  **/

  public String getTaxOptimizationInitiateActionReference() {
    return taxOptimizationInitiateActionReference;
  }

  public void setTaxOptimizationInitiateActionReference(String taxOptimizationInitiateActionReference) {
    this.taxOptimizationInitiateActionReference = taxOptimizationInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Tax Optimization instance (e.g. initialised, pending, active) 
   * @return taxOptimizationInstanceStatus
  **/

  public String getTaxOptimizationInstanceStatus() {
    return taxOptimizationInstanceStatus;
  }

  public void setTaxOptimizationInstanceStatus(String taxOptimizationInstanceStatus) {
    this.taxOptimizationInstanceStatus = taxOptimizationInstanceStatus;
  }


  /**
   * Get taxOptimizationInstanceRecord
   * @return taxOptimizationInstanceRecord
  **/

  public BQTaxOptimizationInitiateOutputModelTaxOptimizationInstanceRecord getTaxOptimizationInstanceRecord() {
    return taxOptimizationInstanceRecord;
  }

  public void setTaxOptimizationInstanceRecord(BQTaxOptimizationInitiateOutputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord) {
    this.taxOptimizationInstanceRecord = taxOptimizationInstanceRecord;
  }


}

