
package main.validic.core;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "_id",
    "timestamp",
    "utc_offset",
    "weight",
    "height",
    "free_mass",
    "fat_percent",
    "mass_weight",
    "bmi",
    "source",
    "source_name",
    "last_updated",
    "activity_id"
})
public class Weight {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("utc_offset")
    private String utcOffset;
    @JsonProperty("weight")
    private double weight;
    @JsonProperty("height")
    private double height;
    @JsonProperty("free_mass")
    private double freeMass;
    @JsonProperty("fat_percent")
    private double fatPercent;
    @JsonProperty("mass_weight")
    private double massWeight;
    @JsonProperty("bmi")
    private double bmi;
    @JsonProperty("source")
    private String source;
    @JsonProperty("source_name")
    private String sourceName;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("activity_id")
    private String activity_id;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("weight")
    public double getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @JsonProperty("height")
    public double getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(double height) {
        this.height = height;
    }

    @JsonProperty("free_mass")
    public double getFreeMass() {
        return freeMass;
    }

    @JsonProperty("free_mass")
    public void setFreeMass(double freeMass) {
        this.freeMass = freeMass;
    }

    @JsonProperty("fat_percent")
    public double getFatPercent() {
        return fatPercent;
    }

    @JsonProperty("fat_percent")
    public void setFatPercent(double fatPercent) {
        this.fatPercent = fatPercent;
    }

    @JsonProperty("mass_weight")
    public double getMassWeight() {
        return massWeight;
    }

    @JsonProperty("mass_weight")
    public void setMassWeight(double massWeight) {
        this.massWeight = massWeight;
    }

    @JsonProperty("bmi")
    public double getBmi() {
        return bmi;
    }

    @JsonProperty("bmi")
    public void setBmi(double bmi) {
        this.bmi = bmi;
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
