package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationRetrieveInputModelTaxOptimizationInstanceReport
 */
public class BQTaxOptimizationRetrieveInputModelTaxOptimizationInstanceReport   {
  private String taxOptimizationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return taxOptimizationInstanceReportReference
  **/

  public String getTaxOptimizationInstanceReportReference() {
    return taxOptimizationInstanceReportReference;
  }

  public void setTaxOptimizationInstanceReportReference(String taxOptimizationInstanceReportReference) {
    this.taxOptimizationInstanceReportReference = taxOptimizationInstanceReportReference;
  }


}

