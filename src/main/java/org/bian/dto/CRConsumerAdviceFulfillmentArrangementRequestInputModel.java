package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementRequestInputModelConsumerAdviceFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementRequestInputModel
 */
public class CRConsumerAdviceFulfillmentArrangementRequestInputModel   {
  private String consumerAdvisoryServicesServicingSessionReference = null;

  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private CRConsumerAdviceFulfillmentArrangementRequestInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;

  private Object consumerAdviceFulfillmentArrangementRequestActionTaskRecord = null;

  private CRConsumerAdviceFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRConsumerAdviceFulfillmentArrangementRequestInputModelConsumerAdviceFulfillmentArrangementInstanceRecord getConsumerAdviceFulfillmentArrangementInstanceRecord() {
    return consumerAdviceFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceRecord(CRConsumerAdviceFulfillmentArrangementRequestInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord) {
    this.consumerAdviceFulfillmentArrangementInstanceRecord = consumerAdviceFulfillmentArrangementInstanceRecord;
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

