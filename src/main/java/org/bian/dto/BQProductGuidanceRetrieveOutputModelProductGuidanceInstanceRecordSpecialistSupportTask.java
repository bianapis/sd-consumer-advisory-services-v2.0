package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceRecordSpecialistSupportTask
 */
public class BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceRecordSpecialistSupportTask   {
  private String specialistEmployeeBusinessUnitReference = null;

  private String specialistAdviceDescription = null;

  private String specialistAdviceCharge = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: General description of the product specialist advice provided 
   * @return specialistAdviceDescription
  **/

  public String getSpecialistAdviceDescription() {
    return specialistAdviceDescription;
  }

  public void setSpecialistAdviceDescription(String specialistAdviceDescription) {
    this.specialistAdviceDescription = specialistAdviceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The service charge to be made to the customer for the specialist support 
   * @return specialistAdviceCharge
  **/

  public String getSpecialistAdviceCharge() {
    return specialistAdviceCharge;
  }

  public void setSpecialistAdviceCharge(String specialistAdviceCharge) {
    this.specialistAdviceCharge = specialistAdviceCharge;
  }


}

