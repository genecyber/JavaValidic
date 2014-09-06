package main.validic.core;

import retrofit.http.*;

public interface IUsers {
	@GET("/organizations/{OrgId}/users.json")
    GetRequest users(
        @Path("OrgId") String OrgId,
        @Query("access_token") String AccessToken
    );
	
	@DELETE("/organizations/{OrgId}/users/{UserId}.json")
    Request userDelete(
        @Path("OrgId") String OrgId,
        @Path("UserId")  String UserId,
        @Query("access_token") String AccessToken
    );
	
	@DELETE("/organizations/{OrgId}/users.json")
    Request userDeleteByUid(
        @Path("OrgId") String OrgId,
        @Query("uid")  String Uid,
        @Query("access_token") String AccessToken
    );
	
	@PUT("/organizations/{OrgId}/users/{UserId}.json")
    Request userUpdate(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Body() Request User
    );
	
	@PUT("/organizations/{OrgId}/users/{UserId}.json")
    Request userSuspend(
        @Path("OrgId") String OrgId,
        @Path("UserId") String UserId,
        @Body() Request Body
    );
	
	@POST("/organizations/{OrgId}/users.json")
    Request userCreate(
        @Path("OrgId") String OrgId,
        @Body() Request User
    );

	@GET("/organizations/{OrgId}/users/{UserId}/refresh_token.json")
	Request refresh_token(
		@Path("OrgId") String OrgId,
		@Path("UserId")  String UserId,
		@Query("access_token") String AccessToken
	);
}
