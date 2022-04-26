package net.xdclass.online.exception;

import net.xdclass.online.utils.JsonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @program: online
 * @description: 异常
 * @packagename: net.xdclass.online.exception
 * @author: 姚泽宇
 * @date: 2022-04-26 16:39
 **/
@ControllerAdvice

public class CustomExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public JsonData handle(Exception e) {
        logger.error("[系统异常]{}",e);
        if (e instanceof XDException) {
            XDException xdException = (XDException) e;
            return JsonData.buildError(xdException.getCode(), xdException.getMessage());
        } else {
            return JsonData.buildError("全局异常未知错误");
        }
    }
}
