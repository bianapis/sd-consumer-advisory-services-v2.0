package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceRecordSpecialistSupportTask;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceRecord
 */
public class BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceRecord   {
  private String productServiceReference = null;

  private BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceRecordSpecialistSupportTask specialistSupportTask = null;

  private String productGuidanceAdviceResult = null;


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
   * Get specialistSupportTask
   * @return specialistSupportTask
  **/

  public BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceRecordSpecialistSupportTask getSpecialistSupportTask() {
    return specialistSupportTask;
  }

  public void setSpecialistSupportTask(BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceRecordSpecialistSupportTask specialistSupportTask) {
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

