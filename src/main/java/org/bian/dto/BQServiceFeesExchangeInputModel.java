package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExchangeInputModelServiceFeesExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExchangeInputModel
 */
public class BQServiceFeesExchangeInputModel   {
  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private String serviceFeesInstanceReference = null;

  private Object serviceFeesExchangeActionTaskRecord = null;

  private BQServiceFeesExchangeInputModelServiceFeesExchangeActionRequest serviceFeesExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees instance 
   * @return serviceFeesInstanceReference
  **/

  public String getServiceFeesInstanceReference() {
    return serviceFeesInstanceReference;
  }

  public void setServiceFeesInstanceReference(String serviceFeesInstanceReference) {
    this.serviceFeesInstanceReference = serviceFeesInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return serviceFeesExchangeActionTaskRecord
  **/

  public Object getServiceFeesExchangeActionTaskRecord() {
    return serviceFeesExchangeActionTaskRecord;
  }

  public void setServiceFeesExchangeActionTaskRecord(Object serviceFeesExchangeActionTaskRecord) {
    this.serviceFeesExchangeActionTaskRecord = serviceFeesExchangeActionTaskRecord;
  }


  /**
   * Get serviceFeesExchangeActionRequest
   * @return serviceFeesExchangeActionRequest
  **/

  public BQServiceFeesExchangeInputModelServiceFeesExchangeActionRequest getServiceFeesExchangeActionRequest() {
    return serviceFeesExchangeActionRequest;
  }

  public void setServiceFeesExchangeActionRequest(BQServiceFeesExchangeInputModelServiceFeesExchangeActionRequest serviceFeesExchangeActionRequest) {
    this.serviceFeesExchangeActionRequest = serviceFeesExchangeActionRequest;
  }


}

