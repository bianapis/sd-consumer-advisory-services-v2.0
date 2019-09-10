package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceInitiateInputModelProductGuidanceInstanceRecordSpecialistSupportTask
 */
public class BQProductGuidanceInitiateInputModelProductGuidanceInstanceRecordSpecialistSupportTask   {
  private String specialistEmployeeBusinessUnitReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit and or employee reference for the product specialist engaged 
   * @return specialistEmployeeBusinessUnitReference
  **/

  public String getSpecialistEmployeeBusinessUnitReference() {
    return specialistEmployeeBusinessUnitReference;
  }

  public void setSpecialistEmployeeBusinessUnitReference(String specialistEmployeeBusinessUnitReference) {
    this.specialistEmployeeBusinessUnitReference = specialistEmployeeBusinessUnitReference;
  }


}

