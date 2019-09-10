package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceAnalysis
 */
public class BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceAnalysis   {
  private Object taxOptimizationInstanceAnalysisRecord = null;

  private String taxOptimizationInstanceAnalysisReportType = null;

  private String taxOptimizationInstanceAnalysisParameters = null;

  private Object taxOptimizationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return taxOptimizationInstanceAnalysisRecord
  **/

  public Object getTaxOptimizationInstanceAnalysisRecord() {
    return taxOptimizationInstanceAnalysisRecord;
  }

  public void setTaxOptimizationInstanceAnalysisRecord(Object taxOptimizationInstanceAnalysisRecord) {
    this.taxOptimizationInstanceAnalysisRecord = taxOptimizationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return taxOptimizationInstanceAnalysisReportType
  **/

  public String getTaxOptimizationInstanceAnalysisReportType() {
    return taxOptimizationInstanceAnalysisReportType;
  }

  public void setTaxOptimizationInstanceAnalysisReportType(String taxOptimizationInstanceAnalysisReportType) {
    this.taxOptimizationInstanceAnalysisReportType = taxOptimizationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return taxOptimizationInstanceAnalysisParameters
  **/

  public String getTaxOptimizationInstanceAnalysisParameters() {
    return taxOptimizationInstanceAnalysisParameters;
  }

  public void setTaxOptimizationInstanceAnalysisParameters(String taxOptimizationInstanceAnalysisParameters) {
    this.taxOptimizationInstanceAnalysisParameters = taxOptimizationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return taxOptimizationInstanceAnalysisReport
  **/

  public Object getTaxOptimizationInstanceAnalysisReport() {
    return taxOptimizationInstanceAnalysisReport;
  }

  public void setTaxOptimizationInstanceAnalysisReport(Object taxOptimizationInstanceAnalysisReport) {
    this.taxOptimizationInstanceAnalysisReport = taxOptimizationInstanceAnalysisReport;
  }


}

