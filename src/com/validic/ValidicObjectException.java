package com.validic;

import com.validic.core.GetRequest;

import retrofit.RetrofitError;

public class ValidicObjectException extends Throwable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7086341493622923828L;
	
	GetRequest Response;
	
	public ValidicObjectException(RetrofitError cause) {
		Response = ((GetRequest)cause.getBody());
	}

	public ValidicObjectException() {
		// TODO Auto-generated constructor stub
	}	
}
