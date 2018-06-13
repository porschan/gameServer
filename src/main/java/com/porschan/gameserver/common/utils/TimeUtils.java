package com.porschan.gameserver.common.utils;

import java.time.LocalDate;

/**
 * Copyright@znt
 * Author:proschan
 * Date:2018/4/8
 * Description:
 * 时间工具类
 */
public class TimeUtils {

    //获取当前时间的字符串
    public static String gainTimeStr(){
        return LocalDate.now().toString();
    }
}
