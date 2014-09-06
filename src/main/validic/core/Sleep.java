
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
    "awake",
    "deep",
    "light",
    "rem",
    "times_woken",
    "total_sleep",
    "source",
    "source_name",
    "last_updated",
    "activity_id"
})
public class Sleep {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("utc_offset")
    private String utcOffset;
    @JsonProperty("awake")
    private long awake;
    @JsonProperty("deep")
    private long deep;
    @JsonProperty("light")
    private long light;
    @JsonProperty("rem")
    private long rem;
    @JsonProperty("times_woken")
    private long timesWoken;
    @JsonProperty("total_sleep")
    private long totalSleep;
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

    @JsonProperty("awake")
    public long getAwake() {
        return awake;
    }

    @JsonProperty("awake")
    public void setAwake(long awake) {
        this.awake = awake;
    }

    @JsonProperty("deep")
    public long getDeep() {
        return deep;
    }

    @JsonProperty("deep")
    public void setDeep(long deep) {
        this.deep = deep;
    }

    @JsonProperty("light")
    public long getLight() {
        return light;
    }

    @JsonProperty("light")
    public void setLight(long light) {
        this.light = light;
    }

    @JsonProperty("rem")
    public long getRem() {
        return rem;
    }

    @JsonProperty("rem")
    public void setRem(long rem) {
        this.rem = rem;
    }

    @JsonProperty("times_woken")
    public long getTimesWoken() {
        return timesWoken;
    }

    @JsonProperty("times_woken")
    public void setTimesWoken(long timesWoken) {
        this.timesWoken = timesWoken;
    }

    @JsonProperty("total_sleep")
    public long getTotalSleep() {
        return totalSleep;
    }

    @JsonProperty("total_sleep")
    public void setTotalSleep(long totalSleep) {
        this.totalSleep = totalSleep;
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
