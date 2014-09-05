package com.validic.core;

import retrofit.http.*;

public interface IProfile {
	@GET("/profile.json")
    GetRequest profile(
        @Query("authentication_token") String AccessToken
    );
	
	@POST("/profile.json")
    Request profileCreate(        
        @Body() Request Body
    );
}
