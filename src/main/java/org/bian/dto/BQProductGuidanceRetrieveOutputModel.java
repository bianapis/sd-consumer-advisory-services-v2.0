package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceAnalysis;
import org.bian.dto.BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceRecord;
import org.bian.dto.BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceRetrieveOutputModel
 */
public class BQProductGuidanceRetrieveOutputModel   {
  private BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord = null;

  private String productGuidanceRetrieveActionTaskReference = null;

  private Object productGuidanceRetrieveActionTaskRecord = null;

  private String productGuidanceRetrieveActionResponse = null;

  private BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceReport productGuidanceInstanceReport = null;

  private BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceAnalysis productGuidanceInstanceAnalysis = null;


  /**
   * Get productGuidanceInstanceRecord
   * @return productGuidanceInstanceRecord
  **/

  public BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceRecord getProductGuidanceInstanceRecord() {
    return productGuidanceInstanceRecord;
  }

  public void setProductGuidanceInstanceRecord(BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceRecord productGuidanceInstanceRecord) {
    this.productGuidanceInstanceRecord = productGuidanceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Guidance instance retrieve service call 
   * @return productGuidanceRetrieveActionTaskReference
  **/

  public String getProductGuidanceRetrieveActionTaskReference() {
    return productGuidanceRetrieveActionTaskReference;
  }

  public void setProductGuidanceRetrieveActionTaskReference(String productGuidanceRetrieveActionTaskReference) {
    this.productGuidanceRetrieveActionTaskReference = productGuidanceRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productGuidanceRetrieveActionTaskRecord
  **/

  public Object getProductGuidanceRetrieveActionTaskRecord() {
    return productGuidanceRetrieveActionTaskRecord;
  }

  public void setProductGuidanceRetrieveActionTaskRecord(Object productGuidanceRetrieveActionTaskRecord) {
    this.productGuidanceRetrieveActionTaskRecord = productGuidanceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productGuidanceRetrieveActionResponse
  **/

  public String getProductGuidanceRetrieveActionResponse() {
    return productGuidanceRetrieveActionResponse;
  }

  public void setProductGuidanceRetrieveActionResponse(String productGuidanceRetrieveActionResponse) {
    this.productGuidanceRetrieveActionResponse = productGuidanceRetrieveActionResponse;
  }


  /**
   * Get productGuidanceInstanceReport
   * @return productGuidanceInstanceReport
  **/

  public BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceReport getProductGuidanceInstanceReport() {
    return productGuidanceInstanceReport;
  }

  public void setProductGuidanceInstanceReport(BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceReport productGuidanceInstanceReport) {
    this.productGuidanceInstanceReport = productGuidanceInstanceReport;
  }


  /**
   * Get productGuidanceInstanceAnalysis
   * @return productGuidanceInstanceAnalysis
  **/

  public BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceAnalysis getProductGuidanceInstanceAnalysis() {
    return productGuidanceInstanceAnalysis;
  }

  public void setProductGuidanceInstanceAnalysis(BQProductGuidanceRetrieveOutputModelProductGuidanceInstanceAnalysis productGuidanceInstanceAnalysis) {
    this.productGuidanceInstanceAnalysis = productGuidanceInstanceAnalysis;
  }


}

