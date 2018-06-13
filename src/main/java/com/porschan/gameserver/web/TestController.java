package com.porschan.gameserver.web;

import com.porschan.gameserver.model.GSUser;
import com.porschan.gameserver.dao.GSUserMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Copyright@znt
 * Author:proschan
 * Date:2018/4/4
 * Description:
 */

@RestController
@RequestMapping(value="/game-test")
public class TestController {

    @Autowired
    private GSUserMapper gsUserMapper;

    @ApiOperation(value="测试接口", notes="")
    @RequestMapping(value={"/{msg}"}, method= RequestMethod.GET)
    public String gainPwd(@PathVariable String msg){

//        Long userid = 1L;
//
//        GSUser gsUser = gsUserMapper.selectByPrimaryKey(userid);
//        System.out.println(gsUser.getUsername());

        GSUser gsUser = gsUserMapper.selectByPrimaryKey(1L);
        System.out.println(gsUser.getUserid());
        System.out.println(gsUser.getUsername());
        System.out.println(gsUser.getUserpassword());
        System.out.println(gsUser.getUserphone());

        gsUserMapper.deleteByPrimaryKey(Long.valueOf(msg));

        LocalDate localDate = LocalDate.now();
        return localDate.toString() + "msg:" + msg;
    }

}
