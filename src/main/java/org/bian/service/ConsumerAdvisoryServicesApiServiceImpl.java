/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ConsumerAdvisoryServicesApiServiceImpl implements ConsumerAdvisoryServicesApiService {

	public SDConsumerAdvisoryServicesActivateOutputModel activate(SDConsumerAdvisoryServicesActivateInputModel request){
		return JsonReader.read("activate-SDConsumerAdvisoryServicesActivateOutputModel.json",new TypeReference<SDConsumerAdvisoryServicesActivateOutputModel>(){});
	}
	
	public SDConsumerAdvisoryServicesConfigureOutputModel configure(String sdReferenceId, SDConsumerAdvisoryServicesConfigureInputModel request){
		return JsonReader.read("configure-SDConsumerAdvisoryServicesConfigureOutputModel.json",new TypeReference<SDConsumerAdvisoryServicesConfigureOutputModel>(){});
	}
	
	public CRConsumerAdviceFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRConsumerAdviceFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRConsumerAdviceFulfillmentArrangementControlOutputModel.json",new TypeReference<CRConsumerAdviceFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQServiceFeesExchangeOutputModel exchangeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExchangeInputModel request){
		return JsonReader.read("exchange-BQServiceFeesExchangeOutputModel.json",new TypeReference<BQServiceFeesExchangeOutputModel>(){});
	}
	
	public BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request){
		return JsonReader.read("execute-BQServiceFeesExecuteOutputModel.json",new TypeReference<BQServiceFeesExecuteOutputModel>(){});
	}
	
	public SDConsumerAdvisoryServicesFeedbackOutputModel feedback(String sdReferenceId, SDConsumerAdvisoryServicesFeedbackInputModel request){
		return JsonReader.read("feedback-SDConsumerAdvisoryServicesFeedbackOutputModel.json",new TypeReference<SDConsumerAdvisoryServicesFeedbackOutputModel>(){});
	}
	
	public CRConsumerAdviceFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRConsumerAdviceFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRConsumerAdviceFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRConsumerAdviceFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQFinancialPlanningInitiateOutputModel initiateFinancialplanning(String sdReferenceId, String crReferenceId, BQFinancialPlanningInitiateInputModel request){
		return JsonReader.read("initiate-BQFinancialPlanningInitiateOutputModel.json",new TypeReference<BQFinancialPlanningInitiateOutputModel>(){});
	}
	
	public BQProductGuidanceInitiateOutputModel initiateProductguidance(String sdReferenceId, String crReferenceId, BQProductGuidanceInitiateInputModel request){
		return JsonReader.read("initiate-BQProductGuidanceInitiateOutputModel.json",new TypeReference<BQProductGuidanceInitiateOutputModel>(){});
	}
	
	public BQServiceFeesInitiateOutputModel initiateServicefees(String sdReferenceId, String crReferenceId, BQServiceFeesInitiateInputModel request){
		return JsonReader.read("initiate-BQServiceFeesInitiateOutputModel.json",new TypeReference<BQServiceFeesInitiateOutputModel>(){});
	}
	
	public BQTaxOptimizationInitiateOutputModel initiateTaxoptimization(String sdReferenceId, String crReferenceId, BQTaxOptimizationInitiateInputModel request){
		return JsonReader.read("initiate-BQTaxOptimizationInitiateOutputModel.json",new TypeReference<BQTaxOptimizationInitiateOutputModel>(){});
	}
	
	public BQFinancialPlanningRequestOutputModel requestFinancialplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialPlanningRequestInputModel request){
		return JsonReader.read("request-BQFinancialPlanningRequestOutputModel.json",new TypeReference<BQFinancialPlanningRequestOutputModel>(){});
	}
	
	public BQProductGuidanceRequestOutputModel requestProductguidance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductGuidanceRequestInputModel request){
		return JsonReader.read("request-BQProductGuidanceRequestOutputModel.json",new TypeReference<BQProductGuidanceRequestOutputModel>(){});
	}
	
	public BQTaxOptimizationRequestOutputModel requestTaxoptimization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTaxOptimizationRequestInputModel request){
		return JsonReader.read("request-BQTaxOptimizationRequestOutputModel.json",new TypeReference<BQTaxOptimizationRequestOutputModel>(){});
	}
	
	public CRConsumerAdviceFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRConsumerAdviceFulfillmentArrangementRequestInputModel request){
		return JsonReader.read("request-CRConsumerAdviceFulfillmentArrangementRequestOutputModel.json",new TypeReference<CRConsumerAdviceFulfillmentArrangementRequestOutputModel>(){});
	}
	
	public BQFinancialPlanningRetrieveOutputModel retrieveFinancialplanning(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFinancialPlanningRetrieveOutputModel.json",new TypeReference<BQFinancialPlanningRetrieveOutputModel>(){});
	}
	
	public BQProductGuidanceRetrieveOutputModel retrieveProductguidance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductGuidanceRetrieveOutputModel.json",new TypeReference<BQProductGuidanceRetrieveOutputModel>(){});
	}
	
	public BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceFeesRetrieveOutputModel.json",new TypeReference<BQServiceFeesRetrieveOutputModel>(){});
	}
	
	public BQTaxOptimizationRetrieveOutputModel retrieveTaxoptimization(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTaxOptimizationRetrieveOutputModel.json",new TypeReference<BQTaxOptimizationRetrieveOutputModel>(){});
	}
	
	public CRConsumerAdviceFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRConsumerAdviceFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRConsumerAdviceFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDConsumerAdvisoryServicesRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDConsumerAdvisoryServicesRetrieveOutputModel.json",new TypeReference<SDConsumerAdvisoryServicesRetrieveOutputModel>(){});
	}
	
	public CRConsumerAdviceFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRConsumerAdviceFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRConsumerAdviceFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRConsumerAdviceFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQFinancialPlanningUpdateOutputModel updateFinancialplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialPlanningUpdateInputModel request){
		return JsonReader.read("update-BQFinancialPlanningUpdateOutputModel.json",new TypeReference<BQFinancialPlanningUpdateOutputModel>(){});
	}
	
	public BQProductGuidanceUpdateOutputModel updateProductguidance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductGuidanceUpdateInputModel request){
		return JsonReader.read("update-BQProductGuidanceUpdateOutputModel.json",new TypeReference<BQProductGuidanceUpdateOutputModel>(){});
	}
	
	public BQServiceFeesUpdateOutputModel updateServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesUpdateInputModel request){
		return JsonReader.read("update-BQServiceFeesUpdateOutputModel.json",new TypeReference<BQServiceFeesUpdateOutputModel>(){});
	}
	
	public BQTaxOptimizationUpdateOutputModel updateTaxoptimization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTaxOptimizationUpdateInputModel request){
		return JsonReader.read("update-BQTaxOptimizationUpdateOutputModel.json",new TypeReference<BQTaxOptimizationUpdateOutputModel>(){});
	}
	
}
