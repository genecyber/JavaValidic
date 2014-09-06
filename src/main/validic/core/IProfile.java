package main.validic.core;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

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
