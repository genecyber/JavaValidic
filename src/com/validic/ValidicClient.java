package com.validic;

import com.validic.core.Biometric;
import com.validic.core.Diabetes;
import com.validic.core.GetRequest;
import com.validic.core.Request;
import com.validic.core.Fitness;
import com.validic.core.IBiometric;
import com.validic.core.IDiabetes;
import com.validic.core.IFitness;
import com.validic.core.INutrition;
import com.validic.core.IOrganization;
import com.validic.core.IProfile;
import com.validic.core.IRoutine;
import com.validic.core.ISleep;
import com.validic.core.ITobaccoCessation;
import com.validic.core.IUsers;
import com.validic.core.IWeight;
import com.validic.core.Nutrition;
import com.validic.core.Profile;
import com.validic.core.Routine;
import com.validic.core.Sleep;
import com.validic.core.TobaccoCessation;
import com.validic.core.User;
import com.validic.core.Weight;

import retrofit.ErrorHandler;
import retrofit.RestAdapter;

public class ValidicClient {
  private static final String ENTERPRISE_ACCESS_TOKEN = "d1d4b6b149092951a0735465f62792dc02a0991afe866faa75e3394bdb36fe0a";

  //Testing using runscope
  private static final String API_URL = "https://api-validic-com-u2mnzvw5pn8l.runscope.net/v1";
  private static final String ORG_ID = "53f22873edd24214d7000087";
  
  	ErrorHandler handler = new ValidicErrorHandler();
    RestAdapter restAdapter = new RestAdapter.Builder()
        .setEndpoint(API_URL)
        .setConverter(new JacksonConverter())
        .build();

    IUsers userClient = restAdapter.create(IUsers.class);
    IOrganization organizationClient = restAdapter.create(IOrganization.class);
    IProfile profileClient = restAdapter.create(IProfile.class);
    IBiometric biometricClient = restAdapter.create(IBiometric.class);
    IDiabetes diabetesClient = restAdapter.create(IDiabetes.class);
    IFitness fitnessClient = restAdapter.create(IFitness.class);
    INutrition nutritionClient = restAdapter.create(INutrition.class);
    IRoutine routineClient = restAdapter.create(IRoutine.class);
    ISleep sleepClient = restAdapter.create(ISleep.class);
    ITobaccoCessation tobaccoClient = restAdapter.create(ITobaccoCessation.class);
    IWeight weightClient = restAdapter.create(IWeight.class);
    
    
	public GetRequest GetOrganizationInfo() {
    	GetRequest env = organizationClient.organization(ORG_ID,ENTERPRISE_ACCESS_TOKEN);
    	return env;
    }
	
	public Request AddUser(String uid) {
		Request request = MakeUserRequestMethod(uid);		
		
		Request response = userClient.userCreate(ORG_ID,request);
		return response;		
	}
	
	public Request SuspendUser(String UserId) {
		Request request = new Request();
		request.setAccessToken(ENTERPRISE_ACCESS_TOKEN);
		request.setSuspend("1");
		Request response = userClient.userSuspend(ORG_ID,UserId,request);
		return response;		
	}
	
	public Request UnSuspendUser(String UserId) {
		Request request = new Request();
		request.setAccessToken(ENTERPRISE_ACCESS_TOKEN);
		request.setSuspend("0");
		Request response = userClient.userSuspend(ORG_ID,UserId,request);
		return response;		
	}

	private Request MakeUserRequestMethod(String uid) {
		Request request = new Request();
		User u = new User();
		u.setUid(uid);
		request.setUser(u);
		request.setAccessToken(ENTERPRISE_ACCESS_TOKEN);
		return request;
	}
	
    public GetRequest GetUsers() {
    	GetRequest env = userClient.users(ORG_ID,ENTERPRISE_ACCESS_TOKEN);
    	return env;
    }    
    
	public Request GetAuthenticationToken(String UserID) {
		Request env = userClient.refresh_token(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN);
		return env;
	}
    
