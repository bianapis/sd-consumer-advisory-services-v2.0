package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceReport
 */
public class BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceReport   {
  private Object productGuidanceInstanceReportRecord = null;

  private String productGuidanceInstanceReportType = null;

  private String productGuidanceInstanceReportParameters = null;

  private Object productGuidanceInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productGuidanceInstanceReportRecord
  **/

  public Object getProductGuidanceInstanceReportRecord() {
    return productGuidanceInstanceReportRecord;
  }

  public void setProductGuidanceInstanceReportRecord(Object productGuidanceInstanceReportRecord) {
    this.productGuidanceInstanceReportRecord = productGuidanceInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productGuidanceInstanceReportType
  **/

  public String getProductGuidanceInstanceReportType() {
    return productGuidanceInstanceReportType;
  }

  public void setProductGuidanceInstanceReportType(String productGuidanceInstanceReportType) {
    this.productGuidanceInstanceReportType = productGuidanceInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productGuidanceInstanceReportParameters
  **/

  public String getProductGuidanceInstanceReportParameters() {
    return productGuidanceInstanceReportParameters;
  }

  public void setProductGuidanceInstanceReportParameters(String productGuidanceInstanceReportParameters) {
    this.productGuidanceInstanceReportParameters = productGuidanceInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productGuidanceInstanceReport
  **/

  public Object getProductGuidanceInstanceReport() {
    return productGuidanceInstanceReport;
  }

  public void setProductGuidanceInstanceReport(Object productGuidanceInstanceReport) {
    this.productGuidanceInstanceReport = productGuidanceInstanceReport;
  }


}

