package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductGuidanceInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQProductGuidanceInitiateInputModelProductGuidanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceInitiateInputModel
 */
public class BQProductGuidanceInitiateInputModel   {
  private BQProductGuidanceInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;

  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private Object productGuidanceInitiateActionRecord = null;

  private BQProductGuidanceInitiateInputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord = null;


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceRecord
   * @return consumerAdviceFulfillmentArrangementInstanceRecord
  **/

  public BQProductGuidanceInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord getConsumerAdviceFulfillmentArrangementInstanceRecord() {
    return consumerAdviceFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceRecord(BQProductGuidanceInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord) {
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
   * @return productGuidanceInitiateActionRecord
  **/

  public Object getProductGuidanceInitiateActionRecord() {
    return productGuidanceInitiateActionRecord;
  }

  public void setProductGuidanceInitiateActionRecord(Object productGuidanceInitiateActionRecord) {
    this.productGuidanceInitiateActionRecord = productGuidanceInitiateActionRecord;
  }


  /**
   * Get productGuidanceInstanceRecord
   * @return productGuidanceInstanceRecord
  **/

  public BQProductGuidanceInitiateInputModelProductGuidanceInstanceRecord getProductGuidanceInstanceRecord() {
    return productGuidanceInstanceRecord;
  }

  public void setProductGuidanceInstanceRecord(BQProductGuidanceInitiateInputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord) {
    this.productGuidanceInstanceRecord = productGuidanceInstanceRecord;
  }


}

