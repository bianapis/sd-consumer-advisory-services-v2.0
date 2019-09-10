package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductGuidanceInitiateInputModelProductGuidanceInstanceRecordSpecialistSupportTask;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceInitiateInputModelProductGuidanceInstanceRecord
 */
public class BQProductGuidanceInitiateInputModelProductGuidanceInstanceRecord   {
  private String productServiceReference = null;

  private BQProductGuidanceInitiateInputModelProductGuidanceInstanceRecordSpecialistSupportTask specialistSupportTask = null;


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

  public BQProductGuidanceInitiateInputModelProductGuidanceInstanceRecordSpecialistSupportTask getSpecialistSupportTask() {
    return specialistSupportTask;
  }

  public void setSpecialistSupportTask(BQProductGuidanceInitiateInputModelProductGuidanceInstanceRecordSpecialistSupportTask specialistSupportTask) {
    this.specialistSupportTask = specialistSupportTask;
  }


}

