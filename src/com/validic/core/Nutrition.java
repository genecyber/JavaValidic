
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
    "calories",
    "carbohydrates",
    "fat",
    "fiber",
    "protein",
    "sodium",
    "water",
    "meal",
    "source",
    "source_name",
    "last_updated",
    "activity_id"
})
public class Nutrition {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("utc_offset")
    private String utcOffset;
    @JsonProperty("calories")
    private long calories;
    @JsonProperty("carbohydrates")
    private long carbohydrates;
    @JsonProperty("fat")
    private long fat;
    @JsonProperty("fiber")
    private long fiber;
    @JsonProperty("protein")
    private long protein;
    @JsonProperty("sodium")
    private long sodium;
    @JsonProperty("water")
    private long water;
    @JsonProperty("meal")
    private String meal;
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

    @JsonProperty("calories")
    public long getCalories() {
        return calories;
    }

    @JsonProperty("calories")
    public void setCalories(long calories) {
        this.calories = calories;
    }

    @JsonProperty("carbohydrates")
    public long getCarbohydrates() {
        return carbohydrates;
    }

    @JsonProperty("carbohydrates")
    public void setCarbohydrates(long carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    @JsonProperty("fat")
    public long getFat() {
        return fat;
    }

    @JsonProperty("fat")
    public void setFat(long fat) {
        this.fat = fat;
    }

    @JsonProperty("fiber")
    public long getFiber() {
        return fiber;
    }

    @JsonProperty("fiber")
    public void setFiber(long fiber) {
        this.fiber = fiber;
    }

    @JsonProperty("protein")
    public long getProtein() {
        return protein;
    }

    @JsonProperty("protein")
    public void setProtein(long protein) {
        this.protein = protein;
    }

    @JsonProperty("sodium")
    public long getSodium() {
        return sodium;
    }

    @JsonProperty("sodium")
    public void setSodium(long sodium) {
        this.sodium = sodium;
    }

    @JsonProperty("water")
    public long getWater() {
        return water;
    }

    @JsonProperty("water")
    public void setWater(long water) {
        this.water = water;
    }

    @JsonProperty("meal")
    public String getMeal() {
        return meal;
    }

    @JsonProperty("meal")
    public void setMeal(String meal) {
        this.meal = meal;
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
