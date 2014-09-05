package com.validic;

import retrofit.ErrorHandler;
import retrofit.RetrofitError;

public class ValidicErrorHandler implements ErrorHandler {
	   
	@Override 
	   public Throwable handleError(RetrofitError cause) {
		     /*Response r = cause.getResponse();		*/     
		       return new ValidicObjectException(cause);
		   }
		 }
