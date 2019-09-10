package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductGuidanceUpdateInputModelProductGuidanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceUpdateOutputModel
 */
public class BQProductGuidanceUpdateOutputModel   {
  private BQProductGuidanceUpdateInputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord = null;

  private String productGuidanceUpdateActionTaskReference = null;

  private Object productGuidanceUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get productGuidanceInstanceRecord
   * @return productGuidanceInstanceRecord
  **/

  public BQProductGuidanceUpdateInputModelProductGuidanceInstanceRecord getProductGuidanceInstanceRecord() {
    return productGuidanceInstanceRecord;
  }

  public void setProductGuidanceInstanceRecord(BQProductGuidanceUpdateInputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord) {
    this.productGuidanceInstanceRecord = productGuidanceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productGuidanceUpdateActionTaskReference
  **/

  public String getProductGuidanceUpdateActionTaskReference() {
    return productGuidanceUpdateActionTaskReference;
  }

  public void setProductGuidanceUpdateActionTaskReference(String productGuidanceUpdateActionTaskReference) {
    this.productGuidanceUpdateActionTaskReference = productGuidanceUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productGuidanceUpdateActionTaskRecord
  **/

  public Object getProductGuidanceUpdateActionTaskRecord() {
    return productGuidanceUpdateActionTaskRecord;
  }

  public void setProductGuidanceUpdateActionTaskRecord(Object productGuidanceUpdateActionTaskRecord) {
    this.productGuidanceUpdateActionTaskRecord = productGuidanceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

