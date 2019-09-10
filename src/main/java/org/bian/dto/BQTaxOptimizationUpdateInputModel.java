package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationUpdateInputModel
 */
public class BQTaxOptimizationUpdateInputModel   {
  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private String taxOptimizationInstanceReference = null;

  private BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord = null;

  private Object taxOptimizationUpdateActionTaskRecord = null;

  private String taxOptimizationUpdateActionRequest = null;


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
   * Get taxOptimizationInstanceRecord
   * @return taxOptimizationInstanceRecord
  **/

  public BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecord getTaxOptimizationInstanceRecord() {
    return taxOptimizationInstanceRecord;
  }

  public void setTaxOptimizationInstanceRecord(BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord) {
    this.taxOptimizationInstanceRecord = taxOptimizationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return taxOptimizationUpdateActionTaskRecord
  **/

  public Object getTaxOptimizationUpdateActionTaskRecord() {
    return taxOptimizationUpdateActionTaskRecord;
  }

  public void setTaxOptimizationUpdateActionTaskRecord(Object taxOptimizationUpdateActionTaskRecord) {
    this.taxOptimizationUpdateActionTaskRecord = taxOptimizationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return taxOptimizationUpdateActionRequest
  **/

  public String getTaxOptimizationUpdateActionRequest() {
    return taxOptimizationUpdateActionRequest;
  }

  public void setTaxOptimizationUpdateActionRequest(String taxOptimizationUpdateActionRequest) {
    this.taxOptimizationUpdateActionRequest = taxOptimizationUpdateActionRequest;
  }


}

