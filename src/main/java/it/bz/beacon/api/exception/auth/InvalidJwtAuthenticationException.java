package it.bz.beacon.api.exception.auth;

import io.jsonwebtoken.io.IOException;

public class InvalidJwtAuthenticationException extends IOException {
    public InvalidJwtAuthenticationException(String e) {
        super(e);
    }
}