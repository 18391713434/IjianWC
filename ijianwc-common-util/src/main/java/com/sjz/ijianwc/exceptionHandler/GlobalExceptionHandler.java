package com.sjz.ijianwc.exceptionHandler;


import com.sjz.ijianwc.exception.IJianException;
import com.sjz.ijianwc.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 全局异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail().message("全局异常").code(2001);
    }

    /**
     * 特定异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Result error(ArithmeticException e){
        e.printStackTrace();
        return Result.fail().message("数学异常").code(2001);
    }
    /**
     * 自定义异常处理
     */
    @ExceptionHandler(IJianException.class)
    @ResponseBody
    public Result error(IJianException e){
        e.printStackTrace();
        return Result.fail().message(e.getMessage()).code(e.getCode());
    }



}
