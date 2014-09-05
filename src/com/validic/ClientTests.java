package com.validic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.validic.Filters.ExpandedFilter;
import com.validic.Filters.StatusFilter;

public class ClientTests {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {		
	}

	@Test
	public void FilterEmptyMapTest() throws SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException {
		Filters filter = new Filters();
		ImmutableMap<String,String> map = filter.GetFilterMap();
		assertTrue(map.values().size() == 0);
		
	}
	
	@Test
	public void FilterNonEmptyMapTest() throws SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException {
		Filters filter = new Filters();
		filter.setStartDate("foo");
		ImmutableMap<String,String> map = filter.GetFilterMap();
		assertNotNull(map.values());
		assertTrue(map.values().size() == 1);
		assertTrue(map.containsKey("start_date"));
		assertTrue(map.containsValue("foo"));
	}
	
	@Test
	public void FilterEnumTest() {
		assertTrue(StatusFilter.active.toString().equals("active"));
		assertTrue(ExpandedFilter.yes.toString().equals("1"));
		assertTrue(ExpandedFilter.no.toString().equals("0"));
	}
}
