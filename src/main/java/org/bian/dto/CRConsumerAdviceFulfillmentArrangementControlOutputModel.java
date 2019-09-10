package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementControlOutputModel
 */
public class CRConsumerAdviceFulfillmentArrangementControlOutputModel   {
  private String consumerAdviceFulfillmentArrangementControlActionTaskReference = null;

  private Object consumerAdviceFulfillmentArrangementControlActionTaskRecord = null;

  private String consumerAdviceFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Consumer Advice Fulfillment Arrangement instance control processing service call 
   * @return consumerAdviceFulfillmentArrangementControlActionTaskReference
  **/

  public String getConsumerAdviceFulfillmentArrangementControlActionTaskReference() {
    return consumerAdviceFulfillmentArrangementControlActionTaskReference;
  }

  public void setConsumerAdviceFulfillmentArrangementControlActionTaskReference(String consumerAdviceFulfillmentArrangementControlActionTaskReference) {
    this.consumerAdviceFulfillmentArrangementControlActionTaskReference = consumerAdviceFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return consumerAdviceFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getConsumerAdviceFulfillmentArrangementControlActionTaskRecord() {
    return consumerAdviceFulfillmentArrangementControlActionTaskRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementControlActionTaskRecord(Object consumerAdviceFulfillmentArrangementControlActionTaskRecord) {
    this.consumerAdviceFulfillmentArrangementControlActionTaskRecord = consumerAdviceFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return consumerAdviceFulfillmentArrangementControlActionResponse
  **/

  public String getConsumerAdviceFulfillmentArrangementControlActionResponse() {
    return consumerAdviceFulfillmentArrangementControlActionResponse;
  }

  public void setConsumerAdviceFulfillmentArrangementControlActionResponse(String consumerAdviceFulfillmentArrangementControlActionResponse) {
    this.consumerAdviceFulfillmentArrangementControlActionResponse = consumerAdviceFulfillmentArrangementControlActionResponse;
  }


}

