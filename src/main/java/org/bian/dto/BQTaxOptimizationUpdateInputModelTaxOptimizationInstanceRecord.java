package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecord
 */
public class BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecord   {
  private String productServiceReference = null;

  private String taxOptimizationAdviceResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the consumer tax advisory service (used to access guidance materials) 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


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

