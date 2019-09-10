package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementRetrieveInputModelConsumerAdviceFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementRetrieveInputModelConsumerAdviceFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementRetrieveInputModel
 */
public class CRConsumerAdviceFulfillmentArrangementRetrieveInputModel   {
  private Object consumerAdviceFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String consumerAdviceFulfillmentArrangementRetrieveActionRequest = null;

  private CRConsumerAdviceFulfillmentArrangementRetrieveInputModelConsumerAdviceFulfillmentArrangementInstanceReportRecord consumerAdviceFulfillmentArrangementInstanceReportRecord = null;

  private CRConsumerAdviceFulfillmentArrangementRetrieveInputModelConsumerAdviceFulfillmentArrangementInstanceAnalysis consumerAdviceFulfillmentArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return consumerAdviceFulfillmentArrangementRetrieveActionRequest
  **/

  public String getConsumerAdviceFulfillmentArrangementRetrieveActionRequest() {
    return consumerAdviceFulfillmentArrangementRetrieveActionRequest;
  }

  public void setConsumerAdviceFulfillmentArrangementRetrieveActionRequest(String consumerAdviceFulfillmentArrangementRetrieveActionRequest) {
    this.consumerAdviceFulfillmentArrangementRetrieveActionRequest = consumerAdviceFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceReportRecord
   * @return consumerAdviceFulfillmentArrangementInstanceReportRecord
  **/

  public CRConsumerAdviceFulfillmentArrangementRetrieveInputModelConsumerAdviceFulfillmentArrangementInstanceReportRecord getConsumerAdviceFulfillmentArrangementInstanceReportRecord() {
    return consumerAdviceFulfillmentArrangementInstanceReportRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceReportRecord(CRConsumerAdviceFulfillmentArrangementRetrieveInputModelConsumerAdviceFulfillmentArrangementInstanceReportRecord consumerAdviceFulfillmentArrangementInstanceReportRecord) {
    this.consumerAdviceFulfillmentArrangementInstanceReportRecord = consumerAdviceFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceAnalysis
   * @return consumerAdviceFulfillmentArrangementInstanceAnalysis
  **/

  public CRConsumerAdviceFulfillmentArrangementRetrieveInputModelConsumerAdviceFulfillmentArrangementInstanceAnalysis getConsumerAdviceFulfillmentArrangementInstanceAnalysis() {
    return consumerAdviceFulfillmentArrangementInstanceAnalysis;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceAnalysis(CRConsumerAdviceFulfillmentArrangementRetrieveInputModelConsumerAdviceFulfillmentArrangementInstanceAnalysis consumerAdviceFulfillmentArrangementInstanceAnalysis) {
    this.consumerAdviceFulfillmentArrangementInstanceAnalysis = consumerAdviceFulfillmentArrangementInstanceAnalysis;
  }


}

