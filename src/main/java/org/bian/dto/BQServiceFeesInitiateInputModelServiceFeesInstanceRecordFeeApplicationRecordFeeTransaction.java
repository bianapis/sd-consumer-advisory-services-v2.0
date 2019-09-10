package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction
 */
public class BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction   {
  private String feeTransactionDescription = null;

  private String feeTransactionType = null;

  private String feeTransactionCharge = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: General description of the fee 
   * @return feeTransactionDescription
  **/

  public String getFeeTransactionDescription() {
    return feeTransactionDescription;
  }

  public void setFeeTransactionDescription(String feeTransactionDescription) {
    this.feeTransactionDescription = feeTransactionDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The fee type applied 
   * @return feeTransactionType
  **/

  public String getFeeTransactionType() {
    return feeTransactionType;
  }

  public void setFeeTransactionType(String feeTransactionType) {
    this.feeTransactionType = feeTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The derived fee amount to be charged 
   * @return feeTransactionCharge
  **/

  public String getFeeTransactionCharge() {
    return feeTransactionCharge;
  }

  public void setFeeTransactionCharge(String feeTransactionCharge) {
    this.feeTransactionCharge = feeTransactionCharge;
  }


}

