package main.validic.core;

import retrofit.http.*;

import java.util.Map;

public interface IRoutine {
	@GET("/organizations/{OrgId}/users/{UserId}/routine.json")
    GetRequest routine(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken
    );
	
	@GET("/organizations/{OrgId}/users/{UserId}/routine.json")
    GetRequest routine(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken,
        @QueryMap Map<String, String> filters
    );
	
	@DELETE("/organizations/{OrgId}/users/{UserId}/routine/{ActivityId}.json")
    Request routineDelete(
            @Path("OrgId") String OrgId,
            @Path("UserId") String UserId,
            @Path("ActivityId") String ActivityId,
            @Query("access_token") String AccessToken
    );
	
	@PUT("/organizations/{OrgId}/users/{UserId}/routine/{ActivityId}.json")
    Request routineUpdate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Path("ActivityId") String ActivityId,
        @Query("access_token") String AccessToken,
        @Body() Request Body
    );
	
	@POST("/organizations/{OrgId}/users/{UserId}/routine.json")
    Request routineCreate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Body() Request Body
    );
}
