package main.validic.core;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"start_date",
"end_date",
"offset",
"limit"
})
public class Params {

	@JsonProperty("start_date")
	private Object startDate;
	@JsonProperty("end_date")
	private Object endDate;
	@JsonProperty("offset")
	private long offset;
	@JsonProperty("limit")
	private long limit;
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonProperty("start_date")
	public Object getStartDate() {
	return startDate;
	}
	
	@JsonProperty("start_date")
	public void setStartDate(Object startDate) {
	this.startDate = startDate;
	}
	
	public Params withStartDate(Object startDate) {
	this.startDate = startDate;
	return this;
	}
	
	@JsonProperty("end_date")
	public Object getEndDate() {
	return endDate;
	}
	
	@JsonProperty("end_date")
	public void setEndDate(Object endDate) {
	this.endDate = endDate;
	}
	
	public Params withEndDate(Object endDate) {
	this.endDate = endDate;
	return this;
	}
	
	@JsonProperty("offset")
	public long getOffset() {
	return offset;
	}
	
	@JsonProperty("offset")
	public void setOffset(long offset) {
	this.offset = offset;
	}
	
	public Params withOffset(long offset) {
	this.offset = offset;
	return this;
	}
	
	@JsonProperty("limit")
	public long getLimit() {
	return limit;
	}
	
	@JsonProperty("limit")
	public void setLimit(long limit) {
	this.limit = limit;
	}
	
	public Params withLimit(long limit) {
	this.limit = limit;
	return this;
	}
	
	@Override
	public String toString() {
	return ToStringBuilder.reflectionToString(this);
	}
	
	@Override
	public int hashCode() {
	return HashCodeBuilder.reflectionHashCode(this);
	}
	
	@Override
	public boolean equals(Object other) {
	return EqualsBuilder.reflectionEquals(this, other);
	}
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}
	
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
	
	public Params withAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	return this;
	}

}