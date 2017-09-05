package com.hhq.hq.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@Api(tags = "Swagger演示",description = "获取用户列表接口")
public class SwaggerController {


    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    @ResponseBody
    public String  hello(){

        return "hello";
    }

}
