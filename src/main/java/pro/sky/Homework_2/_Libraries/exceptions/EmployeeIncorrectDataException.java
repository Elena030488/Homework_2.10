package pro.sky.Homework_2._Libraries.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeIncorrectDataException extends RuntimeException{
    public EmployeeIncorrectDataException(String message) {
        super(message);
    }
}