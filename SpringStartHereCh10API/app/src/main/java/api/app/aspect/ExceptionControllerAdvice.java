package api.app.aspect;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorDetails> exceptionMessage() {
//        var errorDetails = new ErrorDetails();
//        errorDetails.message = "There was an error";
//        return ResponseEntity
//                .badRequest()
//                .body(errorDetails);
//    }
}

