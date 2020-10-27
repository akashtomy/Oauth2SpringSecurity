package com.example.oauthsecurity.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * The type Response dto.
 *
 * @author Akash Thomas
 */
@Data
@Builder
public class ResponseDto implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The Status code.
     */
    private Integer statusCode;

    /**
     * The Is error.
     */
    private Boolean isError;

    /**
     * The Message.
     */
    private String message;

    /**
     * The Error message.
     */
    private Object errorMessage;

    /**
     * The Data.
     */
    private Object data;

}
