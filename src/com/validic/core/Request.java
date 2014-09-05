
package com.validic.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.lang.builder.ToStringBuilder;

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
    "errors",
    "suspend"
})
public class Request {
	public Request() {}
    @JsonProperty("summary")
    private Summary summary;
    @JsonProperty("diabetes")
    private Diabetes diabetes = new Diabetes();
    @JsonProperty("biometrics")
    private Biometric biometrics = new Biometric();
    @JsonProperty("fitness")
    private Fitness fitness = new Fitness();
    @JsonProperty("weight")
    private Weight weight = new Weight();
    @JsonProperty("nutrition")
    private Nutrition nutrition = new Nutrition();
    @JsonProperty("routine")
    private Routine routine = new Routine();
    @JsonProperty("sleep")
    private Sleep sleep = new Sleep();
    @JsonProperty("tobacco_cessation")
    private TobaccoCessation tobaccoCessation = new TobaccoCessation();
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
    @JsonProperty("access_token")
    private String access_token;    
    @JsonProperty("authentication_token")
    private String authentication_token;
    @JsonProperty("suspend")
    private String suspend;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonIgnore
    public String getAsJSON() {
        ObjectMapper mapper = new ObjectMapper();
        try {
			return mapper.writeValueAsString(this) ;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "{\"Error\"}";
		} 
    }
    
    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }
    

    @JsonProperty("weight")
    public Weight getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @JsonProperty("diabetes")
    public Diabetes getDiabetes() {
        return diabetes;
    }

    @JsonProperty("diabetes")
    public void setDiabetes(Diabetes diabetes) {
        this.diabetes = diabetes;
    }
    
    @JsonProperty("biometrics")
    public Biometric getBiometrics() {
        return biometrics;
    }

    @JsonProperty("biometrics")
    public void setBiometrics(Biometric biometrics) {
        this.biometrics = biometrics;
    }
    
    @JsonProperty("fitness")
    public Fitness getFitness() {
        return fitness;
    }

    @JsonProperty("fitness")
    public void setFitness(Fitness fitness) {
        this.fitness = fitness;
    }

    @JsonProperty("nutrition")
    public Nutrition getNutrition() {
        return nutrition;
    }

    @JsonProperty("nutrition")
    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }    

    @JsonProperty("routine")
    public Routine getRoutine() {
        return routine;
    }

    @JsonProperty("routine")
    public void setRoutine(Routine routine) {
        this.routine = routine;
    }
    
    @JsonProperty("sleep")
    public Sleep getSleep() {
        return sleep;
    }

    @JsonProperty("sleep")
    public void setSleep(Sleep sleep) {
        this.sleep = sleep;
    }    

    @JsonProperty("tobacco_cessation")
    public TobaccoCessation getTobaccoCessation() {
        return tobaccoCessation;
    }

    @JsonProperty("tobacco_cessation")
    public void setTobaccoCessation(TobaccoCessation tobaccoCessation) {
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


    @JsonProperty("access_token")
    public String getAccessToken() {
        return access_token;
    }

    @JsonProperty("access_token")
    public void setAccessToken(String access_token) {
        this.access_token = access_token;
    }
    
    @JsonProperty("authentication_token")
    public String getAuthenticationToken() {
        return authentication_token;
    }

    @JsonProperty("authentication_token")
    public void setAuthenticationToken(String authentication_token) {
        this.authentication_token = authentication_token;
    }
    
    
    @JsonProperty("suspend")
    public String getSuspend() {
        return suspend;
    }

    @JsonProperty("suspend")
    public void setSuspend(String suspend) {
        this.suspend = suspend;
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
