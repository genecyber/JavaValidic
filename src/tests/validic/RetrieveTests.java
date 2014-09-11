package src.tests.validic;

import com.fasterxml.jackson.databind.ObjectMapper;
import src.main.validic.*;
import src.main.validic.core.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class RetrieveTests {
	
	private static String _userId;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ValidicClient client = new ValidicClient();
		client.DeleteAllUsers();
		client.AddUser("get");
		List<User> users = client.GetUsers().getUsers();
		_userId = users.get(0).getId();		
	}

    @Test
	public void modelTest() {
		GetRequest newEnv = new GetRequest();
		assertNotNull(newEnv);
	}
	
	@Test
	public void envelopeObjectTest() {
		User newUser = new User();
		GetRequest newEnv = new GetRequest();
		assertNotNull(newEnv);
		assertFalse(newEnv.getUser() == newUser);
		newEnv.setUser(newUser);
		assertTrue(newEnv.getUser() == newUser);
	}
	
	@Test
	public void jsonTest() throws IOException {
		String json = "{\"_id\": \"51552cd7fded0807c4000017\",\"uid\": \"123467890\",\"access_token\": \"d18397e3845e8b66f7453dc55ea3fc445d1b879a6f96ebe7b243badabce08c98\"}";
		User user = new ObjectMapper().readValue(json, User.class);
		assertEquals(user.getUid(),"123467890");
	}
	
	@Test
	public void jsonEnvelopeTest() throws IOException {
		String json = "{\"code\": 201,\"message\": \"Ok\",\"user\": {  \"_id\": \"51552cd7fded0807c4000017\",  \"uid\": \"123467890\",  \"access_token\": \"d18397e3845e8b66f7453dc55ea3fc445d1b879a6f96ebe7b243badabce08c98\",  \"profile\": null}}";
		GetRequest envelope = new ObjectMapper().readValue(json, GetRequest.class);		
		assertEquals(envelope.getUser().getUid(),"123467890");
	}
	
	@Test
	public void ClientTest() {
		ValidicClient client = new ValidicClient();
		GetRequest e = client.GetUsers();
		assertNotNull(e.getUsers());
	}
	
	@Test
	public void OrganizationTest() {
		ValidicClient client = new ValidicClient();
		GetRequest e = client.GetOrganizationInfo();
		assertNotNull(e.getOrganization());
	}
	
	@Test
	public void BiometricsTest() {
		ValidicClient client = new ValidicClient();
		GetRequest e = client.GetBiometrics(_userId);
		assertNotNull(e.getBiometrics());
	}
	
	
	@Test
	public void DiabetesTest() {
		ValidicClient client = new ValidicClient();
		GetRequest e = client.GetDiabetes(_userId);
		assertNotNull(e.getDiabetes());
	}
	
	@Test
	public void FitnessTest() {
		ValidicClient client = new ValidicClient();
		GetRequest req = client.GetFitness(_userId);
		assertNotNull(req.getFitness());
	}
	
	@Test
	public void NutritionTest() {
		ValidicClient client = new ValidicClient();
		GetRequest e = client.GetNutrition(_userId);
		assertNotNull(e.getNutrition());
	}
	
	@Test
	public void ProfileTest() {
		ValidicClient client = new ValidicClient();
		Request tokenEnvelope = client.GetAuthenticationToken(_userId);
		GetRequest profileEnvelope = client.GetProfile(tokenEnvelope.getUser().getAuthenticationToken());
		assertNotNull(profileEnvelope.getProfile());
	}	
	
	@Test
	public void RoutineTest() {
		ValidicClient client = new ValidicClient();
		GetRequest e = client.GetRoutine(_userId);
		assertNotNull(e.getRoutine());
	}	
	
	@Test
	public void SleepTest() {
		ValidicClient client = new ValidicClient();
		GetRequest e = client.GetSleep(_userId);
		assertNotNull(e.getSleep());
	}	
	
	@Test
	public void TobaccoCessationTest() {
		ValidicClient client = new ValidicClient();
		GetRequest e = client.GetTobaccoCessation(_userId);
		assertNotNull(e.getTobaccoCessation());
	}	
	
	@Test
	public void UsersTest() {
		ValidicClient client = new ValidicClient();
		GetRequest e = client.GetUsers();
		assertNotNull(e.getUsers());
	}	
	
	@Test
	public void WeightTest() {
		ValidicClient client = new ValidicClient();
		GetRequest e = client.GetWeight(_userId);
		assertNotNull(e.getWeight());
	}
}
