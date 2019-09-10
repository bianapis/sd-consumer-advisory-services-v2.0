package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductGuidanceInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQProductGuidanceInitiateOutputModelProductGuidanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceInitiateOutputModel
 */
public class BQProductGuidanceInitiateOutputModel   {
  private BQProductGuidanceInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;

  private String productGuidanceInstanceReference = null;

  private String productGuidanceInitiateActionReference = null;

  private Object productGuidanceInitiateActionRecord = null;

  private String productGuidanceInstanceStatus = null;

  private BQProductGuidanceInitiateOutputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord = null;


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceRecord
   * @return consumerAdviceFulfillmentArrangementInstanceRecord
  **/

  public BQProductGuidanceInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord getConsumerAdviceFulfillmentArrangementInstanceRecord() {
    return consumerAdviceFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceRecord(BQProductGuidanceInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord) {
    this.consumerAdviceFulfillmentArrangementInstanceRecord = consumerAdviceFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Guidance instance 
   * @return productGuidanceInstanceReference
  **/

  public String getProductGuidanceInstanceReference() {
    return productGuidanceInstanceReference;
  }

  public void setProductGuidanceInstanceReference(String productGuidanceInstanceReference) {
    this.productGuidanceInstanceReference = productGuidanceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return productGuidanceInitiateActionReference
  **/

  public String getProductGuidanceInitiateActionReference() {
    return productGuidanceInitiateActionReference;
  }

  public void setProductGuidanceInitiateActionReference(String productGuidanceInitiateActionReference) {
    this.productGuidanceInitiateActionReference = productGuidanceInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return productGuidanceInitiateActionRecord
  **/

  public Object getProductGuidanceInitiateActionRecord() {
    return productGuidanceInitiateActionRecord;
  }

  public void setProductGuidanceInitiateActionRecord(Object productGuidanceInitiateActionRecord) {
    this.productGuidanceInitiateActionRecord = productGuidanceInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product Guidance instance (e.g. initialised, pending, active) 
   * @return productGuidanceInstanceStatus
  **/

  public String getProductGuidanceInstanceStatus() {
    return productGuidanceInstanceStatus;
  }

  public void setProductGuidanceInstanceStatus(String productGuidanceInstanceStatus) {
    this.productGuidanceInstanceStatus = productGuidanceInstanceStatus;
  }


  /**
   * Get productGuidanceInstanceRecord
   * @return productGuidanceInstanceRecord
  **/

  public BQProductGuidanceInitiateOutputModelProductGuidanceInstanceRecord getProductGuidanceInstanceRecord() {
    return productGuidanceInstanceRecord;
  }

  public void setProductGuidanceInstanceRecord(BQProductGuidanceInitiateOutputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord) {
    this.productGuidanceInstanceRecord = productGuidanceInstanceRecord;
  }


}

