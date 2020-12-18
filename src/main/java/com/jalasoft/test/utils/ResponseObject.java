package com.jalasoft.test.utils;

/**
 * <h1>ResponseObject</h1>
 * <P>
 *     It has an structure to response request
 * </P>
 * @autor Santiago Cárdenas
 * @version 1.0
 * @since 12/2020
 */
public class ResponseObject<T> {
    private String status;
    private String message;
    private T body;

    public ResponseObject(T body) {
        this.body = body;
        this.message = ResponseConstants.SUCCESS_STATUS;
    }

    public ResponseObject(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseObject(T body,  String message, String status) {
        this.status = status;
        this.message = message;
        this.body = body;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
