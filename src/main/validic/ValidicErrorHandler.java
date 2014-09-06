package main.validic;

import retrofit.ErrorHandler;
import retrofit.RetrofitError;

class ValidicErrorHandler implements ErrorHandler {
	   
	@Override 
	   public Throwable handleError(RetrofitError cause) {
		     /*Response r = cause.getResponse();		*/     
		       return new ValidicObjectException(cause);
		   }
		 }
