package com.irfanharuka.kotlinspringrest.controller

import com.irfanharuka.kotlinspringrest.model.WebResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class ErrorController {

    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHandler(constraintViolationException: ConstraintViolationException): WebResponse<String> {
        return WebResponse(
                code = 400,
                status = "Bad Request",
                data = constraintViolationException.message ?: "Something went wrong"
        )
    }
}