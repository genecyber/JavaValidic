package com.validic;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.tuple.ImmutablePair;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"expanded",
"status",
"start_date",
"end_date",
"offset",
"limit"
})

public class Filters {

	@JsonProperty("expanded")
	public String expanded;
	@JsonProperty("status")
	public String status;
	@JsonProperty("start_date")
	public String startDate;
	@JsonProperty("end_date")
	public String endDate;
	@JsonProperty("offset")
	public Integer offset;
	@JsonProperty("limit")
	public String limit;
	@JsonIgnore
	public Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	//Statics to allow access from class to class
	public static ImmutableMap<String, String> FilterMap;
	public static boolean UseFilters;

	@JsonProperty("expanded")
	public String getExpanded() {
	return expanded;
	}

	@JsonProperty("expanded")
	public void setExpanded(String expanded) {
	this.expanded = expanded;
	}

	@JsonProperty("status")
	public String getStatus() {
	return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
	this.status = status;
	}

	@JsonProperty("start_date")
	public String getStartDate() {
	return startDate;
	}

	@JsonProperty("start_date")
	public void setStartDate(String startDate) {
	this.startDate = startDate;
	}

	@JsonProperty("end_date")
	public String getEndDate() {
	return endDate;
	}

	@JsonProperty("end_date")
	public void setEndDate(String endDate) {
	this.endDate = endDate;
	}

	@JsonProperty("offset")
	public Integer getOffset() {
	return offset;
	}

	@JsonProperty("offset")
	public void setOffset(Integer offset) {
	this.offset = offset;
	}

	@JsonProperty("limit")
	public String getLimit() {
	return limit;
	}

	@JsonProperty("limit")
	public void setLimit(String limit) {
	this.limit = limit;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
	
	public void UserFilters(boolean use) {
		UseFilters = use;
		if (use)
			FilterMap = GetFilterMap();
		else
			FilterMap = null;
	}
	
	public ImmutableMap<String, String> GetFilterMap(){
		Builder<String, String> myMapBuilder = ImmutableMap.<String, String>builder();
		
		Class<?> aClass = Filters.class;
		Field[] fields = aClass.getFields();
		
		for(Field field : fields) {
			ImmutablePair<String, String> pair = getPropertyPair(field.getName());
			if (pair != null && pair.getValue() != null && pair.getKey() != null && pair.getKey() != "")
				myMapBuilder.put(pair.getKey(),pair.getValue());
		}		
		return myMapBuilder.build();
	}
	
	private ImmutablePair<String, String> getPropertyPair(String fieldName) {
		Class<?> aClass = Filters.class;
		Field field = null;
		try {
			field = aClass.getField(fieldName);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Filters objectInstance = this;
		if (field.getType() != String.class)
			return null;
		String value = null;
		try {
			value = (String)field.get(objectInstance);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//JsonName
		JsonProperty jsonProperty = field.getAnnotation(JsonProperty.class);
		if (jsonProperty != null && jsonProperty.value() != null)
			return new ImmutablePair<String, String>(jsonProperty.value(), value);
		return new ImmutablePair<String, String>("", value);
	}
	
	public enum StatusFilter {
		all,
		active,
		inactive,
		provisioned,
		suspended;
		
		@Override
		public String toString() {
	        return name().charAt(0) + name().substring(1).toLowerCase();
	    }
	}
	
	public enum ExpandedFilter {
		yes,
		no;
		
		@Override
		public String toString() {
	        if (name() == "yes") return "1";
	        return "0";
	    }
	}
}
