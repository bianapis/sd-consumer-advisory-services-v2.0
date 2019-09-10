package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecordConsumerAdviceProfile
 */
public class CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecordConsumerAdviceProfile   {
  private String adviceType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the different types of advice 
   * @return adviceType
  **/

  public String getAdviceType() {
    return adviceType;
  }

  public void setAdviceType(String adviceType) {
    this.adviceType = adviceType;
  }


}

