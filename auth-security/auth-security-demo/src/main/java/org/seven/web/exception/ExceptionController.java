package org.seven.web.exception;

import org.seven.domain.ResultDto;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 全局异常捕获
 *
 * @author Seven.Lin
 * @date 2020/1/8 18:28
 */
@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = Exception.class)
    public ResultDto globalExceptionHandler(Exception e) {
        ArrayList<String> errors = new ArrayList<>();
        errors.add(e.getMessage());
        return new ResultDto("error", errors, new HashMap<String, Object>());
    }
}


