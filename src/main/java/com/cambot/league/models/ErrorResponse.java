package com.cambot.league.models;

import lombok.Data;

@Data
public class ErrorResponse {
    private int errorCode;
    private String message = "An error has occurred. Please try again later.";
}
