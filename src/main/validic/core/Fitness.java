
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
    "type",
    "intensity",
    "start_time",
    "distance",
    "duration",
    "calories",
    "source",
    "source_name",
    "last_updated",
    "activity_id"
})
public class Fitness {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("utc_offset")
    private String utcOffset;
    @JsonProperty("type")
    private String type;
    @JsonProperty("intensity")
    private String intensity;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("distance")
    private long distance;
    @JsonProperty("duration")
    private long duration;
    @JsonProperty("calories")
    private long calories;
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

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("intensity")
    public String getIntensity() {
        return intensity;
    }

    @JsonProperty("intensity")
    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    @JsonProperty("start_time")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("start_time")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("distance")
    public long getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(long distance) {
        this.distance = distance;
    }

    @JsonProperty("duration")
    public long getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(long duration) {
        this.duration = duration;
    }

    @JsonProperty("calories")
    public long getCalories() {
        return calories;
    }

    @JsonProperty("calories")
    public void setCalories(long calories) {
        this.calories = calories;
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
