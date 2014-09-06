package tests.validic;

import main.validic.ValidicClient;
import main.validic.core.*;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class UpdateTests {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ValidicClient client = new ValidicClient();
		client.DeleteAllUsers();
	}

    @After
	public void tearDown() throws Exception {
		ValidicClient client = new ValidicClient();
		client.DeleteAllUsers();
	}
	
	@Test
	public void UpdateUserTest() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("update");
		Request updateResponse = client.UpdateUser(response.getUser().getId(),"updated");
		assertTrue(updateResponse.getUser().getUid().equals("updated"));
	}
	
	@Test
	public void UpdateFitnessTest() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("update");
		
		//Add Actvity
		Fitness activity = TestingMocks.CreateFitnessItems();
		Request addResponse = client.AddFitness(response.getUser().getId(),activity);
		
		//Update Activity
		activity.setTimestamp("2013-03-11T07:12:16+00:00");
		
		//Update Activity
		client.UpdateFitness(response.getUser().getId(),addResponse.getFitness().getId(),activity);		
		
		//Check
		TestingMocks.SetFilterStartDataInThePast();
		GetRequest queryResponse = client.GetFitness(response.getUser().getId());
		assertTrue(queryResponse.getFitness().get(0).getTimestamp().equals("2013-03-11T07:12:16+00:00"));
	}
	
	@Test
	public void UpdateRoutineTest() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("update");
		
		//Add Actvity
		Routine activity = TestingMocks.CreateRoutineItems();
		Request addResponse = client.AddRoutine(response.getUser().getId(),activity);
		
		//Update Activity
		activity.setTimestamp("2013-03-11T07:12:16+00:00");
		
		//Update Activity
		client.UpdateRoutine(response.getUser().getId(),addResponse.getRoutine().getId(),activity);		
		
		//Check
		TestingMocks.SetFilterStartDataInThePast();
		GetRequest queryResponse = client.GetRoutine(response.getUser().getId());
		assertTrue(queryResponse.getRoutine().get(0).getTimestamp().equals("2013-03-11T07:12:16+00:00"));
	}
	
	@Test
	public void UpdateNutritionTest() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("update");
		
		//Add Actvity
		Nutrition activity = TestingMocks.CreatenutritionItems();
		Request addResponse = client.AddNutrition(response.getUser().getId(),activity);
		
		//Update Activity
		activity.setTimestamp("2013-03-11T07:12:16+00:00");
		
		//Update Activity
		client.UpdateNutrition(response.getUser().getId(),addResponse.getNutrition().getId(),activity);		
		
		//Check
		TestingMocks.SetFilterStartDataInThePast();
		GetRequest queryResponse = client.GetNutrition(response.getUser().getId());
		assertTrue(queryResponse.getNutrition().get(0).getTimestamp().equals("2013-03-11T07:12:16+00:00"));
	}
	
	@Test
	public void UpdateSleepTest() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("update");
		
		//Add Actvity
		Sleep activity = TestingMocks.CreateSleepItems();
		Request addResponse = client.AddSleep(response.getUser().getId(),activity);
		
		//Update Activity
		activity.setTimestamp("2013-03-11T07:12:16+00:00");
		
		//Update Activity
		client.UpdateSleep(response.getUser().getId(),addResponse.getSleep().getId(),activity);		
		
		//Check
		TestingMocks.SetFilterStartDataInThePast();
		GetRequest queryResponse = client.GetSleep(response.getUser().getId());
		assertTrue(queryResponse.getSleep().get(0).getTimestamp().equals("2013-03-11T07:12:16+00:00"));
	}
	
	@Test
	public void UpdateWeightTest() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("update");
		
		//Add Actvity
		Weight activity = TestingMocks.CreateWeightItem();
		Request addResponse = client.AddWeight(response.getUser().getId(),activity);
		
		//Update Activity
		activity.setTimestamp("2013-03-11T07:12:16+00:00");
		
		//Update Activity
		client.UpdateWeight(response.getUser().getId(),addResponse.getWeight().getId(),activity);		
		
		//Check
		TestingMocks.SetFilterStartDataInThePast();
		GetRequest queryResponse = client.GetWeight(response.getUser().getId());
		assertTrue(queryResponse.getWeight().get(0).getTimestamp().equals("2013-03-11T07:12:16+00:00"));
	}
	

	@Test
	public void UpdateDiabetesTest() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("update");
		
		//Add Actvity
		Diabetes activity = TestingMocks.CreateDiabetesItems();
		Request addResponse = client.AddDiabetes(response.getUser().getId(),activity);
		
		//Update Activity
		activity.setTimestamp("2013-03-11T07:12:16+00:00");
		
		//Update Activity
		client.UpdateDiabetes(response.getUser().getId(),addResponse.getDiabetes().getId(),activity);		
		
		//Check
		TestingMocks.SetFilterStartDataInThePast();
		GetRequest queryResponse = client.GetDiabetes(response.getUser().getId());
		assertTrue(queryResponse.getDiabetes().get(0).getTimestamp().equals("2013-03-11T07:12:16+00:00"));
	}


	@Test
	public void UpdateBiometricTest() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("update");
		
		//Add Actvity
		Biometric activity = TestingMocks.CreateBiometricsItems();
		Request addResponse = client.AddBiometrics(response.getUser().getId(),activity);
		
		//Update Activity
		activity.setTimestamp("2013-03-11T07:12:16+00:00");
		
		//Update Activity
		client.UpdateBiometric(response.getUser().getId(),addResponse.getBiometrics().getId(),activity);		
		
		//Check
		TestingMocks.SetFilterStartDataInThePast();
		GetRequest queryResponse = client.GetBiometrics(response.getUser().getId());
		assertTrue(queryResponse.getBiometrics().get(0).getTimestamp().equals("2013-03-11T07:12:16+00:00"));
	}
	
	@Test
	public void UpdateTobaccoTest() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("update");
		
		//Add Actvity
		TobaccoCessation activity = TestingMocks.CreateTobaccoItems();
		Request addResponse = client.AddTobacco(response.getUser().getId(),activity);
		
		//Update Activity
		activity.setTimestamp("2013-03-11T07:12:16+00:00");
		
		//Update Activity
		client.UpdateTobaccoCessation(response.getUser().getId(),addResponse.getTobaccoCessation().getId(),activity);		
		
		//Check
		TestingMocks.SetFilterStartDataInThePast();
		GetRequest queryResponse = client.GetTobaccoCessation(response.getUser().getId());
		assertTrue(queryResponse.getTobaccoCessation().get(0).getTimestamp().equals("2013-03-11T07:12:16+00:00"));
	}
	
	@Test
	public void SuspendUserTest() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("suspend");
		
		response = client.SuspendUser(response.getUser().getId());
		assertTrue(response.getMessage().equals("The user has been suspended successfully"));
	}
	
	@Test
	public void UnSuspendUserTest() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("suspend");
		Request suspendResponse;
		suspendResponse = client.UnSuspendUser(response.getUser().getId());
		
		assertTrue(suspendResponse.getMessage().equals("The user has been unsuspended successfully"));
	}
	
	
}
