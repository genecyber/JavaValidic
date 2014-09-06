package tests.validic;

import com.google.common.collect.ImmutableMap;
import main.validic.Filters;
import main.validic.Filters.ExpandedFilter;
import main.validic.Filters.StatusFilter;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ClientTests {

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
