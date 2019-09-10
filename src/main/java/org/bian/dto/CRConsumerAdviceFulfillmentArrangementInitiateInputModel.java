package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementInitiateInputModel
 */
public class CRConsumerAdviceFulfillmentArrangementInitiateInputModel   {
  private String consumerAdvisoryServicesServicingSessionReference = null;

  private Object consumerAdviceFulfillmentArrangementInitiateActionRecord = null;

  private String consumerAdviceFulfillmentArrangementInstanceStatus = null;

  private CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return consumerAdviceFulfillmentArrangementInitiateActionRecord
  **/

  public Object getConsumerAdviceFulfillmentArrangementInitiateActionRecord() {
    return consumerAdviceFulfillmentArrangementInitiateActionRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInitiateActionRecord(Object consumerAdviceFulfillmentArrangementInitiateActionRecord) {
    this.consumerAdviceFulfillmentArrangementInitiateActionRecord = consumerAdviceFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Consumer Advice Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return consumerAdviceFulfillmentArrangementInstanceStatus
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceStatus() {
    return consumerAdviceFulfillmentArrangementInstanceStatus;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceStatus(String consumerAdviceFulfillmentArrangementInstanceStatus) {
    this.consumerAdviceFulfillmentArrangementInstanceStatus = consumerAdviceFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceRecord
   * @return consumerAdviceFulfillmentArrangementInstanceRecord
  **/

  public CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord getConsumerAdviceFulfillmentArrangementInstanceRecord() {
    return consumerAdviceFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceRecord(CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord) {
    this.consumerAdviceFulfillmentArrangementInstanceRecord = consumerAdviceFulfillmentArrangementInstanceRecord;
  }


}

