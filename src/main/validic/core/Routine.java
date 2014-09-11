
package src.main.validic.core;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "_id",
    "timestamp",
    "utc_offset",
    "steps",
    "distance",
    "floors",
    "elevation",
    "calories_burned",
    "source",
    "source_name",
    "last_updated",
    "activity_id"
})
public class Routine {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("utc_offset")
    private String utcOffset;
    @JsonProperty("steps")
    private long steps;
    @JsonProperty("distance")
    private double distance;
    @JsonProperty("floors")
    private long floors;
    @JsonProperty("elevation")
    private double elevation;
    @JsonProperty("calories_burned")
    private long caloriesBurned;
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

    @JsonProperty("steps")
    public long getSteps() {
        return steps;
    }

    @JsonProperty("steps")
    public void setSteps(long steps) {
        this.steps = steps;
    }

    @JsonProperty("distance")
    public double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(double distance) {
        this.distance = distance;
    }

    @JsonProperty("floors")
    public long getFloors() {
        return floors;
    }

    @JsonProperty("floors")
    public void setFloors(long floors) {
        this.floors = floors;
    }

    @JsonProperty("elevation")
    public double getElevation() {
        return elevation;
    }

    @JsonProperty("elevation")
    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    @JsonProperty("calories_burned")
    public long getCaloriesBurned() {
        return caloriesBurned;
    }

    @JsonProperty("calories_burned")
    public void setCaloriesBurned(long caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
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
