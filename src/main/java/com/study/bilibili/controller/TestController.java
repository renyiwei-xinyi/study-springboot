package com.study.bilibili.controller;


import com.study.bilibili.api.TestService;
import com.study.bilibili.entity.UserInfo;
import com.study.bilibili.handler.exception.MyRuntiomeException;
import com.study.bilibili.vo.Result;
import com.study.bilibili.vo.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试模块")
public class TestController {


    @Autowired
    private TestService testService;

    @GetMapping("/test")
    @ApiOperation("测试接口")
    @ApiModelProperty
    public Result test(){

        String test =  testService.test();
        if(!StringUtils.isEmpty(test)){
            return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("data", test);
        }
        return Result.error().codeAndMessage(ResultInfo.NOT_FOUND);
    }

    @GetMapping("/exception")
    @ApiOperation("异常接口")
    @ApiModelProperty
    public Result test2(){
        throw new MyRuntiomeException("111", "自定义异常");
    }

    @GetMapping("/mysql")
    @ApiOperation("数据库查询接口")
    @ApiModelProperty
    public Result test3(){
        UserInfo userInfoById = testService.getUserById(1);
        return Result.success().data(userInfoById.getClass().getSimpleName(), userInfoById);
    }
}
