package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction;

import javax.validation.Valid;
  
/**
 * BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeApplicationRecord
 */
public class BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeApplicationRecord   {
  private BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction = null;


  /**
   * Get feeTransaction
   * @return feeTransaction
  **/

  public BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction getFeeTransaction() {
    return feeTransaction;
  }

  public void setFeeTransaction(BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction) {
    this.feeTransaction = feeTransaction;
  }


}

