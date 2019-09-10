package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTaxOptimizationRetrieveInputModelTaxOptimizationInstanceAnalysis;
import org.bian.dto.BQTaxOptimizationRetrieveInputModelTaxOptimizationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationRetrieveInputModel
 */
public class BQTaxOptimizationRetrieveInputModel   {
  private Object taxOptimizationRetrieveActionTaskRecord = null;

  private String taxOptimizationRetrieveActionRequest = null;

  private BQTaxOptimizationRetrieveInputModelTaxOptimizationInstanceReport taxOptimizationInstanceReport = null;

  private BQTaxOptimizationRetrieveInputModelTaxOptimizationInstanceAnalysis taxOptimizationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return taxOptimizationRetrieveActionTaskRecord
  **/

  public Object getTaxOptimizationRetrieveActionTaskRecord() {
    return taxOptimizationRetrieveActionTaskRecord;
  }

  public void setTaxOptimizationRetrieveActionTaskRecord(Object taxOptimizationRetrieveActionTaskRecord) {
    this.taxOptimizationRetrieveActionTaskRecord = taxOptimizationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return taxOptimizationRetrieveActionRequest
  **/

  public String getTaxOptimizationRetrieveActionRequest() {
    return taxOptimizationRetrieveActionRequest;
  }

  public void setTaxOptimizationRetrieveActionRequest(String taxOptimizationRetrieveActionRequest) {
    this.taxOptimizationRetrieveActionRequest = taxOptimizationRetrieveActionRequest;
  }


  /**
   * Get taxOptimizationInstanceReport
   * @return taxOptimizationInstanceReport
  **/

  public BQTaxOptimizationRetrieveInputModelTaxOptimizationInstanceReport getTaxOptimizationInstanceReport() {
    return taxOptimizationInstanceReport;
  }

  public void setTaxOptimizationInstanceReport(BQTaxOptimizationRetrieveInputModelTaxOptimizationInstanceReport taxOptimizationInstanceReport) {
    this.taxOptimizationInstanceReport = taxOptimizationInstanceReport;
  }


  /**
   * Get taxOptimizationInstanceAnalysis
   * @return taxOptimizationInstanceAnalysis
  **/

  public BQTaxOptimizationRetrieveInputModelTaxOptimizationInstanceAnalysis getTaxOptimizationInstanceAnalysis() {
    return taxOptimizationInstanceAnalysis;
  }

  public void setTaxOptimizationInstanceAnalysis(BQTaxOptimizationRetrieveInputModelTaxOptimizationInstanceAnalysis taxOptimizationInstanceAnalysis) {
    this.taxOptimizationInstanceAnalysis = taxOptimizationInstanceAnalysis;
  }


}

