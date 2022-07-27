package br.com.meli.springdata01.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExceptionDetails {

    private String title;
    private String message;
    private LocalDateTime timestamp;

}
