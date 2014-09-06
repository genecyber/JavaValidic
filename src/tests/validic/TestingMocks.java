package tests.validic;

import main.validic.Filters;
import main.validic.core.*;

class TestingMocks {
	
	//Populate
	private static Fitness PopulateFitness(String id) {
		Fitness fitness = new Fitness();
		fitness.setTimestamp("2013-03-10T07:12:16+00:00");
		fitness.setUtcOffset("-05:00");
		fitness.setType("Running");
		fitness.setActivityId(id);
		return fitness;
	}
	
	
	private static Routine PopulateRoutine(String id) {
		Routine item = new Routine();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		return item;
	}
	
	private static Nutrition PopulateNutrition(String id) {
		Nutrition item = new Nutrition();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		return item;
	}
	
	private static Sleep PopulateSleep(String id) {
		Sleep item = new Sleep();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		return item;
	}
	
	private static Weight PopulateWeight(String id) {
		Weight item = new Weight();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		return item;
	}
	
	private static Diabetes PopulateDiabetes(String id) {
		Diabetes item = new Diabetes();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		return item;
	}
	
	private static Biometric PopulateBiometric(String id) {
		Biometric  item = new Biometric();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		return item;
	}
	
	private static TobaccoCessation PopulateTobacco(String id) {
		TobaccoCessation  item = new TobaccoCessation();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		item.setLastSmoked("2013-03-10T07:12:16+00:00");
		return item;
	}
	
	//List
	public static Fitness CreateFitnessItems() {
		return TestingMocks.PopulateFitness("0001");
	}
	

	public static TobaccoCessation CreateTobaccoItems() {		
		return TestingMocks.PopulateTobacco("0001");
	}	
	
	
	public static Biometric CreateBiometricsItems() {		
		return TestingMocks.PopulateBiometric("0001");
	}
	
	
	public static Diabetes CreateDiabetesItems() {
		return TestingMocks.PopulateDiabetes("0001");
	}
	
	public static Weight CreateWeightItem() {		
		return TestingMocks.PopulateWeight("0001");
	}
	
		public static Sleep CreateSleepItems() {
		return TestingMocks.PopulateSleep("0001");
	}
	
	
	public static Nutrition CreatenutritionItems() {
		return TestingMocks.PopulateNutrition("0001");
	}
	
	
	public static Routine CreateRoutineItems() {
		return TestingMocks.PopulateRoutine("0001");
	}
	
	static void SetFilterStartDataInThePast() {
		Filters filters = new Filters();
		filters.setStartDate("2013-03-09T07:12:16+00:00");
		filters.UserFilters(true);
	}
	
}
