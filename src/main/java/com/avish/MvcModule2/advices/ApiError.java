package com.avish.MvcModule2.advices;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Builder
public class ApiError {
    public HttpStatus status;
    public String message;
    public List<String> subErrors;
}
