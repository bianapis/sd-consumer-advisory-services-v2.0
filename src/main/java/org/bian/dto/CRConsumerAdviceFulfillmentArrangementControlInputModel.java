package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementControlInputModelConsumerAdviceFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementControlInputModel
 */
public class CRConsumerAdviceFulfillmentArrangementControlInputModel   {
  private String consumerAdvisoryServicesServicingSessionReference = null;

  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private Object consumerAdviceFulfillmentArrangementControlActionTaskRecord = null;

  private CRConsumerAdviceFulfillmentArrangementControlInputModelConsumerAdviceFulfillmentArrangementControlActionRequest consumerAdviceFulfillmentArrangementControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return consumerAdvisoryServicesServicingSessionReference
  **/

  public String getConsumerAdvisoryServicesServicingSessionReference() {
    return consumerAdvisoryServicesServicingSessionReference;
  }

  public void setConsumerAdvisoryServicesServicingSessionReference(String consumerAdvisoryServicesServicingSessionReference) {
    this.consumerAdvisoryServicesServicingSessionReference = consumerAdvisoryServicesServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Consumer Advice Fulfillment Arrangement instance 
   * @return consumerAdviceFulfillmentArrangementInstanceReference
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceReference() {
    return consumerAdviceFulfillmentArrangementInstanceReference;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceReference(String consumerAdviceFulfillmentArrangementInstanceReference) {
    this.consumerAdviceFulfillmentArrangementInstanceReference = consumerAdviceFulfillmentArrangementInstanceReference;
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
   * Get consumerAdviceFulfillmentArrangementControlActionRequest
   * @return consumerAdviceFulfillmentArrangementControlActionRequest
  **/

  public CRConsumerAdviceFulfillmentArrangementControlInputModelConsumerAdviceFulfillmentArrangementControlActionRequest getConsumerAdviceFulfillmentArrangementControlActionRequest() {
    return consumerAdviceFulfillmentArrangementControlActionRequest;
  }

  public void setConsumerAdviceFulfillmentArrangementControlActionRequest(CRConsumerAdviceFulfillmentArrangementControlInputModelConsumerAdviceFulfillmentArrangementControlActionRequest consumerAdviceFulfillmentArrangementControlActionRequest) {
    this.consumerAdviceFulfillmentArrangementControlActionRequest = consumerAdviceFulfillmentArrangementControlActionRequest;
  }


}

