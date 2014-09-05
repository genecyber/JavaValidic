
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
    "c_peptide",
    "fasting_plasma_glucose_test",
    "hba1c",
    "insulin",
    "oral_glucose_tolerance_test",
    "random_plasma_glucose_test",
    "triglyceride",
    "blood_glucose",
    "source",
    "source_name",
    "last_updated",
    "activity_id"
})
public class Diabetes {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("utc_offset")
    private String utcOffset;
    @JsonProperty("c_peptide")
    private double cPeptide;
    @JsonProperty("fasting_plasma_glucose_test")
    private long fastingPlasmaGlucoseTest;
    @JsonProperty("hba1c")
    private double hba1c;
    @JsonProperty("insulin")
    private long insulin;
    @JsonProperty("oral_glucose_tolerance_test")
    private long oralGlucoseToleranceTest;
    @JsonProperty("random_plasma_glucose_test")
    private long randomPlasmaGlucoseTest;
    @JsonProperty("triglyceride")
    private long triglyceride;
    @JsonProperty("blood_glucose")
    private long bloodGlucose;
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

    @JsonProperty("c_peptide")
    public double getCPeptide() {
        return cPeptide;
    }

    @JsonProperty("c_peptide")
    public void setCPeptide(double cPeptide) {
        this.cPeptide = cPeptide;
    }

    @JsonProperty("fasting_plasma_glucose_test")
    public long getFastingPlasmaGlucoseTest() {
        return fastingPlasmaGlucoseTest;
    }

    @JsonProperty("fasting_plasma_glucose_test")
    public void setFastingPlasmaGlucoseTest(long fastingPlasmaGlucoseTest) {
        this.fastingPlasmaGlucoseTest = fastingPlasmaGlucoseTest;
    }

    @JsonProperty("hba1c")
    public double getHba1c() {
        return hba1c;
    }

    @JsonProperty("hba1c")
    public void setHba1c(double hba1c) {
        this.hba1c = hba1c;
    }

    @JsonProperty("insulin")
    public long getInsulin() {
        return insulin;
    }

    @JsonProperty("insulin")
    public void setInsulin(long insulin) {
        this.insulin = insulin;
    }

    @JsonProperty("oral_glucose_tolerance_test")
    public long getOralGlucoseToleranceTest() {
        return oralGlucoseToleranceTest;
    }

    @JsonProperty("oral_glucose_tolerance_test")
    public void setOralGlucoseToleranceTest(long oralGlucoseToleranceTest) {
        this.oralGlucoseToleranceTest = oralGlucoseToleranceTest;
    }

    @JsonProperty("random_plasma_glucose_test")
    public long getRandomPlasmaGlucoseTest() {
        return randomPlasmaGlucoseTest;
    }

    @JsonProperty("random_plasma_glucose_test")
    public void setRandomPlasmaGlucoseTest(long randomPlasmaGlucoseTest) {
        this.randomPlasmaGlucoseTest = randomPlasmaGlucoseTest;
    }

    @JsonProperty("triglyceride")
    public long getTriglyceride() {
        return triglyceride;
    }

    @JsonProperty("triglyceride")
    public void setTriglyceride(long triglyceride) {
        this.triglyceride = triglyceride;
    }

    @JsonProperty("blood_glucose")
    public long getBloodGlucose() {
        return bloodGlucose;
    }

    @JsonProperty("blood_glucose")
    public void setBloodGlucose(long bloodGlucose) {
        this.bloodGlucose = bloodGlucose;
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
