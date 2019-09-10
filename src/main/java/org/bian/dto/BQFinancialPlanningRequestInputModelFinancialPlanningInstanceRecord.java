package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialPlanningRequestInputModelFinancialPlanningInstanceRecord
 */
public class BQFinancialPlanningRequestInputModelFinancialPlanningInstanceRecord   {
  private String productServiceReference = null;

  private String financialPlanningAdviceResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the financial planning advisory service (used to access guidance materials) 
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
   * @return financialPlanningAdviceResult
  **/

  public String getFinancialPlanningAdviceResult() {
    return financialPlanningAdviceResult;
  }

  public void setFinancialPlanningAdviceResult(String financialPlanningAdviceResult) {
    this.financialPlanningAdviceResult = financialPlanningAdviceResult;
  }


}

