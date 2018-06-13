package com.porschan.gameserver.web;

import com.porschan.gameserver.common.RespModel.RespEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.porschan.gameserver.common.RespModel.RespCode.CODE_SUCCESS;
import static com.porschan.gameserver.common.RespModel.RespState.STATE_SUCCESS;
import static com.porschan.gameserver.common.utils.TimeUtils.gainTimeStr;

/**
 * Copyright@znt
 * Author:proschan
 * Date:2018/3/24
 * Description:
 */
@RestController
@RequestMapping(value="/game-bin/utils")
public class UtilsController {

    @ApiOperation(value="获取系统时间", notes="应该是获取系统时间")
    @RequestMapping(value={"/gainSysTime"}, method= RequestMethod.GET)
    public RespEntity gainSysTime(){
        System.out.println(gainTimeStr());
        return new RespEntity(STATE_SUCCESS.getCode(), CODE_SUCCESS.getCode(),CODE_SUCCESS.getMsg(), gainTimeStr());
    }

    @RequestMapping(value={"/gainDBData"}, method= RequestMethod.GET)
    public RespEntity gainDBData(){
        System.out.println(gainTimeStr());
        return new RespEntity(STATE_SUCCESS.getCode(), CODE_SUCCESS.getCode(),CODE_SUCCESS.getMsg(), gainTimeStr());
    }

}
