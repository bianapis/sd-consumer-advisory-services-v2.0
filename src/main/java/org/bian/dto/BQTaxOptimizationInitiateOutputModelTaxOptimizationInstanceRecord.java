package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationInitiateOutputModelTaxOptimizationInstanceRecord
 */
public class BQTaxOptimizationInitiateOutputModelTaxOptimizationInstanceRecord   {
  private String taxOptimizationAdviceResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Summary recommendations arising from the advice that is added to the consolidated record 
   * @return taxOptimizationAdviceResult
  **/

  public String getTaxOptimizationAdviceResult() {
    return taxOptimizationAdviceResult;
  }

  public void setTaxOptimizationAdviceResult(String taxOptimizationAdviceResult) {
    this.taxOptimizationAdviceResult = taxOptimizationAdviceResult;
  }


}

