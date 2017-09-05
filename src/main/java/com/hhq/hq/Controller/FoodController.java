package com.hhq.hq.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api(tags = "Food列表",description = "获取食物列表")
public class FoodController {

    @RequestMapping(value = "/food",method = RequestMethod.GET)
    @ApiOperation(value = "获取食物列表", notes = "json数据")
    @ResponseBody
    public Map food(@ApiParam(name = "name",value = "") String name){
        Map map = new HashMap();
        map.put("name","xiao");
        return map;
    }
}
