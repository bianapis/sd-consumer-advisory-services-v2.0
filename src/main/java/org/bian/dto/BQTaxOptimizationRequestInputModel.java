package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTaxOptimizationRequestInputModelTaxOptimizationInstanceRecord;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationRequestInputModel
 */
public class BQTaxOptimizationRequestInputModel   {
  private String consumerAdviceFulfillmentArrangementInstanceReference = null;

  private String taxOptimizationInstanceReference = null;

  private BQTaxOptimizationRequestInputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord = null;

  private Object taxOptimizationRequestActionTaskRecord = null;

  private CRConsumerAdviceFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Consumer Advice Fulfillment Arrangement instance 
   * @return consumerAdviceFulfillmentArrangementInstanceReference
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceReference() {
    return consumerAdviceFulfillmentArrangementInstanceReference;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceReference(String consumerAdviceFulfillmentArrangementInstanceReference) {
    this.consumerAdviceFulfillmentArrangementInstanceReference = consumerAdviceFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Tax Optimization instance 
   * @return taxOptimizationInstanceReference
  **/

  public String getTaxOptimizationInstanceReference() {
    return taxOptimizationInstanceReference;
  }

  public void setTaxOptimizationInstanceReference(String taxOptimizationInstanceReference) {
    this.taxOptimizationInstanceReference = taxOptimizationInstanceReference;
  }


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRConsumerAdviceFulfillmentArrangementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRConsumerAdviceFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

