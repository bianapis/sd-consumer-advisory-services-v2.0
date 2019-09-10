package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductGuidanceRetrieveInputModelProductGuidanceInstanceAnalysis;
import org.bian.dto.BQProductGuidanceRetrieveInputModelProductGuidanceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductGuidanceRetrieveInputModel
 */
public class BQProductGuidanceRetrieveInputModel   {
  private Object productGuidanceRetrieveActionTaskRecord = null;

  private String productGuidanceRetrieveActionRequest = null;

  private BQProductGuidanceRetrieveInputModelProductGuidanceInstanceReport productGuidanceInstanceReport = null;

  private BQProductGuidanceRetrieveInputModelProductGuidanceInstanceAnalysis productGuidanceInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productGuidanceRetrieveActionRequest
  **/

  public String getProductGuidanceRetrieveActionRequest() {
    return productGuidanceRetrieveActionRequest;
  }

  public void setProductGuidanceRetrieveActionRequest(String productGuidanceRetrieveActionRequest) {
    this.productGuidanceRetrieveActionRequest = productGuidanceRetrieveActionRequest;
  }


  /**
   * Get productGuidanceInstanceReport
   * @return productGuidanceInstanceReport
  **/

  public BQProductGuidanceRetrieveInputModelProductGuidanceInstanceReport getProductGuidanceInstanceReport() {
    return productGuidanceInstanceReport;
  }

  public void setProductGuidanceInstanceReport(BQProductGuidanceRetrieveInputModelProductGuidanceInstanceReport productGuidanceInstanceReport) {
    this.productGuidanceInstanceReport = productGuidanceInstanceReport;
  }


  /**
   * Get productGuidanceInstanceAnalysis
   * @return productGuidanceInstanceAnalysis
  **/

  public BQProductGuidanceRetrieveInputModelProductGuidanceInstanceAnalysis getProductGuidanceInstanceAnalysis() {
    return productGuidanceInstanceAnalysis;
  }

  public void setProductGuidanceInstanceAnalysis(BQProductGuidanceRetrieveInputModelProductGuidanceInstanceAnalysis productGuidanceInstanceAnalysis) {
    this.productGuidanceInstanceAnalysis = productGuidanceInstanceAnalysis;
  }


}

