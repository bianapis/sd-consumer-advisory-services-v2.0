package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductGuidanceRequestInputModelProductGuidanceInstanceRecord;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceRequestInputModel
 */
public class BQProductGuidanceRequestInputModel   {
  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private String productGuidanceInstanceReference = null;

  private BQProductGuidanceRequestInputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord = null;

  private Object productGuidanceRequestActionTaskRecord = null;

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

  public BQProductGuidanceRequestInputModelProductGuidanceInstanceRecord getProductGuidanceInstanceRecord() {
    return productGuidanceInstanceRecord;
  }

  public void setProductGuidanceInstanceRecord(BQProductGuidanceRequestInputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord) {
    this.productGuidanceInstanceRecord = productGuidanceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productGuidanceRequestActionTaskRecord
  **/

  public Object getProductGuidanceRequestActionTaskRecord() {
    return productGuidanceRequestActionTaskRecord;
  }

  public void setProductGuidanceRequestActionTaskRecord(Object productGuidanceRequestActionTaskRecord) {
    this.productGuidanceRequestActionTaskRecord = productGuidanceRequestActionTaskRecord;
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

