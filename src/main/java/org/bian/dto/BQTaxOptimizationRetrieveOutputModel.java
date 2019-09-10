package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceAnalysis;
import org.bian.dto.BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceRecord;
import org.bian.dto.BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationRetrieveOutputModel
 */
public class BQTaxOptimizationRetrieveOutputModel   {
  private BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord = null;

  private String taxOptimizationRetrieveActionTaskReference = null;

  private Object taxOptimizationRetrieveActionTaskRecord = null;

  private String taxOptimizationRetrieveActionResponse = null;

  private BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceReport taxOptimizationInstanceReport = null;

  private BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceAnalysis taxOptimizationInstanceAnalysis = null;


  /**
   * Get taxOptimizationInstanceRecord
   * @return taxOptimizationInstanceRecord
  **/

  public BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceRecord getTaxOptimizationInstanceRecord() {
    return taxOptimizationInstanceRecord;
  }

  public void setTaxOptimizationInstanceRecord(BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord) {
    this.taxOptimizationInstanceRecord = taxOptimizationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Tax Optimization instance retrieve service call 
   * @return taxOptimizationRetrieveActionTaskReference
  **/

  public String getTaxOptimizationRetrieveActionTaskReference() {
    return taxOptimizationRetrieveActionTaskReference;
  }

  public void setTaxOptimizationRetrieveActionTaskReference(String taxOptimizationRetrieveActionTaskReference) {
    this.taxOptimizationRetrieveActionTaskReference = taxOptimizationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return taxOptimizationRetrieveActionResponse
  **/

  public String getTaxOptimizationRetrieveActionResponse() {
    return taxOptimizationRetrieveActionResponse;
  }

  public void setTaxOptimizationRetrieveActionResponse(String taxOptimizationRetrieveActionResponse) {
    this.taxOptimizationRetrieveActionResponse = taxOptimizationRetrieveActionResponse;
  }


  /**
   * Get taxOptimizationInstanceReport
   * @return taxOptimizationInstanceReport
  **/

  public BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceReport getTaxOptimizationInstanceReport() {
    return taxOptimizationInstanceReport;
  }

  public void setTaxOptimizationInstanceReport(BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceReport taxOptimizationInstanceReport) {
    this.taxOptimizationInstanceReport = taxOptimizationInstanceReport;
  }


  /**
   * Get taxOptimizationInstanceAnalysis
   * @return taxOptimizationInstanceAnalysis
  **/

  public BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceAnalysis getTaxOptimizationInstanceAnalysis() {
    return taxOptimizationInstanceAnalysis;
  }

  public void setTaxOptimizationInstanceAnalysis(BQTaxOptimizationRetrieveOutputModelTaxOptimizationInstanceAnalysis taxOptimizationInstanceAnalysis) {
    this.taxOptimizationInstanceAnalysis = taxOptimizationInstanceAnalysis;
  }


}

