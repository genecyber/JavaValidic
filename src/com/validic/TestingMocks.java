package com.validic;

import com.validic.core.Biometric;
import com.validic.core.Diabetes;
import com.validic.core.Fitness;
import com.validic.core.Nutrition;
import com.validic.core.Routine;
import com.validic.core.Sleep;
import com.validic.core.TobaccoCessation;
import com.validic.core.Weight;

public class TestingMocks {
	
	//Populate
	public static Fitness PopulateFitness(String id) {
		Fitness fitness = new Fitness();
		fitness.setTimestamp("2013-03-10T07:12:16+00:00");
		fitness.setUtcOffset("-05:00");
		fitness.setType("Running");
		fitness.setActivityId(id);
		return fitness;
	}
	
	
	public static Routine PopulateRoutine (String id) {
		Routine item = new Routine();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		return item;
	}
	
	public static Nutrition PopulateNutrition(String id) {
		Nutrition item = new Nutrition();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		return item;
	}
	
	public static Sleep PopulateSleep(String id) {
		Sleep item = new Sleep();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		return item;
	}
	
	public static Weight PopulateWeight(String id) {
		Weight item = new Weight();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		return item;
	}
	
	public static Diabetes PopulateDiabetes(String id) {
		Diabetes item = new Diabetes();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		return item;
	}
	
	public static Biometric PopulateBiometric(String id) {
		Biometric  item = new Biometric();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		return item;
	}
	
	public static TobaccoCessation PopulateTobacco(String id) {
		TobaccoCessation  item = new TobaccoCessation();
		item.setTimestamp("2013-03-10T07:12:16+00:00");
		item.setUtcOffset("-05:00");
		item.setActivityId(id);
		item.setLastSmoked("2013-03-10T07:12:16+00:00");
		return item;
	}
	
	//List
	public static Fitness CreateFitnessItems() {
		Fitness fitness = TestingMocks.PopulateFitness("0001");			
		return fitness;
	}
	

	public static TobaccoCessation CreateTobaccoItems() {		
		TobaccoCessation item = TestingMocks.PopulateTobacco("0001");
		return item;
	}	
	
	
	public static Biometric CreateBiometricsItems() {		
		Biometric item = TestingMocks.PopulateBiometric("0001");	
		return item;
	}
	
	
	public static Diabetes CreateDiabetesItems() {
		Diabetes item = TestingMocks.PopulateDiabetes("0001");	
		return item;
	}
	
	public static Weight CreateWeightItem() {		
		Weight item = TestingMocks.PopulateWeight("0001");	
		return item;
	}
	
		public static Sleep CreateSleepItems() {
		Sleep item = TestingMocks.PopulateSleep("0001");
		return item;
	}
	
	
	public static Nutrition CreatenutritionItems() {
		Nutrition item = TestingMocks.PopulateNutrition("0001");	
		return item;
	}
	
	
	public static Routine CreateRoutineItems() {
		Routine item = TestingMocks.PopulateRoutine("0001");
		return item;
	}
	
	static void SetFilterStartDataInThePast() {
		Filters filters = new Filters();
		filters.setStartDate("2013-03-09T07:12:16+00:00");
		filters.UserFilters(true);
	}
	
}
