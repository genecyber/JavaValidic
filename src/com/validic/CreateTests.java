package com.validic;

import static org.junit.Assert.*;

import com.validic.core.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CreateTests {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ValidicClient client = new ValidicClient();
		client.DeleteAllUsers();		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		ValidicClient client = new ValidicClient();
		client.DeleteAllUsers();
	}

	@Test
	public void RequestObjectTest() {
		Request request = TestHelper.CreateUserRequest("foo","123");
		assertTrue(request.getAccessToken() == "foo");
		assertTrue(request.getUser().getUid() == "123");
	}
	
	@Test
	public void AddUserTest() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("add");
		assertNotNull(response);
		assertTrue(response.getCode() == 201);		
	}
	
	@Test
	public void AddProfile() { 
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("profile");
		Request profileResponse = new Request();
		
		Profile profile = new Profile();
		profile.setBirthYear("1980");
		profile.setId(response.getUser().getId());
		profile.setUid(response.getUser().getUid());
		
		profileResponse = client.AddProfile(profile, response.getUser().getAccessToken());
		
		assertNotNull(profileResponse);		
		assertTrue(response.getCode() == 201);		
	}
	
	@Test
	public void AddFitness() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("fitness1");
		Fitness fitness = TestingMocks.CreateFitnessItems();
		
		Request validicResponse = client.AddFitness(response.getUser().getId(),fitness);
		assertNotNull(validicResponse);
	}	
	
	@Test
	public void AddRoutine() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		Routine item = TestingMocks.CreateRoutineItems();
		
		Request validicResponse = client.AddRoutine(response.getUser().getId(),item);
		assertNotNull(validicResponse);
	}

	@Test
	public void AddNutrition() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		Nutrition item = TestingMocks.CreatenutritionItems();
		
		Request validicResponse = client.AddNutrition(response.getUser().getId(),item);
		assertNotNull(validicResponse);
	}
	
	@Test
	public void AddSleep() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		Sleep item = TestingMocks.CreateSleepItems();
		
		Request validicResponse = client.AddSleep(response.getUser().getId(),item);
		assertNotNull(validicResponse);
	}
	
	@Test
	public void AddWeight() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		Weight item = TestingMocks.CreateWeightItem();
		
		Request validicResponse = client.AddWeight(response.getUser().getId(),item);
		assertNotNull(validicResponse);
		assertNotNull(validicResponse.getWeight());
	}
	
	@Test
	public void AddDiabetes() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		Diabetes item = TestingMocks.CreateDiabetesItems();
		
		Request validicResponse = client.AddDiabetes(response.getUser().getId(),item);
		assertNotNull(validicResponse);
	}
	
	@Test
	public void AddBiometrics() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		Biometric item = TestingMocks.CreateBiometricsItems();
		
		Request validicResponse = client.AddBiometrics(response.getUser().getId(),item);
		assertNotNull(validicResponse);
	}
	
	@Test
	public void AddTobacco() {
		ValidicClient client = new ValidicClient();
		Request response = client.AddUser("activity");
		TobaccoCessation item = TestingMocks.CreateTobaccoItems();
		
		Request validicResponse = client.AddTobacco(response.getUser().getId(),item);
		assertNotNull(validicResponse);
	}

}
