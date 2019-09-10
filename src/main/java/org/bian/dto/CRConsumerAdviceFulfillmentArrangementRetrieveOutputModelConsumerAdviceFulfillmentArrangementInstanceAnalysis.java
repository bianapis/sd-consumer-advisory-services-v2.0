package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceAnalysis
 */
public class CRConsumerAdviceFulfillmentArrangementRetrieveOutputModelConsumerAdviceFulfillmentArrangementInstanceAnalysis   {
  private String consumerAdviceFulfillmentArrangementInstanceAnalysisData = null;

  private String consumerAdviceFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object consumerAdviceFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return consumerAdviceFulfillmentArrangementInstanceAnalysisData
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceAnalysisData() {
    return consumerAdviceFulfillmentArrangementInstanceAnalysisData;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceAnalysisData(String consumerAdviceFulfillmentArrangementInstanceAnalysisData) {
    this.consumerAdviceFulfillmentArrangementInstanceAnalysisData = consumerAdviceFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return consumerAdviceFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceAnalysisReportType() {
    return consumerAdviceFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceAnalysisReportType(String consumerAdviceFulfillmentArrangementInstanceAnalysisReportType) {
    this.consumerAdviceFulfillmentArrangementInstanceAnalysisReportType = consumerAdviceFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return consumerAdviceFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getConsumerAdviceFulfillmentArrangementInstanceAnalysisReport() {
    return consumerAdviceFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceAnalysisReport(Object consumerAdviceFulfillmentArrangementInstanceAnalysisReport) {
    this.consumerAdviceFulfillmentArrangementInstanceAnalysisReport = consumerAdviceFulfillmentArrangementInstanceAnalysisReport;
  }


}

