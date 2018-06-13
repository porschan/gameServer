package com.porschan.gameserver.common.RespModel;

/**
 * Copyright@znt
 * Author:proschan
 * Date:2018/4/8
 * Description:
 */
public enum RespState {

    STATE_SUCCESS(true,"成功"),STATE_FAIL(false,"失败");

    private Boolean code;
    private String msg;

    RespState(Boolean code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Boolean getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
