
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
    "blood_calcium",
    "blood_chromium",
    "blood_folic_acid",
    "blood_magnesium",
    "blood_potassium",
    "blood_sodium",
    "blood_vitamin_b12",
    "blood_zinc",
    "creatine_kinase",
    "crp",
    "diastolic",
    "ferritin",
    "hdl",
    "hscrp",
    "il6",
    "ldl",
    "resting_heartrate",
    "systolic",
    "testosterone",
    "total_cholesterol",
    "tsh",
    "uric_acid",
    "vitamin_d",
    "white_cell_count",
    "spo2",
    "temperature",
    "source",
    "source_name",
    "last_updated",
    "activity_id"
})
public class Biometric {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("utc_offset")
    private String utcOffset;
    @JsonProperty("blood_calcium")
    private double bloodCalcium;
    @JsonProperty("blood_chromium")
    private double bloodChromium;
    @JsonProperty("blood_folic_acid")
    private double bloodFolicAcid;
    @JsonProperty("blood_magnesium")
    private double bloodMagnesium;
    @JsonProperty("blood_potassium")
    private double bloodPotassium;
    @JsonProperty("blood_sodium")
    private double bloodSodium;
    @JsonProperty("blood_vitamin_b12")
    private long bloodVitaminB12;
    @JsonProperty("blood_zinc")
    private long bloodZinc;
    @JsonProperty("creatine_kinase")
    private long creatineKinase;
    @JsonProperty("crp")
    private long crp;
    @JsonProperty("diastolic")
    private long diastolic;
    @JsonProperty("ferritin")
    private long ferritin;
    @JsonProperty("hdl")
    private long hdl;
    @JsonProperty("hscrp")
    private double hscrp;
    @JsonProperty("il6")
    private double il6;
    @JsonProperty("ldl")
    private long ldl;
    @JsonProperty("resting_heartrate")
    private long restingHeartrate;
    @JsonProperty("systolic")
    private long systolic;
    @JsonProperty("testosterone")
    private long testosterone;
    @JsonProperty("total_cholesterol")
    private long totalCholesterol;
    @JsonProperty("tsh")
    private double tsh;
    @JsonProperty("uric_acid")
    private double uricAcid;
    @JsonProperty("vitamin_d")
    private double vitaminD;
    @JsonProperty("white_cell_count")
    private long whiteCellCount;
    @JsonProperty("spo2")
    private long spo2;
    @JsonProperty("temperature")
    private long temperature;
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

    @JsonProperty("blood_calcium")
    public double getBloodCalcium() {
        return bloodCalcium;
    }

    @JsonProperty("blood_calcium")
    public void setBloodCalcium(double bloodCalcium) {
        this.bloodCalcium = bloodCalcium;
    }

    @JsonProperty("blood_chromium")
    public double getBloodChromium() {
        return bloodChromium;
    }

    @JsonProperty("blood_chromium")
    public void setBloodChromium(double bloodChromium) {
        this.bloodChromium = bloodChromium;
    }

    @JsonProperty("blood_folic_acid")
    public double getBloodFolicAcid() {
        return bloodFolicAcid;
    }

    @JsonProperty("blood_folic_acid")
    public void setBloodFolicAcid(double bloodFolicAcid) {
        this.bloodFolicAcid = bloodFolicAcid;
    }

    @JsonProperty("blood_magnesium")
    public double getBloodMagnesium() {
        return bloodMagnesium;
    }

    @JsonProperty("blood_magnesium")
    public void setBloodMagnesium(double bloodMagnesium) {
        this.bloodMagnesium = bloodMagnesium;
    }

    @JsonProperty("blood_potassium")
    public double getBloodPotassium() {
        return bloodPotassium;
    }

    @JsonProperty("blood_potassium")
    public void setBloodPotassium(double bloodPotassium) {
        this.bloodPotassium = bloodPotassium;
    }

    @JsonProperty("blood_sodium")
    public double getBloodSodium() {
        return bloodSodium;
    }

    @JsonProperty("blood_sodium")
    public void setBloodSodium(double bloodSodium) {
        this.bloodSodium = bloodSodium;
    }

    @JsonProperty("blood_vitamin_b12")
    public long getBloodVitaminB12() {
        return bloodVitaminB12;
    }

