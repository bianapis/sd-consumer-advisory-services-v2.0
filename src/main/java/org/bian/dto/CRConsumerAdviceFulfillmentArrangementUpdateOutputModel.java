package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementUpdateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementUpdateOutputModel
 */
public class CRConsumerAdviceFulfillmentArrangementUpdateOutputModel   {
  private CRConsumerAdviceFulfillmentArrangementUpdateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;

  private String consumerAdviceFulfillmentArrangementUpdateActionTaskReference = null;

  private Object consumerAdviceFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return consumerAdviceFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getConsumerAdviceFulfillmentArrangementUpdateActionTaskReference() {
    return consumerAdviceFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setConsumerAdviceFulfillmentArrangementUpdateActionTaskReference(String consumerAdviceFulfillmentArrangementUpdateActionTaskReference) {
    this.consumerAdviceFulfillmentArrangementUpdateActionTaskReference = consumerAdviceFulfillmentArrangementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

