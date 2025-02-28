package com.crs.exception;

import com.crs.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

//Catch block
@ControllerAdvice
public class HandleException {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> globalExceptiom(
            Exception e,
            WebRequest request
    ){
        ErrorDetails errorDetails = new ErrorDetails(

                e.getMessage(),
                new Date(),
                request.getDescription(true)
                );

        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR) ;
    }

}
