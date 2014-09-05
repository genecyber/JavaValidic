
package com.validic.core;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "_id",
    "timestamp",
    "utc_offset",
    "cigarettes_allowed",
    "cigarettes_smoked",
    "cravings",
    "last_smoked",
    "source",
    "source_name",
    "last_updated",
    "activity_id"
})
public class TobaccoCessation {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("utc_offset")
    private String utcOffset;
    @JsonProperty("cigarettes_allowed")
    private long cigarettesAllowed;
    @JsonProperty("cigarettes_smoked")
    private long cigarettesSmoked;
    @JsonProperty("cravings")
    private long cravings;
    @JsonProperty("last_smoked")
    private String lastSmoked;
    @JsonProperty("source")
    private String source;
    @JsonProperty("source_name")
    private String sourceName;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("activity_id")
    private String activity_id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("utc_offset")
    public String getUtcOffset() {
        return utcOffset;
    }

    @JsonProperty("utc_offset")
    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    @JsonProperty("cigarettes_allowed")
    public long getCigarettesAllowed() {
        return cigarettesAllowed;
    }

    @JsonProperty("cigarettes_allowed")
    public void setCigarettesAllowed(long cigarettesAllowed) {
        this.cigarettesAllowed = cigarettesAllowed;
    }

    @JsonProperty("cigarettes_smoked")
    public long getCigarettesSmoked() {
        return cigarettesSmoked;
    }

    @JsonProperty("cigarettes_smoked")
    public void setCigarettesSmoked(long cigarettesSmoked) {
        this.cigarettesSmoked = cigarettesSmoked;
    }

    @JsonProperty("cravings")
    public long getCravings() {
        return cravings;
    }

    @JsonProperty("cravings")
    public void setCravings(long cravings) {
        this.cravings = cravings;
    }

    @JsonProperty("last_smoked")
    public String getLastSmoked() {
        return lastSmoked;
    }

    @JsonProperty("last_smoked")
    public void setLastSmoked(String lastSmoked) {
        this.lastSmoked = lastSmoked;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("source_name")
    public String getSourceName() {
        return sourceName;
    }

    @JsonProperty("source_name")
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
    @JsonProperty("activity_id")
    public String getActivityId() {
        return activity_id;
    }

    @JsonProperty("activity_id")
    public void setActivityId(String activity_id) {
        this.activity_id = activity_id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
