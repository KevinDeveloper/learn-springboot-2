package com.kevin.springboottwo.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {


    @ApiOperation(value = "接口，测试全局异常", notes = "简单接口描述 number必填", code = 200, produces = "application/x-www-form-urlencoded")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "number", value = "我是第一个参数", required = true, dataType = "String")
    })
    @RequestMapping(value = "/test1/{number}")
    public String index(@PathVariable int number){
        System.out.println(20 / number);
        return "get index page successfully.";
    }

    @ApiOperation(value = "测试接口1", notes = "简单接口描述 number必填", code = 200, produces = "application/x-www-form-urlencoded")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "number1", value = "我是第一个参数", required = true, dataType = "String"),
            @ApiImplicitParam(name = "number2", value = "我是第一个参数", required = true, dataType = "String")
    })
    @RequestMapping(value = "/test2/{number}", method = RequestMethod.GET)
    public String index2(@PathVariable int number1, @PathVariable int number2){
        System.out.println(20 / number1);
        return "get index page successfully.";
    }

}
