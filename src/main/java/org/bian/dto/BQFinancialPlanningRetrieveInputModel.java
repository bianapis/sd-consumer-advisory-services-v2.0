package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialPlanningRetrieveInputModelFinancialPlanningInstanceAnalysis;
import org.bian.dto.BQFinancialPlanningRetrieveInputModelFinancialPlanningInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFinancialPlanningRetrieveInputModel
 */
public class BQFinancialPlanningRetrieveInputModel   {
  private Object financialPlanningRetrieveActionTaskRecord = null;

  private String financialPlanningRetrieveActionRequest = null;

  private BQFinancialPlanningRetrieveInputModelFinancialPlanningInstanceReport financialPlanningInstanceReport = null;

  private BQFinancialPlanningRetrieveInputModelFinancialPlanningInstanceAnalysis financialPlanningInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialPlanningRetrieveActionTaskRecord
  **/

  public Object getFinancialPlanningRetrieveActionTaskRecord() {
    return financialPlanningRetrieveActionTaskRecord;
  }

  public void setFinancialPlanningRetrieveActionTaskRecord(Object financialPlanningRetrieveActionTaskRecord) {
    this.financialPlanningRetrieveActionTaskRecord = financialPlanningRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialPlanningRetrieveActionRequest
  **/

  public String getFinancialPlanningRetrieveActionRequest() {
    return financialPlanningRetrieveActionRequest;
  }

  public void setFinancialPlanningRetrieveActionRequest(String financialPlanningRetrieveActionRequest) {
    this.financialPlanningRetrieveActionRequest = financialPlanningRetrieveActionRequest;
  }


  /**
   * Get financialPlanningInstanceReport
   * @return financialPlanningInstanceReport
  **/

  public BQFinancialPlanningRetrieveInputModelFinancialPlanningInstanceReport getFinancialPlanningInstanceReport() {
    return financialPlanningInstanceReport;
  }

  public void setFinancialPlanningInstanceReport(BQFinancialPlanningRetrieveInputModelFinancialPlanningInstanceReport financialPlanningInstanceReport) {
    this.financialPlanningInstanceReport = financialPlanningInstanceReport;
  }


  /**
   * Get financialPlanningInstanceAnalysis
   * @return financialPlanningInstanceAnalysis
  **/

  public BQFinancialPlanningRetrieveInputModelFinancialPlanningInstanceAnalysis getFinancialPlanningInstanceAnalysis() {
    return financialPlanningInstanceAnalysis;
  }

  public void setFinancialPlanningInstanceAnalysis(BQFinancialPlanningRetrieveInputModelFinancialPlanningInstanceAnalysis financialPlanningInstanceAnalysis) {
    this.financialPlanningInstanceAnalysis = financialPlanningInstanceAnalysis;
  }


}