    /**
     * GetProfile()
     * Gets a user Profile
     * Sending both the org token and the user access token returns weird profiles
     * @param authentication_token
     * @return Envelope
     */
    public GetRequest GetProfile(String authentication_token) {
    	GetRequest env = profileClient.profile(authentication_token);
    	return env;
    }
    public GetRequest GetFitness(String UserID) {
    	GetRequest env;
    	if (Filters.UseFilters)
    		env = fitnessClient.fitness(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN,Filters.FilterMap);
    	else
    		env = fitnessClient.fitness(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN);
    	return env;
    }
    public GetRequest GetRoutine(String UserID) {
    	GetRequest env;
    	if (Filters.UseFilters)
    		env = routineClient.routine(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN, Filters.FilterMap);
    	else
    		env = routineClient.routine(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN);
    	return env;
    }
    public GetRequest GetNutrition(String UserID) {
    	GetRequest env;
    	if (Filters.UseFilters)
    		env = nutritionClient.nutrition(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN,Filters.FilterMap);
    	else
    		env = nutritionClient.nutrition(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN);
    	return env;
    }
    public GetRequest GetSleep(String UserID) {
    	GetRequest env;
    	if (Filters.UseFilters)
    		env = sleepClient.sleep(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN,Filters.FilterMap);
    	else
    		env = sleepClient.sleep(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN);
    	return env;
    }
    public GetRequest GetWeight(String UserID) {
    	GetRequest env;
    	if (Filters.UseFilters)
    		env = weightClient.weight(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN,Filters.FilterMap);
    	else
    		env = weightClient.weight(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN);
    	return env;
    }
    public GetRequest GetDiabetes(String UserID) {
    	GetRequest env;
    	if (Filters.UseFilters)
    		env = diabetesClient.diabetes(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN,Filters.FilterMap);
    	else
    		env = diabetesClient.diabetes(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN);
    	return env;
    }
    public GetRequest GetBiometrics(String UserID) {
    	GetRequest env;
    	if (Filters.UseFilters)
    		env = biometricClient.biometrics(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN,Filters.FilterMap);
    	else
    		env = biometricClient.biometrics(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN);
    	return env;
    }
    public GetRequest GetTobaccoCessation(String UserID) {
    	GetRequest env;
    	if (Filters.UseFilters)
    		env = tobaccoClient.tobacco_cessation(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN,Filters.FilterMap);
    	else
    		env = tobaccoClient.tobacco_cessation(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN);
    	return env;
    }
    
    public Request AddProfile(Profile profile, String userAuthToken) {
    	Request request = new Request();
    	request.setAuthenticationToken(userAuthToken);
    	request.setProfile(profile);
    	Request env = profileClient.profileCreate(request);    	
    	return env;
    }

	public void DeleteAllUsers() {
		GetRequest users = GetUsers();
		for (User user : users.getUsers() ) {
			try {
				DeleteUser(user.getId());
			} catch (Exception e) { }
		}
		
	}

	public Request AddFitness(String UserID, Fitness fitness) {
		Request request = new Request();
		request.setAccessToken(ENTERPRISE_ACCESS_TOKEN);
		request.setFitness(fitness);		
		Request env = fitnessClient.fitnessCreate(ORG_ID,UserID,request); 
		return env;
	}

	public Request AddRoutine(String id, Routine item) {
		Request request = new Request();
		request.setAccessToken(ENTERPRISE_ACCESS_TOKEN);
		request.setRoutine(item);		
		Request env = routineClient.routineCreate(ORG_ID,id,request); 
		return env;
	}

	public Request AddNutrition(String id, Nutrition item) {
		Request request = new Request();
		request.setAccessToken(ENTERPRISE_ACCESS_TOKEN);
		request.setNutrition(item);		
		Request env = nutritionClient.nutritionCreate(ORG_ID,id,request); 
		return env;
	}

	public Request AddSleep(String id, Sleep item) {
		Request request = new Request();
		request.setAccessToken(ENTERPRISE_ACCESS_TOKEN);
		request.setSleep(item);		
		Request env = sleepClient.sleepCreate(ORG_ID,id,request); 
		return env;
	}

	public Request AddWeight(String id, Weight item) {
		Request request = new Request();
		request.setAccessToken(ENTERPRISE_ACCESS_TOKEN);
		request.setWeight(item);		
		Request env = weightClient.weightCreate(ORG_ID,id,request); 
		return env;
	}

	public Request AddDiabetes(String id, Diabetes item) {
		Request request = new Request();
		request.setAccessToken(ENTERPRISE_ACCESS_TOKEN);
		request.setDiabetes(item);		
		Request env = diabetesClient.diabetesCreate(ORG_ID,id,request); 
		return env;
	}

	public Request AddBiometrics(String id, Biometric item) {
		Request request = new Request();
		request.setAccessToken(ENTERPRISE_ACCESS_TOKEN);
		request.setBiometrics(item);		
		Request env = biometricClient.biometricsCreate(ORG_ID,id,request); 
		return env;
	}

	public Request AddTobacco(String id, TobaccoCessation item) {
		Request request = new Request();
		request.setAccessToken(ENTERPRISE_ACCESS_TOKEN);
		request.setTobaccoCessation(item);		
		Request env = tobaccoClient.tobacco_cessationCreate(ORG_ID,id,request); 
		return env;
	}
	
	public Request DeleteUser(String UserID) {
		Request response = userClient.userDelete(ORG_ID,UserID,ENTERPRISE_ACCESS_TOKEN);
		return response;
	}
	
	public Request DeleteUserByUid(String uid){
		Request response = new Request();
		response = userClient.userDeleteByUid(ORG_ID,uid,ENTERPRISE_ACCESS_TOKEN);
		return response;
	}

