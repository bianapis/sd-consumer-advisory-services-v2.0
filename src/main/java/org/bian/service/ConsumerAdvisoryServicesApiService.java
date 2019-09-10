/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ConsumerAdvisoryServicesApiService {

	SDConsumerAdvisoryServicesActivateOutputModel activate(SDConsumerAdvisoryServicesActivateInputModel request);
	
	SDConsumerAdvisoryServicesConfigureOutputModel configure(String sdReferenceId, SDConsumerAdvisoryServicesConfigureInputModel request);
	
	CRConsumerAdviceFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRConsumerAdviceFulfillmentArrangementControlInputModel request);
	
	BQServiceFeesExchangeOutputModel exchangeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExchangeInputModel request);
	
	BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request);
	
	SDConsumerAdvisoryServicesFeedbackOutputModel feedback(String sdReferenceId, SDConsumerAdvisoryServicesFeedbackInputModel request);
	
	CRConsumerAdviceFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRConsumerAdviceFulfillmentArrangementInitiateInputModel request);
	
	BQFinancialPlanningInitiateOutputModel initiateFinancialplanning(String sdReferenceId, String crReferenceId, BQFinancialPlanningInitiateInputModel request);
	
	BQProductGuidanceInitiateOutputModel initiateProductguidance(String sdReferenceId, String crReferenceId, BQProductGuidanceInitiateInputModel request);
	
	BQServiceFeesInitiateOutputModel initiateServicefees(String sdReferenceId, String crReferenceId, BQServiceFeesInitiateInputModel request);
	
	BQTaxOptimizationInitiateOutputModel initiateTaxoptimization(String sdReferenceId, String crReferenceId, BQTaxOptimizationInitiateInputModel request);
	
	BQFinancialPlanningRequestOutputModel requestFinancialplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialPlanningRequestInputModel request);
	
	BQProductGuidanceRequestOutputModel requestProductguidance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductGuidanceRequestInputModel request);
	
	BQTaxOptimizationRequestOutputModel requestTaxoptimization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTaxOptimizationRequestInputModel request);
	
	CRConsumerAdviceFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRConsumerAdviceFulfillmentArrangementRequestInputModel request);
	
	BQFinancialPlanningRetrieveOutputModel retrieveFinancialplanning(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductGuidanceRetrieveOutputModel retrieveProductguidance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTaxOptimizationRetrieveOutputModel retrieveTaxoptimization(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRConsumerAdviceFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDConsumerAdvisoryServicesRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRConsumerAdviceFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRConsumerAdviceFulfillmentArrangementUpdateInputModel request);
	
	BQFinancialPlanningUpdateOutputModel updateFinancialplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialPlanningUpdateInputModel request);
	
	BQProductGuidanceUpdateOutputModel updateProductguidance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductGuidanceUpdateInputModel request);
	
	BQServiceFeesUpdateOutputModel updateServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesUpdateInputModel request);
	
	BQTaxOptimizationUpdateOutputModel updateTaxoptimization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTaxOptimizationUpdateInputModel request);
	
}
