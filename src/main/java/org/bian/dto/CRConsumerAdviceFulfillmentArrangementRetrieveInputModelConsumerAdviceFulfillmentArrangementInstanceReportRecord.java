package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerAdviceFulfillmentArrangementRetrieveInputModelConsumerAdviceFulfillmentArrangementInstanceReportRecord
 */
public class CRConsumerAdviceFulfillmentArrangementRetrieveInputModelConsumerAdviceFulfillmentArrangementInstanceReportRecord   {
  private String consumerAdviceFulfillmentArrangementInstanceReportReference = null;

  private String consumerAdviceFulfillmentArrangementInstanceReportType = null;

  private String consumerAdviceFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return consumerAdviceFulfillmentArrangementInstanceReportReference
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceReportReference() {
    return consumerAdviceFulfillmentArrangementInstanceReportReference;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceReportReference(String consumerAdviceFulfillmentArrangementInstanceReportReference) {
    this.consumerAdviceFulfillmentArrangementInstanceReportReference = consumerAdviceFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return consumerAdviceFulfillmentArrangementInstanceReportType
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceReportType() {
    return consumerAdviceFulfillmentArrangementInstanceReportType;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceReportType(String consumerAdviceFulfillmentArrangementInstanceReportType) {
    this.consumerAdviceFulfillmentArrangementInstanceReportType = consumerAdviceFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return consumerAdviceFulfillmentArrangementInstanceReportParameters
  **/

  public String getConsumerAdviceFulfillmentArrangementInstanceReportParameters() {
    return consumerAdviceFulfillmentArrangementInstanceReportParameters;
  }

  public void setConsumerAdviceFulfillmentArrangementInstanceReportParameters(String consumerAdviceFulfillmentArrangementInstanceReportParameters) {
    this.consumerAdviceFulfillmentArrangementInstanceReportParameters = consumerAdviceFulfillmentArrangementInstanceReportParameters;
  }


}

