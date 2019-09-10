package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceReport
 */
public class BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceReport   {
  private Object financialPlanningInstanceReportRecord = null;

  private String financialPlanningInstanceReportType = null;

  private String financialPlanningInstanceReportParameters = null;

  private Object financialPlanningInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialPlanningInstanceReportRecord
  **/

  public Object getFinancialPlanningInstanceReportRecord() {
    return financialPlanningInstanceReportRecord;
  }

  public void setFinancialPlanningInstanceReportRecord(Object financialPlanningInstanceReportRecord) {
    this.financialPlanningInstanceReportRecord = financialPlanningInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialPlanningInstanceReportType
  **/

  public String getFinancialPlanningInstanceReportType() {
    return financialPlanningInstanceReportType;
  }

  public void setFinancialPlanningInstanceReportType(String financialPlanningInstanceReportType) {
    this.financialPlanningInstanceReportType = financialPlanningInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialPlanningInstanceReportParameters
  **/

  public String getFinancialPlanningInstanceReportParameters() {
    return financialPlanningInstanceReportParameters;
  }

  public void setFinancialPlanningInstanceReportParameters(String financialPlanningInstanceReportParameters) {
    this.financialPlanningInstanceReportParameters = financialPlanningInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialPlanningInstanceReport
  **/

  public Object getFinancialPlanningInstanceReport() {
    return financialPlanningInstanceReport;
  }

  public void setFinancialPlanningInstanceReport(Object financialPlanningInstanceReport) {
    this.financialPlanningInstanceReport = financialPlanningInstanceReport;
  }


}

