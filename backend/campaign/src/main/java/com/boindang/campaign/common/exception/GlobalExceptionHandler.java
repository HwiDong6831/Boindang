package com.boindang.campaign.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.boindang.campaign.common.response.ApiResponses;
import com.boindang.campaign.common.response.ErrorResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CampaignException.class)
    public ApiResponses<?> handleCampaignException(Exception e) {
        return ApiResponses.error(new ErrorResponse(HttpStatus.CONFLICT, e.getMessage()));
    }

    @ExceptionHandler(BadRequestException.class)
    public ApiResponses<?> handleBadRequestException(Exception e) {
        return ApiResponses.error(new ErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage()));
    }

    @ExceptionHandler(CampaignNotFoundException.class)
    public ApiResponses<?> handleCampaignNotFoundException(Exception e) {
        return ApiResponses.error(new ErrorResponse(HttpStatus.NOT_FOUND, e.getMessage()));
    }

    @ExceptionHandler(UserException.class)
    public ApiResponses<?> handleUserException(Exception e) {
        return ApiResponses.error(new ErrorResponse(HttpStatus.UNAUTHORIZED, e.getMessage()));
    }

    @ExceptionHandler(KafkaException.class)
    public ApiResponses<?> handleKafkaException(Exception e) {
        return ApiResponses.error(new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage()));
    }

    // 기타 예외 처리
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponses<String>> handleAllExceptions(Exception e) {
        log.info(e.getMessage());
        log.info(e.toString());
        return ResponseEntity.ok(
            ApiResponses.error(new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage())));
    }
}
