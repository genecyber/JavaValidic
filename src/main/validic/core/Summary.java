
package main.validic.core;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"status",
"message",
"results",
"start_date",
"end_date",
"offset",
"limit",
"previous",
"next",
"params"
})
public class Summary {
	
	@JsonProperty("status")
	private long status;
	@JsonProperty("message")
	private String message;
	@JsonProperty("results")
	private long results;
	@JsonProperty("start_date")
	private String startDate;
	@JsonProperty("end_date")
	private String endDate;
	@JsonProperty("offset")
	private long offset;
	@JsonProperty("limit")
	private Object limit;
	@JsonProperty("previous")
	private Object previous;
	@JsonProperty("next")
	private String next;
	@JsonProperty("params")
	private Params params;
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("status")
public long getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(long status) {
this.status = status;
}

public Summary withStatus(long status) {
this.status = status;
return this;
}

@JsonProperty("message")
public String getMessage() {
return message;
}

@JsonProperty("message")
public void setMessage(String message) {
this.message = message;
}

public Summary withMessage(String message) {
this.message = message;
return this;
}

@JsonProperty("results")
public long getResults() {
return results;
}

@JsonProperty("results")
public void setResults(long results) {
this.results = results;
}

public Summary withResults(long results) {
this.results = results;
return this;
}

@JsonProperty("start_date")
public String getStartDate() {
return startDate;
}

@JsonProperty("start_date")
public void setStartDate(String startDate) {
this.startDate = startDate;
}

public Summary withStartDate(String startDate) {
this.startDate = startDate;
return this;
}

@JsonProperty("end_date")
public String getEndDate() {
return endDate;
}

@JsonProperty("end_date")
public void setEndDate(String endDate) {
this.endDate = endDate;
}

public Summary withEndDate(String endDate) {
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

public Summary withOffset(long offset) {
this.offset = offset;
return this;
}

@JsonProperty("limit")
public Object getLimit() {
return limit;
}

@JsonProperty("limit")
public void setLimit(Object limit) {
this.limit = limit;
}

public Summary withLimit(Object limit) {
this.limit = limit;
return this;
}

@JsonProperty("previous")
public Object getPrevious() {
return previous;
}

@JsonProperty("previous")
public void setPrevious(Object previous) {
this.previous = previous;
}

public Summary withPrevious(Object previous) {
this.previous = previous;
return this;
}

@JsonProperty("next")
public String getNext() {
return next;
}

@JsonProperty("next")
public void setNext(String next) {
this.next = next;
}

public Summary withNext(String next) {
this.next = next;
return this;
}

@JsonProperty("params")
public Params getParams() {
return params;
}

@JsonProperty("params")
public void setParams(Params params) {
this.params = params;
}

public Summary withParams(Params params) {
this.params = params;
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

public Summary withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}