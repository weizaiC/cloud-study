package com.cxw.exception;

public class CustomException extends Exception {

    private int code;

    public CustomException(int code) {
        this.code = code;
    }

    public CustomException(String message, int code) {
        super(message);
        this.code = code;
    }

    public CustomException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public CustomException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
