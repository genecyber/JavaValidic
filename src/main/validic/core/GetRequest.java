
package src.main.validic.core;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
	"summary",
	"diabetes",
	"tobacco_cessation",
	"sleep",
	"routine",
	"nutrition",
	"weight",
	"fitness",
	"biometrics",
    "code",
    "message",
    "user",
    "users",
    "errors"
})
public class GetRequest {
	public GetRequest() {}
    @JsonProperty("summary")
    private Summary summary;
    @JsonProperty("diabetes")
    private List<Diabetes> diabetes = new ArrayList<Diabetes>();
    @JsonProperty("biometrics")
    private List<Biometric> biometrics = new ArrayList<Biometric>();
    @JsonProperty("fitness")
    private List<Fitness> fitness = new ArrayList<Fitness>();
    @JsonProperty("weight")
    private List<Weight> weight = new ArrayList<Weight>();
    @JsonProperty("nutrition")
    private List<Nutrition> nutrition = new ArrayList<Nutrition>();
    @JsonProperty("routine")
    private List<Routine> routine = new ArrayList<Routine>();
    @JsonProperty("sleep")
    private List<Sleep> sleep = new ArrayList<Sleep>();
    @JsonProperty("tobacco_cessation")
    private List<TobaccoCessation> tobaccoCessation = new ArrayList<TobaccoCessation>();
    @JsonProperty("code")
    private long code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("errors")
    private String errors;
    @JsonProperty("user")
    private User user; 
    @JsonProperty("users")
    private List<User> users; 
    @JsonProperty("organization")
    private Organization organization;
    @JsonProperty("profile")
    private Profile profile;
    
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }
    

    @JsonProperty("weight")
    public List<Weight> getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(List<Weight> weight) {
        this.weight = weight;
    }

    @JsonProperty("diabetes")
    public List<Diabetes> getDiabetes() {
        return diabetes;
    }

    @JsonProperty("diabetes")
    public void setDiabetes(List<Diabetes> diabetes) {
        this.diabetes = diabetes;
    }
    
    @JsonProperty("biometrics")
    public List<Biometric> getBiometrics() {
        return biometrics;
    }

    @JsonProperty("biometrics")
    public void setBiometrics(List<Biometric> biometrics) {
        this.biometrics = biometrics;
    }
    
    @JsonProperty("fitness")
    public List<Fitness> getFitness() {
        return fitness;
    }

    @JsonProperty("fitness")
    public void setFitness(List<Fitness> fitness) {
        this.fitness = fitness;
    }

    @JsonProperty("nutrition")
    public List<Nutrition> getNutrition() {
        return nutrition;
    }

    @JsonProperty("nutrition")
    public void setNutrition(List<Nutrition> nutrition) {
        this.nutrition = nutrition;
    }    

    @JsonProperty("routine")
    public List<Routine> getRoutine() {
        return routine;
    }

    @JsonProperty("routine")
    public void setRoutine(List<Routine> routine) {
        this.routine = routine;
    }
    
    @JsonProperty("sleep")
    public List<Sleep> getSleep() {
        return sleep;
    }

    @JsonProperty("sleep")
    public void setSleep(List<Sleep> sleep) {
        this.sleep = sleep;
    }    

    @JsonProperty("tobacco_cessation")
    public List<TobaccoCessation> getTobaccoCessation() {
        return tobaccoCessation;
    }

    @JsonProperty("tobacco_cessation")
    public void setTobaccoCessation(List<TobaccoCessation> tobaccoCessation) {
        this.tobaccoCessation = tobaccoCessation;
    }
    
    @JsonProperty("organization")
    public Organization getOrganization() {
        return organization;
    }
    
    @JsonProperty("organization")
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    
    @JsonProperty("code")
    public long getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(long code) {
        this.code = code;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }
    

    @JsonProperty("errors")
    public String getErrors() {
        return errors;
    }

    @JsonProperty("errors")
    public void setErrors(String errors) {
        this.errors = errors;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }
    
    @JsonProperty("users")
    public List<User> getUsers() {
        return users;
    }

    @JsonProperty("users")
    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    @JsonProperty("profile")
    public Profile getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(Profile profile) {
        this.profile = profile;
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
