package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementUpdateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementUpdateInputModel
 */
public class CRConsumerAdviceFulfillmentArrangementUpdateInputModel   {
  private String consumerAdvisoryServicesServicingSessionReference = null;

  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private CRConsumerAdviceFulfillmentArrangementUpdateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;

  private Object consumerAdviceFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get consumerAdviceFulfillmentArrangementInstanceRecord
   * @return consumerAdviceFulfillmentArrangementInstanceRecord
  **/

  public CRConsumerAdviceFulfillmentArrangementUpdateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord getConsumerAdviceFulfillmentArrangementInstanceRecord() {
    return consumerAdviceFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceRecord(CRConsumerAdviceFulfillmentArrangementUpdateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord) {
    this.consumerAdviceFulfillmentArrangementInstanceRecord = consumerAdviceFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return consumerAdviceFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getConsumerAdviceFulfillmentArrangementUpdateActionTaskRecord() {
    return consumerAdviceFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementUpdateActionTaskRecord(Object consumerAdviceFulfillmentArrangementUpdateActionTaskRecord) {
    this.consumerAdviceFulfillmentArrangementUpdateActionTaskRecord = consumerAdviceFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

