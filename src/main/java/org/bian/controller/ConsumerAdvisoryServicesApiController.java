/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class ConsumerAdvisoryServicesApiController {

	@Autowired
	ConsumerAdvisoryServicesApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDConsumerAdvisoryServicesActivateOutputModel> activate(@RequestBody BianRequest<SDConsumerAdvisoryServicesActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDConsumerAdvisoryServicesConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDConsumerAdvisoryServicesConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRConsumerAdviceFulfillmentArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRConsumerAdviceFulfillmentArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Exchange
	public BianResponse<BQServiceFeesExchangeOutputModel> exchangeServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceFeesExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeServicefees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Execute
	public BianResponse<BQServiceFeesExecuteOutputModel> executeServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceFeesExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeServicefees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDConsumerAdvisoryServicesFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDConsumerAdvisoryServicesFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRConsumerAdviceFulfillmentArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRConsumerAdviceFulfillmentArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialplanning")
	@Fulfill.Initiate
	public BianResponse<BQFinancialPlanningInitiateOutputModel> initiateFinancialplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQFinancialPlanningInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateFinancialplanning(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("productguidance")
	@Fulfill.Initiate
	public BianResponse<BQProductGuidanceInitiateOutputModel> initiateProductguidance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQProductGuidanceInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateProductguidance(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Initiate
	public BianResponse<BQServiceFeesInitiateOutputModel> initiateServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQServiceFeesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateServicefees(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("taxoptimization")
	@Fulfill.Initiate
	public BianResponse<BQTaxOptimizationInitiateOutputModel> initiateTaxoptimization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTaxOptimizationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTaxoptimization(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialplanning")
	@Fulfill.Request
	public BianResponse<BQFinancialPlanningRequestOutputModel> requestFinancialplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialPlanningRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestFinancialplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productguidance")
	@Fulfill.Request
	public BianResponse<BQProductGuidanceRequestOutputModel> requestProductguidance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductGuidanceRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestProductguidance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("taxoptimization")
	@Fulfill.Request
	public BianResponse<BQTaxOptimizationRequestOutputModel> requestTaxoptimization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTaxOptimizationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTaxoptimization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Request
	public BianResponse<CRConsumerAdviceFulfillmentArrangementRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRConsumerAdviceFulfillmentArrangementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialplanning")
	@Fulfill.Retrieve
	public BianResponse<BQFinancialPlanningRetrieveOutputModel> retrieveFinancialplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFinancialplanning(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("productguidance")
	@Fulfill.Retrieve
	public BianResponse<BQProductGuidanceRetrieveOutputModel> retrieveProductguidance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductguidance(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("servicefees")
	@Fulfill.Retrieve
	public BianResponse<BQServiceFeesRetrieveOutputModel> retrieveServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicefees(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("taxoptimization")
	@Fulfill.Retrieve
	public BianResponse<BQTaxOptimizationRetrieveOutputModel> retrieveTaxoptimization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTaxoptimization(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRConsumerAdviceFulfillmentArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDConsumerAdvisoryServicesRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRConsumerAdviceFulfillmentArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRConsumerAdviceFulfillmentArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialplanning")
	@Fulfill.Update
	public BianResponse<BQFinancialPlanningUpdateOutputModel> updateFinancialplanning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialPlanningUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFinancialplanning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productguidance")
	@Fulfill.Update
	public BianResponse<BQProductGuidanceUpdateOutputModel> updateProductguidance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductGuidanceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProductguidance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Update
	public BianResponse<BQServiceFeesUpdateOutputModel> updateServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceFeesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateServicefees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("taxoptimization")
	@Fulfill.Update
	public BianResponse<BQTaxOptimizationUpdateOutputModel> updateTaxoptimization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTaxOptimizationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTaxoptimization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