    @JsonProperty("blood_vitamin_b12")
    public void setBloodVitaminB12(long bloodVitaminB12) {
        this.bloodVitaminB12 = bloodVitaminB12;
    }

    @JsonProperty("blood_zinc")
    public long getBloodZinc() {
        return bloodZinc;
    }

    @JsonProperty("blood_zinc")
    public void setBloodZinc(long bloodZinc) {
        this.bloodZinc = bloodZinc;
    }

    @JsonProperty("creatine_kinase")
    public long getCreatineKinase() {
        return creatineKinase;
    }

    @JsonProperty("creatine_kinase")
    public void setCreatineKinase(long creatineKinase) {
        this.creatineKinase = creatineKinase;
    }

    @JsonProperty("crp")
    public long getCrp() {
        return crp;
    }

    @JsonProperty("crp")
    public void setCrp(long crp) {
        this.crp = crp;
    }

    @JsonProperty("diastolic")
    public long getDiastolic() {
        return diastolic;
    }

    @JsonProperty("diastolic")
    public void setDiastolic(long diastolic) {
        this.diastolic = diastolic;
    }

    @JsonProperty("ferritin")
    public long getFerritin() {
        return ferritin;
    }

    @JsonProperty("ferritin")
    public void setFerritin(long ferritin) {
        this.ferritin = ferritin;
    }

    @JsonProperty("hdl")
    public long getHdl() {
        return hdl;
    }

    @JsonProperty("hdl")
    public void setHdl(long hdl) {
        this.hdl = hdl;
    }

    @JsonProperty("hscrp")
    public double getHscrp() {
        return hscrp;
    }

    @JsonProperty("hscrp")
    public void setHscrp(double hscrp) {
        this.hscrp = hscrp;
    }

    @JsonProperty("il6")
    public double getIl6() {
        return il6;
    }

    @JsonProperty("il6")
    public void setIl6(double il6) {
        this.il6 = il6;
    }

    @JsonProperty("ldl")
    public long getLdl() {
        return ldl;
    }

    @JsonProperty("ldl")
    public void setLdl(long ldl) {
        this.ldl = ldl;
    }

    @JsonProperty("resting_heartrate")
    public long getRestingHeartrate() {
        return restingHeartrate;
    }

    @JsonProperty("resting_heartrate")
    public void setRestingHeartrate(long restingHeartrate) {
        this.restingHeartrate = restingHeartrate;
    }

    @JsonProperty("systolic")
    public long getSystolic() {
        return systolic;
    }

    @JsonProperty("systolic")
    public void setSystolic(long systolic) {
        this.systolic = systolic;
    }

    @JsonProperty("testosterone")
    public long getTestosterone() {
        return testosterone;
    }

    @JsonProperty("testosterone")
    public void setTestosterone(long testosterone) {
        this.testosterone = testosterone;
    }

    @JsonProperty("total_cholesterol")
    public long getTotalCholesterol() {
        return totalCholesterol;
    }

    @JsonProperty("total_cholesterol")
    public void setTotalCholesterol(long totalCholesterol) {
        this.totalCholesterol = totalCholesterol;
    }

    @JsonProperty("tsh")
    public double getTsh() {
        return tsh;
    }

    @JsonProperty("tsh")
    public void setTsh(double tsh) {
        this.tsh = tsh;
    }

    @JsonProperty("uric_acid")
    public double getUricAcid() {
        return uricAcid;
    }

    @JsonProperty("uric_acid")
    public void setUricAcid(double uricAcid) {
        this.uricAcid = uricAcid;
    }

    @JsonProperty("vitamin_d")
    public double getVitaminD() {
        return vitaminD;
    }

    @JsonProperty("vitamin_d")
    public void setVitaminD(double vitaminD) {
        this.vitaminD = vitaminD;
    }

    @JsonProperty("white_cell_count")
    public long getWhiteCellCount() {
        return whiteCellCount;
    }

    @JsonProperty("white_cell_count")
    public void setWhiteCellCount(long whiteCellCount) {
        this.whiteCellCount = whiteCellCount;
    }

    @JsonProperty("spo2")
    public long getSpo2() {
        return spo2;
    }

    @JsonProperty("spo2")
    public void setSpo2(long spo2) {
        this.spo2 = spo2;
    }

    @JsonProperty("temperature")
    public long getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(long temperature) {
        this.temperature = temperature;
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
