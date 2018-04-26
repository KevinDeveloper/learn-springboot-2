package com.kevin.springboottwo;

import com.kevin.springboottwo.bean.ApiResult;
import com.kevin.springboottwo.bean.ApiResultGenerator;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: RestExceptionHandler
 * @Description:
 * @Auther: Kevin
 * @Date: 2018/4/16 16:31
 */
@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class RestExceptionHandler {
    /**
     * 默认统一异常处理方法
     * @param e 默认Exception异常对象
     * @return
     */
    @ExceptionHandler
    @ResponseStatus
    public ApiResult runtimeExceptionHandler(Exception e) {
        return ApiResultGenerator.errorResult(e.getMessage(),e);
    }
}
