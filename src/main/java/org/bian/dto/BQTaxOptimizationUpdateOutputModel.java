package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationUpdateOutputModel
 */
public class BQTaxOptimizationUpdateOutputModel   {
  private BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord = null;

  private String taxOptimizationUpdateActionTaskReference = null;

  private Object taxOptimizationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get taxOptimizationInstanceRecord
   * @return taxOptimizationInstanceRecord
  **/

  public BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecord getTaxOptimizationInstanceRecord() {
    return taxOptimizationInstanceRecord;
  }

  public void setTaxOptimizationInstanceRecord(BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord) {
    this.taxOptimizationInstanceRecord = taxOptimizationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return taxOptimizationUpdateActionTaskReference
  **/

  public String getTaxOptimizationUpdateActionTaskReference() {
    return taxOptimizationUpdateActionTaskReference;
  }

  public void setTaxOptimizationUpdateActionTaskReference(String taxOptimizationUpdateActionTaskReference) {
    this.taxOptimizationUpdateActionTaskReference = taxOptimizationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return taxOptimizationUpdateActionTaskRecord
  **/

  public Object getTaxOptimizationUpdateActionTaskRecord() {
    return taxOptimizationUpdateActionTaskRecord;
  }

  public void setTaxOptimizationUpdateActionTaskRecord(Object taxOptimizationUpdateActionTaskRecord) {
    this.taxOptimizationUpdateActionTaskRecord = taxOptimizationUpdateActionTaskRecord;
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

