package tests.validic;

import main.validic.ValidicClient;
import main.validic.ValidicObjectException;
import main.validic.core.*;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import retrofit.RetrofitError;

import static org.junit.Assert.assertTrue;


public class DeleteTests {
	
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
	public void DeleteUserByUidTest() throws ValidicObjectException {
		ValidicClient client = new ValidicClient();
		client.AddUser("delete1");
		Request deletedRespoonse = client.DeleteUserByUid("delete1");
		assertTrue(deletedRespoonse.getCode() == 200);
		assertTrue(deletedRespoonse.getMessage().equals("Ok"));
	}
	
	@Test
	public void DeleteUserByIdTest() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("delete3");
		Request deletedRespoonse = client.DeleteUser(response.getUser().getId());
		assertTrue(deletedRespoonse.getCode() == 200);
		assertTrue(deletedRespoonse.getMessage().equals("Ok"));
	}
	
	@Test
	public void DeleteUserTwiceTest() {
		ValidicClient client = new ValidicClient();
		client.AddUser("delete2");
		Request deletedRespoonse;
		try {
			deletedRespoonse = client.DeleteUserByUid("delete2");
		} catch (RetrofitError e) {			
			deletedRespoonse = ((Request)e.getBody());
			
		}
		try {
			deletedRespoonse = client.DeleteUserByUid("delete2");
		} catch (RetrofitError e) {
			deletedRespoonse = ((Request)e.getBody());
			
		}
		assertTrue(deletedRespoonse.getCode() == 404);
		assertTrue(deletedRespoonse.getErrors().equals("No user found"));
	}
	
	@Test
	public void DeleteFitnessTest() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		
		Fitness item = TestingMocks.CreateFitnessItems();
		Request validicResponse = client.AddFitness(response.getUser().getId(),item);
		
		TestingMocks.SetFilterStartDataInThePast();
		
		//Check that users's fitness record got pushed
		GetRequest getResponse = client.GetFitness(response.getUser().getId());
		assertTrue(getResponse.getFitness().size() > 0);
		
		//Delete the record
		Request deletedRespoonse = client.DeleteFitness(response.getUser().getId(),validicResponse.getFitness().getId());
		assertTrue(deletedRespoonse.getCode() == 200);
		assertTrue(deletedRespoonse.getMessage().equals("Ok"));
		
		//Check that users's fitness record is actually gone
		getResponse = client.GetFitness(response.getUser().getId());
		assertTrue(getResponse.getFitness().size() == 0);
	}
	
	@Test
	public void RoutineDeleteTest() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		
		Routine item = TestingMocks.CreateRoutineItems();
		Request validicResponse = client.AddRoutine(response.getUser().getId(),item);
		
		TestingMocks.SetFilterStartDataInThePast();
		
		//Check that users's record got pushed
		GetRequest getResponse = client.GetRoutine(response.getUser().getId());
		assertTrue(getResponse.getRoutine().size() > 0);
		
		//Delete the record
		Request deletedRespoonse = client.DeleteRoutine(response.getUser().getId(),validicResponse.getRoutine().getId());
		assertTrue(deletedRespoonse.getCode() == 200);
		assertTrue(deletedRespoonse.getMessage().equals("Ok"));
		
		//Check that users's record is actually gone
		getResponse = client.GetRoutine(response.getUser().getId());
		assertTrue(getResponse.getRoutine().size() == 0);
	}
	@Test
	public void DeleteNutritionTest() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		
		Nutrition item = TestingMocks.CreatenutritionItems();
		Request validicResponse = client.AddNutrition(response.getUser().getId(),item);
		
		TestingMocks.SetFilterStartDataInThePast();
		
		//Check that users's record got pushed
		GetRequest getResponse = client.GetNutrition(response.getUser().getId());
		assertTrue(getResponse.getNutrition().size() > 0);
		
		//Delete the record
		Request deletedRespoonse = client.DeleteNutrition(response.getUser().getId(),validicResponse.getNutrition().getId());
		assertTrue(deletedRespoonse.getCode() == 200);
		assertTrue(deletedRespoonse.getMessage().equals("Ok"));
		
		//Check that users's record is actually gone
		getResponse = client.GetNutrition(response.getUser().getId());
		assertTrue(getResponse.getNutrition().size() == 0);
	}
	@Test
	public void DeleteSleepTest() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		
		Sleep item = TestingMocks.CreateSleepItems();
		Request validicResponse = client.AddSleep(response.getUser().getId(),item);
		
		TestingMocks.SetFilterStartDataInThePast();
		
		//Check that users's record got pushed
		GetRequest getResponse = client.GetSleep(response.getUser().getId());
		assertTrue(getResponse.getSleep().size() > 0);
		
		//Delete the record
		Request deletedRespoonse = client.DeleteSleep(response.getUser().getId(),validicResponse.getSleep().getId());
		assertTrue(deletedRespoonse.getCode() == 200);
		assertTrue(deletedRespoonse.getMessage().equals("Ok"));
		
		//Check that users's record is actually gone
		getResponse = client.GetSleep(response.getUser().getId());
		assertTrue(getResponse.getSleep().size() == 0);
	}
	@Test
	public void DeleteWeightTest() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		
		Weight item = TestingMocks.CreateWeightItem();
		Request validicResponse = client.AddWeight(response.getUser().getId(),item);
		
		TestingMocks.SetFilterStartDataInThePast();
		
		//Check that users's record got pushed
		GetRequest getResponse = client.GetWeight(response.getUser().getId());
		assertTrue(getResponse.getWeight().size() > 0);
		
		//Delete the record
		Request deletedRespoonse = client.DeleteWeight(response.getUser().getId(),validicResponse.getWeight().getId());
		assertTrue(deletedRespoonse.getCode() == 200);
		assertTrue(deletedRespoonse.getMessage().equals("Ok"));
		
		//Check that users's record is actually gone
		getResponse = client.GetWeight(response.getUser().getId());
		assertTrue(getResponse.getWeight().size() == 0);
	}
	@Test
	public void DeleteDiabetesTest() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		
		Diabetes item = TestingMocks.CreateDiabetesItems();
		Request validicResponse = client.AddDiabetes(response.getUser().getId(),item);
		
		TestingMocks.SetFilterStartDataInThePast();
		
		//Check that users's record got pushed
		GetRequest getResponse = client.GetDiabetes(response.getUser().getId());
		assertTrue(getResponse.getDiabetes().size() > 0);
		
		//Delete the record
		Request deletedRespoonse = client.DeleteDiabetes(response.getUser().getId(),validicResponse.getDiabetes().getId());
		assertTrue(deletedRespoonse.getCode() == 200);
		assertTrue(deletedRespoonse.getMessage().equals("Ok"));
		
		//Check that users's record is actually gone
		getResponse = client.GetDiabetes(response.getUser().getId());
		assertTrue(getResponse.getDiabetes().size() == 0);
	}
	@Test
	public void DeleteBiometricTest() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		
		Biometric item = TestingMocks.CreateBiometricsItems();
		Request validicResponse = client.AddBiometrics(response.getUser().getId(),item);
		
		TestingMocks.SetFilterStartDataInThePast();
		
		//Check that users's record got pushed
		GetRequest getResponse = client.GetBiometrics(response.getUser().getId());
		assertTrue(getResponse.getBiometrics().size() > 0);
		
		//Delete the record
		Request deletedRespoonse = client.DeleteBiometric(response.getUser().getId(),validicResponse.getBiometrics().getId());
		assertTrue(deletedRespoonse.getCode() == 200);
		assertTrue(deletedRespoonse.getMessage().equals("Ok"));
		
		//Check that users's record is actually gone
		getResponse = client.GetBiometrics(response.getUser().getId());
		assertTrue(getResponse.getBiometrics().size() == 0);
	}
	@Test
	public void DeleteTobaccoCessationTest() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		
		TobaccoCessation item = TestingMocks.CreateTobaccoItems();
		Request validicResponse = client.AddTobacco(response.getUser().getId(),item);
		
		TestingMocks.SetFilterStartDataInThePast();
		
		//Check that users's record got pushed
		GetRequest getResponse = client.GetTobaccoCessation(response.getUser().getId());
		assertTrue(getResponse.getTobaccoCessation().size() > 0);
		
		//Delete the record
		Request deletedRespoonse = client.DeleteTobaccoCessation(response.getUser().getId(),validicResponse.getTobaccoCessation().getId());
		assertTrue(deletedRespoonse.getCode() == 200);
		assertTrue(deletedRespoonse.getMessage().equals("Ok"));
		
		//Check that users's record is actually gone
		getResponse = client.GetTobaccoCessation(response.getUser().getId());
		assertTrue(getResponse.getTobaccoCessation().size() == 0);
	}
}
