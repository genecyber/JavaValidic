package com.validic.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
		"_id",
		"name",
		"users",
		"users_provisioned",
		"activities",
		"connections",
		"organizations"
	})
public class Organization {
	@JsonProperty("_id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("users")
	private long users;
	@JsonProperty("users_provisioned")
	private long usersProvisioned;
	@JsonProperty("activities")
	private long activities;
	@JsonProperty("connections")
	private long connections;
	@JsonProperty("organizations")
	private List<Organization> organizations = new ArrayList<Organization>();
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
	
	public Organization withId(String id) {
	this.id = id;
	return this;
	}
	
	@JsonProperty("name")
	public String getName() {
	return name;
	}
	
	@JsonProperty("name")
	public void setName(String name) {
	this.name = name;
	}
	
	public Organization withName(String name) {
	this.name = name;
	return this;
	}
	
	@JsonProperty("users")
	public long getUsers() {
	return users;
	}
	
	@JsonProperty("users")
	public void setUsers(long users) {
	this.users = users;
	}
	
	public Organization withUsers(long users) {
	this.users = users;
	return this;
	}
	
	@JsonProperty("users_provisioned")
	public long getUsersProvisioned() {
	return usersProvisioned;
	}
	
	@JsonProperty("users_provisioned")
	public void setUsersProvisioned(long usersProvisioned) {
	this.usersProvisioned = usersProvisioned;
	}
	
	public Organization withUsersProvisioned(long usersProvisioned) {
	this.usersProvisioned = usersProvisioned;
	return this;
	}
	
	@JsonProperty("activities")
	public long getActivities() {
	return activities;
	}
	
	@JsonProperty("activities")
	public void setActivities(long activities) {
	this.activities = activities;
	}
	
	public Organization withActivities(long activities) {
	this.activities = activities;
	return this;
	}
	
	@JsonProperty("connections")
	public long getConnections() {
	return connections;
	}
	
	@JsonProperty("connections")
	public void setConnections(long connections) {
	this.connections = connections;
	}
	
	public Organization withConnections(long connections) {
	this.connections = connections;
	return this;
	}
	
	@JsonProperty("organizations")
	public List<Organization> getOrganizations() {
	return organizations;
	}
	
	@JsonProperty("organizations")
	public void setOrganizations(List<Organization> organizations) {
	this.organizations = organizations;
	}
	
	public Organization withOrganizations(List<Organization> organizations) {
	this.organizations = organizations;
	return this;
	}
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}
	
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
	
	public Organization withAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	return this;
}

}