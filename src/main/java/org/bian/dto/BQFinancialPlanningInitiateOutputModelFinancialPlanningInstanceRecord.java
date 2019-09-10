package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialPlanningInitiateOutputModelFinancialPlanningInstanceRecord
 */
public class BQFinancialPlanningInitiateOutputModelFinancialPlanningInstanceRecord   {
  private String financialPlanningAdviceResult = null;


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

