package src.main.validic.core;

import retrofit.http.*;

import java.util.Map;

public interface INutrition {
	@GET("/organizations/{OrgId}/users/{UserId}/nutrition.json")
    GetRequest nutrition(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken
    );
	
	@GET("/organizations/{OrgId}/users/{UserId}/nutrition.json")
    GetRequest nutrition(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Query("access_token") String AccessToken,
        @QueryMap Map<String, String> filters
    );
	
	@DELETE("/organizations/{OrgId}/users/{UserId}/nutrition/{ActivityId}.json")
    Request nutritionDelete(
            @Path("OrgId") String OrgId,
            @Path("UserId") String UserId,
            @Path("ActivityId") String ActivityId,
            @Query("access_token") String AccessToken
    );
	
	@PUT("/organizations/{OrgId}/users/{UserId}/nutrition/{ActivityId}.json")
    Request nutritionUpdate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Path("ActivityId") String ActivityId,
        @Query("access_token") String AccessToken,
        @Body() Request Body
    );
	
	@POST("/organizations/{OrgId}/users/{UserId}/nutrition.json")
    Request nutritionCreate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Body() Request Body
    );
}
