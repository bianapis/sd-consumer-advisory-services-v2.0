package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductGuidanceInitiateOutputModelProductGuidanceInstanceRecordSpecialistSupportTask;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceInitiateOutputModelProductGuidanceInstanceRecord
 */
public class BQProductGuidanceInitiateOutputModelProductGuidanceInstanceRecord   {
  private BQProductGuidanceInitiateOutputModelProductGuidanceInstanceRecordSpecialistSupportTask specialistSupportTask = null;

  private String productGuidanceAdviceResult = null;


  /**
   * Get specialistSupportTask
   * @return specialistSupportTask
  **/

  public BQProductGuidanceInitiateOutputModelProductGuidanceInstanceRecordSpecialistSupportTask getSpecialistSupportTask() {
    return specialistSupportTask;
  }

  public void setSpecialistSupportTask(BQProductGuidanceInitiateOutputModelProductGuidanceInstanceRecordSpecialistSupportTask specialistSupportTask) {
    this.specialistSupportTask = specialistSupportTask;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Summary recommendations arising from the advice that is added to the consolidated record 
   * @return productGuidanceAdviceResult
  **/

  public String getProductGuidanceAdviceResult() {
    return productGuidanceAdviceResult;
  }

  public void setProductGuidanceAdviceResult(String productGuidanceAdviceResult) {
    this.productGuidanceAdviceResult = productGuidanceAdviceResult;
  }


}

