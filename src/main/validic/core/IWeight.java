package src.main.validic.core;

import retrofit.http.*;

import java.util.Map;

public interface IWeight {
	@GET("/organizations/{OrgId}/users/{UserId}/weight.json")
    GetRequest weight(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken
    );
	
	@GET("/organizations/{OrgId}/users/{UserId}/weight.json")
    GetRequest weight(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken,
        @QueryMap Map<String, String> filters
    );
	
	@DELETE("/organizations/{OrgId}/users/{UserId}/weight/{ActivityId}.json")
    Request weightDelete(
            @Path("OrgId") String OrgId,
            @Path("UserId") String UserId,
            @Path("ActivityId") String ActivityId,
            @Query("access_token") String AccessToken
    );
	
	@PUT("/organizations/{OrgId}/users/{UserId}/weight/{ActivityId}.json")
    Request weightUpdate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Path("ActivityId") String ActivityId,
        @Query("access_token") String AccessToken,
        @Body() Request Body
    );
	
	@POST("/organizations/{OrgId}/users/{UserId}/weight.json")
    Request weightCreate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Body() Request Body
    );
}
