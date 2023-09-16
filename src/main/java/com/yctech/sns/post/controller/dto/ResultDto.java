package com.yctech.sns.post.controller.dto;

public record ResultDto<T>(
        int code,
        String message,
        T data
) {

}