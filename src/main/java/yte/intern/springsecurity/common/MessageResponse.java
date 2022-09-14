package yte.intern.springsecurity.common;


public record MessageResponse(
        String message,
        ResultType resultType
) {
}
