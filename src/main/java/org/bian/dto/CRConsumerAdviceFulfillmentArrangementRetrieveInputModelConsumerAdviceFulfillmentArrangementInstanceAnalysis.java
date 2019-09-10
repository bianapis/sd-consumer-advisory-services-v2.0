package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementRetrieveInputModelConsumerAdviceFulfillmentArrangementInstanceAnalysis
 */
public class CRConsumerAdviceFulfillmentArrangementRetrieveInputModelConsumerAdviceFulfillmentArrangementInstanceAnalysis   {
  private String consumerAdviceFulfillmentArrangementInstanceAnalysisReference = null;

  private String consumerAdviceFulfillmentArrangementInstanceAnalysisReportType = null;

  private String consumerAdviceFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return consumerAdviceFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceAnalysisReference() {
    return consumerAdviceFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceAnalysisReference(String consumerAdviceFulfillmentArrangementInstanceAnalysisReference) {
    this.consumerAdviceFulfillmentArrangementInstanceAnalysisReference = consumerAdviceFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return consumerAdviceFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceAnalysisParameters() {
    return consumerAdviceFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceAnalysisParameters(String consumerAdviceFulfillmentArrangementInstanceAnalysisParameters) {
    this.consumerAdviceFulfillmentArrangementInstanceAnalysisParameters = consumerAdviceFulfillmentArrangementInstanceAnalysisParameters;
  }


}

