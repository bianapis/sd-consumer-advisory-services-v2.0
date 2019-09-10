package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceAnalysis
 */
public class BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceAnalysis   {
  private Object financialPlanningInstanceAnalysisRecord = null;

  private String financialPlanningInstanceAnalysisReportType = null;

  private String financialPlanningInstanceAnalysisParameters = null;

  private Object financialPlanningInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialPlanningInstanceAnalysisRecord
  **/

  public Object getFinancialPlanningInstanceAnalysisRecord() {
    return financialPlanningInstanceAnalysisRecord;
  }

  public void setFinancialPlanningInstanceAnalysisRecord(Object financialPlanningInstanceAnalysisRecord) {
    this.financialPlanningInstanceAnalysisRecord = financialPlanningInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialPlanningInstanceAnalysisReportType
  **/

  public String getFinancialPlanningInstanceAnalysisReportType() {
    return financialPlanningInstanceAnalysisReportType;
  }

  public void setFinancialPlanningInstanceAnalysisReportType(String financialPlanningInstanceAnalysisReportType) {
    this.financialPlanningInstanceAnalysisReportType = financialPlanningInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialPlanningInstanceAnalysisParameters
  **/

  public String getFinancialPlanningInstanceAnalysisParameters() {
    return financialPlanningInstanceAnalysisParameters;
  }

  public void setFinancialPlanningInstanceAnalysisParameters(String financialPlanningInstanceAnalysisParameters) {
    this.financialPlanningInstanceAnalysisParameters = financialPlanningInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialPlanningInstanceAnalysisReport
  **/

  public Object getFinancialPlanningInstanceAnalysisReport() {
    return financialPlanningInstanceAnalysisReport;
  }

  public void setFinancialPlanningInstanceAnalysisReport(Object financialPlanningInstanceAnalysisReport) {
    this.financialPlanningInstanceAnalysisReport = financialPlanningInstanceAnalysisReport;
  }


}

