package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementInitiateOutputModel
 */
public class CRConsumerAdviceFulfillmentArrangementInitiateOutputModel   {
  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private String consumerAdviceFulfillmentArrangementInitiateActionReference = null;

  private Object consumerAdviceFulfillmentArrangementInitiateActionRecord = null;

  private String consumerAdviceFulfillmentArrangementInstanceStatus = null;

  private CRConsumerAdviceFulfillmentArrangementInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return consumerAdviceFulfillmentArrangementInitiateActionReference
  **/

  public String getConsumerAdviceFulfillmentArrangementInitiateActionReference() {
    return consumerAdviceFulfillmentArrangementInitiateActionReference;
  }

  public void setConsumerAdviceFulfillmentArrangementInitiateActionReference(String consumerAdviceFulfillmentArrangementInitiateActionReference) {
    this.consumerAdviceFulfillmentArrangementInitiateActionReference = consumerAdviceFulfillmentArrangementInitiateActionReference;
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

  public CRConsumerAdviceFulfillmentArrangementInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord getConsumerAdviceFulfillmentArrangementInstanceRecord() {
    return consumerAdviceFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceRecord(CRConsumerAdviceFulfillmentArrangementInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord) {
    this.consumerAdviceFulfillmentArrangementInstanceRecord = consumerAdviceFulfillmentArrangementInstanceRecord;
  }


}

