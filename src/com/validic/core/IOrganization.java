package com.validic.core;

import retrofit.http.*;
import retrofit.http.Path;
import retrofit.http.Query;

public interface IOrganization {
	@GET("/organizations/{OrgId}.json")
    GetRequest organization(
        @Path("OrgId") String OrgId,
        @Query("access_token") String AccessToken
    );
	
	@DELETE("/organizations/{OrgId}.json")
    GetRequest organizationDelete(
        @Path("OrgId") String OrgId,
        @Query("access_token") String AccessToken
    );
	
	@PUT("/organizations/{OrgId}.json")
    GetRequest organizationUpdate(
        @Path("OrgId") String OrgId,
        @Query("access_token") String AccessToken
    );
	
	@POST("/organizations/{OrgId}.json")
    GetRequest organizationCreate(
        @Path("OrgId") String OrgId,
        @Query("access_token") String AccessToken
    );
}
