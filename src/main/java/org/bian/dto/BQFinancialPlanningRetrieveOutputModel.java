package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceAnalysis;
import org.bian.dto.BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceRecord;
import org.bian.dto.BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFinancialPlanningRetrieveOutputModel
 */
public class BQFinancialPlanningRetrieveOutputModel   {
  private BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceRecord financialPlanningInstanceRecord = null;

  private String financialPlanningRetrieveActionTaskReference = null;

  private Object financialPlanningRetrieveActionTaskRecord = null;

  private String financialPlanningRetrieveActionResponse = null;

  private BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceReport financialPlanningInstanceReport = null;

  private BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceAnalysis financialPlanningInstanceAnalysis = null;


  /**
   * Get financialPlanningInstanceRecord
   * @return financialPlanningInstanceRecord
  **/

  public BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceRecord getFinancialPlanningInstanceRecord() {
    return financialPlanningInstanceRecord;
  }

  public void setFinancialPlanningInstanceRecord(BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceRecord financialPlanningInstanceRecord) {
    this.financialPlanningInstanceRecord = financialPlanningInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Planning instance retrieve service call 
   * @return financialPlanningRetrieveActionTaskReference
  **/

  public String getFinancialPlanningRetrieveActionTaskReference() {
    return financialPlanningRetrieveActionTaskReference;
  }

  public void setFinancialPlanningRetrieveActionTaskReference(String financialPlanningRetrieveActionTaskReference) {
    this.financialPlanningRetrieveActionTaskReference = financialPlanningRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return financialPlanningRetrieveActionResponse
  **/

  public String getFinancialPlanningRetrieveActionResponse() {
    return financialPlanningRetrieveActionResponse;
  }

  public void setFinancialPlanningRetrieveActionResponse(String financialPlanningRetrieveActionResponse) {
    this.financialPlanningRetrieveActionResponse = financialPlanningRetrieveActionResponse;
  }


  /**
   * Get financialPlanningInstanceReport
   * @return financialPlanningInstanceReport
  **/

  public BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceReport getFinancialPlanningInstanceReport() {
    return financialPlanningInstanceReport;
  }

  public void setFinancialPlanningInstanceReport(BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceReport financialPlanningInstanceReport) {
    this.financialPlanningInstanceReport = financialPlanningInstanceReport;
  }


  /**
   * Get financialPlanningInstanceAnalysis
   * @return financialPlanningInstanceAnalysis
  **/

  public BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceAnalysis getFinancialPlanningInstanceAnalysis() {
    return financialPlanningInstanceAnalysis;
  }

  public void setFinancialPlanningInstanceAnalysis(BQFinancialPlanningRetrieveOutputModelFinancialPlanningInstanceAnalysis financialPlanningInstanceAnalysis) {
    this.financialPlanningInstanceAnalysis = financialPlanningInstanceAnalysis;
  }


}

