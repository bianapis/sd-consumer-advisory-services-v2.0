package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceAnalysis
 */
public class BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceAnalysis   {
  private Object productGuidanceInstanceAnalysisRecord = null;

  private String productGuidanceInstanceAnalysisReportType = null;

  private String productGuidanceInstanceAnalysisParameters = null;

  private Object productGuidanceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productGuidanceInstanceAnalysisRecord
  **/

  public Object getProductGuidanceInstanceAnalysisRecord() {
    return productGuidanceInstanceAnalysisRecord;
  }

  public void setProductGuidanceInstanceAnalysisRecord(Object productGuidanceInstanceAnalysisRecord) {
    this.productGuidanceInstanceAnalysisRecord = productGuidanceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productGuidanceInstanceAnalysisReportType
  **/

  public String getProductGuidanceInstanceAnalysisReportType() {
    return productGuidanceInstanceAnalysisReportType;
  }

  public void setProductGuidanceInstanceAnalysisReportType(String productGuidanceInstanceAnalysisReportType) {
    this.productGuidanceInstanceAnalysisReportType = productGuidanceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productGuidanceInstanceAnalysisParameters
  **/

  public String getProductGuidanceInstanceAnalysisParameters() {
    return productGuidanceInstanceAnalysisParameters;
  }

  public void setProductGuidanceInstanceAnalysisParameters(String productGuidanceInstanceAnalysisParameters) {
    this.productGuidanceInstanceAnalysisParameters = productGuidanceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productGuidanceInstanceAnalysisReport
  **/

  public Object getProductGuidanceInstanceAnalysisReport() {
    return productGuidanceInstanceAnalysisReport;
  }

  public void setProductGuidanceInstanceAnalysisReport(Object productGuidanceInstanceAnalysisReport) {
    this.productGuidanceInstanceAnalysisReport = productGuidanceInstanceAnalysisReport;
  }


}

