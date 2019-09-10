package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementRetrieveOutputModel
 */
public class CRConsumerAdviceFulfillmentArrangementRetrieveOutputModel   {
  private CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;

  private String consumerAdviceFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object consumerAdviceFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String consumerAdviceFulfillmentArrangementRetrieveActionResponse = null;

  private CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceReportRecord consumerAdviceFulfillmentArrangementInstanceReportRecord = null;

  private CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceAnalysis consumerAdviceFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceRecord
   * @return consumerAdviceFulfillmentArrangementInstanceRecord
  **/

  public CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord getConsumerAdviceFulfillmentArrangementInstanceRecord() {
    return consumerAdviceFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceRecord(CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord) {
    this.consumerAdviceFulfillmentArrangementInstanceRecord = consumerAdviceFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Consumer Advice Fulfillment Arrangement instance retrieve service call 
   * @return consumerAdviceFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getConsumerAdviceFulfillmentArrangementRetrieveActionTaskReference() {
    return consumerAdviceFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setConsumerAdviceFulfillmentArrangementRetrieveActionTaskReference(String consumerAdviceFulfillmentArrangementRetrieveActionTaskReference) {
    this.consumerAdviceFulfillmentArrangementRetrieveActionTaskReference = consumerAdviceFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return consumerAdviceFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getConsumerAdviceFulfillmentArrangementRetrieveActionTaskRecord() {
    return consumerAdviceFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementRetrieveActionTaskRecord(Object consumerAdviceFulfillmentArrangementRetrieveActionTaskRecord) {
    this.consumerAdviceFulfillmentArrangementRetrieveActionTaskRecord = consumerAdviceFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return consumerAdviceFulfillmentArrangementRetrieveActionResponse
  **/

  public String getConsumerAdviceFulfillmentArrangementRetrieveActionResponse() {
    return consumerAdviceFulfillmentArrangementRetrieveActionResponse;
  }

  public void setConsumerAdviceFulfillmentArrangementRetrieveActionResponse(String consumerAdviceFulfillmentArrangementRetrieveActionResponse) {
    this.consumerAdviceFulfillmentArrangementRetrieveActionResponse = consumerAdviceFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceReportRecord
   * @return consumerAdviceFulfillmentArrangementInstanceReportRecord
  **/

  public CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceReportRecord getConsumerAdviceFulfillmentArrangementInstanceReportRecord() {
    return consumerAdviceFulfillmentArrangementInstanceReportRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceReportRecord(CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceReportRecord consumerAdviceFulfillmentArrangementInstanceReportRecord) {
    this.consumerAdviceFulfillmentArrangementInstanceReportRecord = consumerAdviceFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceAnalysis
   * @return consumerAdviceFulfillmentArrangementInstanceAnalysis
  **/

  public CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceAnalysis getConsumerAdviceFulfillmentArrangementInstanceAnalysis() {
    return consumerAdviceFulfillmentArrangementInstanceAnalysis;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceAnalysis(CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceAnalysis consumerAdviceFulfillmentArrangementInstanceAnalysis) {
    this.consumerAdviceFulfillmentArrangementInstanceAnalysis = consumerAdviceFulfillmentArrangementInstanceAnalysis;
  }


}

