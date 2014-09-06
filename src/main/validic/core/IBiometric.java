package main.validic.core;

import retrofit.http.*;

import java.util.Map;

public interface IBiometric {
	@GET("/organizations/{OrgId}/users/{UserId}/biometrics.json")
    GetRequest biometrics(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken
    );
	
	@GET("/organizations/{OrgId}/users/{UserId}/biometrics.json")
    GetRequest biometrics(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken,
        @QueryMap Map<String, String> filters
    );
	
	@DELETE("/organizations/{OrgId}/users/{UserId}/biometrics/{ActivityId}.json")
    Request biometricsDelete(
            @Path("OrgId") String OrgId,
            @Path("UserId") String UserId,
            @Path("ActivityId") String ActivityId,
            @Query("access_token") String AccessToken
    );
	
	@PUT("/organizations/{OrgId}/users/{UserId}/biometrics/{ActivityId}.json")
    Request biometricsUpdate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Path("ActivityId") String ActivityId,
        @Query("access_token") String AccessToken,
        @Body() Request Body
    );
	
	@POST("/organizations/{OrgId}/users/{UserId}/biometrics.json")
    Request biometricsCreate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Body() Request Body
    );
}
