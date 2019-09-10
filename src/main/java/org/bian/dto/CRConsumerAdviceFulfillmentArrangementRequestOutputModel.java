package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementRequestOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementRequestOutputModel
 */
public class CRConsumerAdviceFulfillmentArrangementRequestOutputModel   {
  private CRConsumerAdviceFulfillmentArrangementRequestOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;

  private String consumerAdviceFulfillmentArrangementRequestActionTaskReference = null;

  private Object consumerAdviceFulfillmentArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceRecord
   * @return consumerAdviceFulfillmentArrangementInstanceRecord
  **/

  public CRConsumerAdviceFulfillmentArrangementRequestOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord getConsumerAdviceFulfillmentArrangementInstanceRecord() {
    return consumerAdviceFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceRecord(CRConsumerAdviceFulfillmentArrangementRequestOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord) {
    this.consumerAdviceFulfillmentArrangementInstanceRecord = consumerAdviceFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Consumer Advice Fulfillment Arrangement instance request service call 
   * @return consumerAdviceFulfillmentArrangementRequestActionTaskReference
  **/

  public String getConsumerAdviceFulfillmentArrangementRequestActionTaskReference() {
    return consumerAdviceFulfillmentArrangementRequestActionTaskReference;
  }

  public void setConsumerAdviceFulfillmentArrangementRequestActionTaskReference(String consumerAdviceFulfillmentArrangementRequestActionTaskReference) {
    this.consumerAdviceFulfillmentArrangementRequestActionTaskReference = consumerAdviceFulfillmentArrangementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return consumerAdviceFulfillmentArrangementRequestActionTaskRecord
  **/

  public Object getConsumerAdviceFulfillmentArrangementRequestActionTaskRecord() {
    return consumerAdviceFulfillmentArrangementRequestActionTaskRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementRequestActionTaskRecord(Object consumerAdviceFulfillmentArrangementRequestActionTaskRecord) {
    this.consumerAdviceFulfillmentArrangementRequestActionTaskRecord = consumerAdviceFulfillmentArrangementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

