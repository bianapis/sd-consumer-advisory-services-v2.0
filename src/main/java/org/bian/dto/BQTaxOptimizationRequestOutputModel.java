package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTaxOptimizationRequestInputModelTaxOptimizationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationRequestOutputModel
 */
public class BQTaxOptimizationRequestOutputModel   {
  private BQTaxOptimizationRequestInputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord = null;

  private String taxOptimizationRequestActionTaskReference = null;

  private Object taxOptimizationRequestActionTaskRecord = null;

  private String taxOptimizationRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get taxOptimizationInstanceRecord
   * @return taxOptimizationInstanceRecord
  **/

  public BQTaxOptimizationRequestInputModelTaxOptimizationInstanceRecord getTaxOptimizationInstanceRecord() {
    return taxOptimizationInstanceRecord;
  }

  public void setTaxOptimizationInstanceRecord(BQTaxOptimizationRequestInputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord) {
    this.taxOptimizationInstanceRecord = taxOptimizationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Tax Optimization instance request service call 
   * @return taxOptimizationRequestActionTaskReference
  **/

  public String getTaxOptimizationRequestActionTaskReference() {
    return taxOptimizationRequestActionTaskReference;
  }

  public void setTaxOptimizationRequestActionTaskReference(String taxOptimizationRequestActionTaskReference) {
    this.taxOptimizationRequestActionTaskReference = taxOptimizationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return taxOptimizationRequestActionTaskRecord
  **/

  public Object getTaxOptimizationRequestActionTaskRecord() {
    return taxOptimizationRequestActionTaskRecord;
  }

  public void setTaxOptimizationRequestActionTaskRecord(Object taxOptimizationRequestActionTaskRecord) {
    this.taxOptimizationRequestActionTaskRecord = taxOptimizationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Tax Optimization service request record 
   * @return taxOptimizationRequestRecordReference
  **/

  public String getTaxOptimizationRequestRecordReference() {
    return taxOptimizationRequestRecordReference;
  }

  public void setTaxOptimizationRequestRecordReference(String taxOptimizationRequestRecordReference) {
    this.taxOptimizationRequestRecordReference = taxOptimizationRequestRecordReference;
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

