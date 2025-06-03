package net.javaguides.surveybackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResultsNotFoundException extends RuntimeException {

    public ResultsNotFoundException(String message) {
        super(message);
    }
}