	public Request DeleteFitness(String UserId, String ActivityId) {
		Request response = new Request();
		response = fitnessClient.fitnessDelete(ORG_ID,UserId,ActivityId,ENTERPRISE_ACCESS_TOKEN);
		return response;
	}
	
	public Request DeleteRoutine(String UserId, String ActivityId) {
		Request response = new Request();
		response = routineClient.routineDelete(ORG_ID,UserId,ActivityId,ENTERPRISE_ACCESS_TOKEN);
		return response;
	}

	public Request DeleteNutrition(String UserId, String ActivityId) {
		Request response = new Request();
		response = nutritionClient.nutritionDelete(ORG_ID,UserId,ActivityId,ENTERPRISE_ACCESS_TOKEN);
		return response;
	}
	
	public Request DeleteSleep(String UserId, String ActivityId) {
		Request response = new Request();
		response = sleepClient.sleepDelete(ORG_ID,UserId,ActivityId,ENTERPRISE_ACCESS_TOKEN);
		return response;
	}
	
	public Request DeleteWeight(String UserId, String ActivityId) {
		Request response = new Request();
		response = weightClient.weightDelete(ORG_ID,UserId,ActivityId,ENTERPRISE_ACCESS_TOKEN);
		return response;
	}
	
	public Request DeleteDiabetes(String UserId, String ActivityId) {
		Request response = new Request();
		response = diabetesClient.diabetesDelete(ORG_ID,UserId,ActivityId,ENTERPRISE_ACCESS_TOKEN);
		return response;
	}
	
	public Request DeleteBiometric(String UserId, String ActivityId) {
		Request response = new Request();
		response = biometricClient.biometricsDelete(ORG_ID,UserId,ActivityId,ENTERPRISE_ACCESS_TOKEN);
		return response;
	}
	
	public Request DeleteTobaccoCessation(String UserId, String ActivityId) {
		Request response = new Request();
		response = tobaccoClient.tobacco_cessationDelete(ORG_ID,UserId,ActivityId,ENTERPRISE_ACCESS_TOKEN);
		return response;
	}
	
	public Request UpdateUser(String UserId, String newuid) {
		Request response = new Request();		
		Request request = MakeUserRequestMethod(newuid);		
		response = userClient.userUpdate(ORG_ID,UserId,request);
		return response;
	}

	public Request UpdateFitness(String UserId, String ActivityId, Fitness fitness) {
		Request response = new Request();
		response.setFitness(fitness);
		response = fitnessClient.fitnessUpdate(ORG_ID, UserId, ActivityId, ENTERPRISE_ACCESS_TOKEN, response);
		return response;
	}
	
	public Request UpdateRoutine(String UserId, String ActivityId, Routine routine) {
		Request response = new Request();
		response.setRoutine(routine);
		response = routineClient.routineUpdate(ORG_ID, UserId, ActivityId, ENTERPRISE_ACCESS_TOKEN, response);
		return response;
	}
	
	public Request UpdateNutrition(String UserId, String ActivityId, Nutrition nutrition) {
		Request response = new Request();
		response.setNutrition(nutrition);
		response = nutritionClient.nutritionUpdate(ORG_ID, UserId, ActivityId, ENTERPRISE_ACCESS_TOKEN, response);
		return response;
	}
	
	public Request UpdateSleep(String UserId, String ActivityId, Sleep sleep) {
		Request response = new Request();
		response.setSleep(sleep);
		response = sleepClient.sleepUpdate(ORG_ID, UserId, ActivityId, ENTERPRISE_ACCESS_TOKEN, response);
		return response;
	}
	
	public Request UpdateWeight(String UserId, String ActivityId, Weight weight) {
		Request response = new Request();
		response.setWeight(weight);
		response = weightClient.weightUpdate(ORG_ID, UserId, ActivityId, ENTERPRISE_ACCESS_TOKEN, response);
		return response;
	}
	
	public Request UpdateDiabetes(String UserId, String ActivityId, Diabetes diabetes) {
		Request response = new Request();
		response.setDiabetes(diabetes);
		response = diabetesClient.diabetesUpdate(ORG_ID, UserId, ActivityId, ENTERPRISE_ACCESS_TOKEN, response);
		return response;
	}
	
	public Request UpdateBiometric(String UserId, String ActivityId, Biometric biometric) {
		Request response = new Request();
		response.setBiometrics(biometric);
		response = biometricClient.biometricsUpdate(ORG_ID, UserId, ActivityId, ENTERPRISE_ACCESS_TOKEN, response);
		return response;
	}
	
	public Request UpdateTobaccoCessation(String UserId, String ActivityId, TobaccoCessation tobacco) {
		Request response = new Request();
		response.setTobaccoCessation(tobacco);
		response = tobaccoClient.tobacco_cessationUpdate(ORG_ID, UserId, ActivityId, ENTERPRISE_ACCESS_TOKEN, response);
		return response;
	}

    
}
