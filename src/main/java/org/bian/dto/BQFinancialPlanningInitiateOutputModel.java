package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialPlanningInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQFinancialPlanningInitiateOutputModelFinancialPlanningInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFinancialPlanningInitiateOutputModel
 */
public class BQFinancialPlanningInitiateOutputModel   {
  private BQFinancialPlanningInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord = null;

  private String financialPlanningInstanceReference = null;

  private String financialPlanningInitiateActionReference = null;

  private Object financialPlanningInitiateActionRecord = null;

  private String financialPlanningInstanceStatus = null;

  private BQFinancialPlanningInitiateOutputModelFinancialPlanningInstanceRecord financialPlanningInstanceRecord = null;


  /**
   * Get consumerAdviceFulfillmentArrangementInstanceRecord
   * @return consumerAdviceFulfillmentArrangementInstanceRecord
  **/

  public BQFinancialPlanningInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord getConsumerAdviceFulfillmentArrangementInstanceRecord() {
    return consumerAdviceFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceRecord(BQFinancialPlanningInitiateOutputModelConsumerAdviceFulfillmentArrangementInstanceRecord consumerAdviceFulfillmentArrangementInstanceRecord) {
    this.consumerAdviceFulfillmentArrangementInstanceRecord = consumerAdviceFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Planning instance 
   * @return financialPlanningInstanceReference
  **/

  public String getFinancialPlanningInstanceReference() {
    return financialPlanningInstanceReference;
  }

  public void setFinancialPlanningInstanceReference(String financialPlanningInstanceReference) {
    this.financialPlanningInstanceReference = financialPlanningInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return financialPlanningInitiateActionReference
  **/

  public String getFinancialPlanningInitiateActionReference() {
    return financialPlanningInitiateActionReference;
  }

  public void setFinancialPlanningInitiateActionReference(String financialPlanningInitiateActionReference) {
    this.financialPlanningInitiateActionReference = financialPlanningInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return financialPlanningInitiateActionRecord
  **/

  public Object getFinancialPlanningInitiateActionRecord() {
    return financialPlanningInitiateActionRecord;
  }

  public void setFinancialPlanningInitiateActionRecord(Object financialPlanningInitiateActionRecord) {
    this.financialPlanningInitiateActionRecord = financialPlanningInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Financial Planning instance (e.g. initialised, pending, active) 
   * @return financialPlanningInstanceStatus
  **/

  public String getFinancialPlanningInstanceStatus() {
    return financialPlanningInstanceStatus;
  }

  public void setFinancialPlanningInstanceStatus(String financialPlanningInstanceStatus) {
    this.financialPlanningInstanceStatus = financialPlanningInstanceStatus;
  }


  /**
   * Get financialPlanningInstanceRecord
   * @return financialPlanningInstanceRecord
  **/

  public BQFinancialPlanningInitiateOutputModelFinancialPlanningInstanceRecord getFinancialPlanningInstanceRecord() {
    return financialPlanningInstanceRecord;
  }

  public void setFinancialPlanningInstanceRecord(BQFinancialPlanningInitiateOutputModelFinancialPlanningInstanceRecord financialPlanningInstanceRecord) {
    this.financialPlanningInstanceRecord = financialPlanningInstanceRecord;
  }


}

