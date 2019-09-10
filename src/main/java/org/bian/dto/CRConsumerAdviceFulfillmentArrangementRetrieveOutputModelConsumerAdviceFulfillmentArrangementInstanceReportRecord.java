package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceReportRecord
 */
public class CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceReportRecord   {
  private String consumerAdviceFulfillmentArrangementInstanceReportData = null;

  private String consumerAdviceFulfillmentArrangementInstanceReportType = null;

  private Object consumerAdviceFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return consumerAdviceFulfillmentArrangementInstanceReportData
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceReportData() {
    return consumerAdviceFulfillmentArrangementInstanceReportData;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceReportData(String consumerAdviceFulfillmentArrangementInstanceReportData) {
    this.consumerAdviceFulfillmentArrangementInstanceReportData = consumerAdviceFulfillmentArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return consumerAdviceFulfillmentArrangementInstanceReportType
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceReportType() {
    return consumerAdviceFulfillmentArrangementInstanceReportType;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceReportType(String consumerAdviceFulfillmentArrangementInstanceReportType) {
    this.consumerAdviceFulfillmentArrangementInstanceReportType = consumerAdviceFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return consumerAdviceFulfillmentArrangementInstanceReport
  **/

  public Object getConsumerAdviceFulfillmentArrangementInstanceReport() {
    return consumerAdviceFulfillmentArrangementInstanceReport;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceReport(Object consumerAdviceFulfillmentArrangementInstanceReport) {
    this.consumerAdviceFulfillmentArrangementInstanceReport = consumerAdviceFulfillmentArrangementInstanceReport;
  }


}

