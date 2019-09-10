package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductGuidanceUpdateInputModelProductGuidanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceUpdateInputModel
 */
public class BQProductGuidanceUpdateInputModel   {
  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private String productGuidanceInstanceReference = null;

  private BQProductGuidanceUpdateInputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord = null;

  private Object productGuidanceUpdateActionTaskRecord = null;

  private String productGuidanceUpdateActionRequest = null;


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
   * Get productGuidanceInstanceRecord
   * @return productGuidanceInstanceRecord
  **/

  public BQProductGuidanceUpdateInputModelProductGuidanceInstanceRecord getProductGuidanceInstanceRecord() {
    return productGuidanceInstanceRecord;
  }

  public void setProductGuidanceInstanceRecord(BQProductGuidanceUpdateInputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord) {
    this.productGuidanceInstanceRecord = productGuidanceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productGuidanceUpdateActionTaskRecord
  **/

  public Object getProductGuidanceUpdateActionTaskRecord() {
    return productGuidanceUpdateActionTaskRecord;
  }

  public void setProductGuidanceUpdateActionTaskRecord(Object productGuidanceUpdateActionTaskRecord) {
    this.productGuidanceUpdateActionTaskRecord = productGuidanceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return productGuidanceUpdateActionRequest
  **/

  public String getProductGuidanceUpdateActionRequest() {
    return productGuidanceUpdateActionRequest;
  }

  public void setProductGuidanceUpdateActionRequest(String productGuidanceUpdateActionRequest) {
    this.productGuidanceUpdateActionRequest = productGuidanceUpdateActionRequest;
  }


}

