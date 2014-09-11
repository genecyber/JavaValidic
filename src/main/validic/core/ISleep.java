package src.main.validic.core;

import retrofit.http.*;

import java.util.Map;

public interface ISleep {
	@GET("/organizations/{OrgId}/users/{UserId}/sleep.json")
    GetRequest sleep(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken
    );
	
	@GET("/organizations/{OrgId}/users/{UserId}/sleep.json")
    GetRequest sleep(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken,
        @QueryMap Map<String, String> filters
    );
	
	@DELETE("/organizations/{OrgId}/users/{UserId}/sleep/{ActivityId}.json")
    Request sleepDelete(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Path("ActivityId") String ActivityId,
        @Query("access_token") String AccessToken
    );
	
	@PUT("/organizations/{OrgId}/users/{UserId}/sleep/{ActivityId}.json")
    Request sleepUpdate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Path("ActivityId") String ActivityId,
        @Query("access_token") String AccessToken,
        @Body() Request Body
    );
	
	@POST("/organizations/{OrgId}/users/{UserId}/sleep.json")
    Request sleepCreate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Body() Request Body
    );
}
