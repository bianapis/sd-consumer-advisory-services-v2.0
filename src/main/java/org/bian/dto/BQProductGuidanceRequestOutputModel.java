package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductGuidanceRequestInputModelProductGuidanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceRequestOutputModel
 */
public class BQProductGuidanceRequestOutputModel   {
  private BQProductGuidanceRequestInputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord = null;

  private String productGuidanceRequestActionTaskReference = null;

  private Object productGuidanceRequestActionTaskRecord = null;

  private String productGuidanceRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get productGuidanceInstanceRecord
   * @return productGuidanceInstanceRecord
  **/

  public BQProductGuidanceRequestInputModelProductGuidanceInstanceRecord getProductGuidanceInstanceRecord() {
    return productGuidanceInstanceRecord;
  }

  public void setProductGuidanceInstanceRecord(BQProductGuidanceRequestInputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord) {
    this.productGuidanceInstanceRecord = productGuidanceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Guidance instance request service call 
   * @return productGuidanceRequestActionTaskReference
  **/

  public String getProductGuidanceRequestActionTaskReference() {
    return productGuidanceRequestActionTaskReference;
  }

  public void setProductGuidanceRequestActionTaskReference(String productGuidanceRequestActionTaskReference) {
    this.productGuidanceRequestActionTaskReference = productGuidanceRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productGuidanceRequestActionTaskRecord
  **/

  public Object getProductGuidanceRequestActionTaskRecord() {
    return productGuidanceRequestActionTaskRecord;
  }

  public void setProductGuidanceRequestActionTaskRecord(Object productGuidanceRequestActionTaskRecord) {
    this.productGuidanceRequestActionTaskRecord = productGuidanceRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Guidance service request record 
   * @return productGuidanceRequestRecordReference
  **/

  public String getProductGuidanceRequestRecordReference() {
    return productGuidanceRequestRecordReference;
  }

  public void setProductGuidanceRequestRecordReference(String productGuidanceRequestRecordReference) {
    this.productGuidanceRequestRecordReference = productGuidanceRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

