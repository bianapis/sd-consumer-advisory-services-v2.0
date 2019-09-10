package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecordConsumerAdviceProfile;
import org.bian.dto.CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord
 */
public class BQTaxOptimizationInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String customerReference = null;

  private Object customerPositionStateInstanceRecord = null;

  private String bankBranchLocationReference = null;

  private String employeeBusinessUnitReference = null;

  private String consumerAdviceWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String consumerAdviceSessionSchedule = null;

  private CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecordConsumerAdviceProfile consumerAdviceProfile = null;

  private CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the advisory service session 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer receiving the financial advice 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The overall customer position state tracking and analysis, combining different analytical measures including credit, collateral and product/service cash flows 
   * @return customerPositionStateInstanceRecord
  **/

  public Object getCustomerPositionStateInstanceRecord() {
    return customerPositionStateInstanceRecord;
  }

  public void setCustomerPositionStateInstanceRecord(Object customerPositionStateInstanceRecord) {
    this.customerPositionStateInstanceRecord = customerPositionStateInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the customer account/relationship for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit and or employee reference to the source of the financial advice 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, forms and documents for the advisory session 
   * @return consumerAdviceWorkProducts
  **/

  public String getConsumerAdviceWorkProducts() {
    return consumerAdviceWorkProducts;
  }

  public void setConsumerAdviceWorkProducts(String consumerAdviceWorkProducts) {
    this.consumerAdviceWorkProducts = consumerAdviceWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for associated documents such as disclosures and acceptance records 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Target and actual dates for tasks performed (includes any specialist sessions) 
   * @return consumerAdviceSessionSchedule
  **/

  public String getConsumerAdviceSessionSchedule() {
    return consumerAdviceSessionSchedule;
  }

  public void setConsumerAdviceSessionSchedule(String consumerAdviceSessionSchedule) {
    this.consumerAdviceSessionSchedule = consumerAdviceSessionSchedule;
  }


  /**
   * Get consumerAdviceProfile
   * @return consumerAdviceProfile
  **/

  public CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecordConsumerAdviceProfile getConsumerAdviceProfile() {
    return consumerAdviceProfile;
  }

  public void setConsumerAdviceProfile(CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecordConsumerAdviceProfile consumerAdviceProfile) {
    this.consumerAdviceProfile = consumerAdviceProfile;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRConsumerAdviceFulfillmentArrangementInitiateInputModelConsumerAdviceFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

