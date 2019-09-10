package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceReport
 */
public class BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceReport   {
  private Object taxOptimizationInstanceReportRecord = null;

  private String taxOptimizationInstanceReportType = null;

  private String taxOptimizationInstanceReportParameters = null;

  private Object taxOptimizationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return taxOptimizationInstanceReportRecord
  **/

  public Object getTaxOptimizationInstanceReportRecord() {
    return taxOptimizationInstanceReportRecord;
  }

  public void setTaxOptimizationInstanceReportRecord(Object taxOptimizationInstanceReportRecord) {
    this.taxOptimizationInstanceReportRecord = taxOptimizationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return taxOptimizationInstanceReportType
  **/

  public String getTaxOptimizationInstanceReportType() {
    return taxOptimizationInstanceReportType;
  }

  public void setTaxOptimizationInstanceReportType(String taxOptimizationInstanceReportType) {
    this.taxOptimizationInstanceReportType = taxOptimizationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return taxOptimizationInstanceReportParameters
  **/

  public String getTaxOptimizationInstanceReportParameters() {
    return taxOptimizationInstanceReportParameters;
  }

  public void setTaxOptimizationInstanceReportParameters(String taxOptimizationInstanceReportParameters) {
    this.taxOptimizationInstanceReportParameters = taxOptimizationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return taxOptimizationInstanceReport
  **/

  public Object getTaxOptimizationInstanceReport() {
    return taxOptimizationInstanceReport;
  }

  public void setTaxOptimizationInstanceReport(Object taxOptimizationInstanceReport) {
    this.taxOptimizationInstanceReport = taxOptimizationInstanceReport;
  }


}

