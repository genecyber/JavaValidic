package src.main.validic.core;

import retrofit.http.*;

import java.util.Map;

public interface ITobaccoCessation {
	@GET("/organizations/{OrgId}/users/{UserId}/tobacco_cessation.json")
    GetRequest tobacco_cessation(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken
    );
	
	@GET("/organizations/{OrgId}/users/{UserId}/tobacco_cessation.json")
    GetRequest tobacco_cessation(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken,
        @QueryMap Map<String, String> filters
    );
	
	@DELETE("/organizations/{OrgId}/users/{UserId}/tobacco_cessation/{ActivityId}.json")
    Request tobacco_cessationDelete(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Path("ActivityId") String ActivityId,
        @Query("access_token") String AccessToken
    );
	
	@PUT("/organizations/{OrgId}/users/{UserId}/tobacco_cessation/{ActivityId}.json")
    Request tobacco_cessationUpdate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Path("ActivityId") String ActivityId,
        @Query("access_token") String AccessToken,
        @Body() Request Body
    );
	
	@POST("/organizations/{OrgId}/users/{UserId}/tobacco_cessation.json")
    Request tobacco_cessationCreate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Body() Request Body
    );
}
