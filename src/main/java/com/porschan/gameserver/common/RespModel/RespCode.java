package com.porschan.gameserver.common.RespModel;

/**
 * Copyright@znt
 * Author:proschan
 * Date:2018/4/8
 * Description:
 */
public enum RespCode {

    CODE_SUCCESS(200, "请求成功"),
    CODE_WARN(500, "网络异常，请稍后重试");

    private Integer code;
    private String msg;

    RespCode(Integer code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
