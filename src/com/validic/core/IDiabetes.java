package com.validic.core;

import java.util.Map;

import retrofit.http.*;

public interface IDiabetes {
	@GET("/organizations/{OrgId}/users/{UserId}/diabetes.json")
    GetRequest diabetes(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken
    );
	
	@GET("/organizations/{OrgId}/users/{UserId}/diabetes.json")
    GetRequest diabetes(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken,
        @QueryMap Map<String, String> filters
    );
	
	@DELETE("/organizations/{OrgId}/users/{UserId}/diabetes/{ActivityId}.json")
    Request diabetesDelete(
            @Path("OrgId") String OrgId,
            @Path("UserId") String UserId,
            @Path("ActivityId") String ActivityId,
            @Query("access_token") String AccessToken
    );
	
	@PUT("/organizations/{OrgId}/users/{UserId}/diabetes/{ActivityId}.json")
    Request diabetesUpdate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Path("ActivityId") String ActivityId,
        @Query("access_token") String AccessToken,
        @Body() Request Body
    );
	
	@POST("/organizations/{OrgId}/users/{UserId}/diabetes.json")
    Request diabetesCreate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Body() Request Body
    );
	
}
