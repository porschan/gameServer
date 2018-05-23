package com.proschan.gameserver.common.RespModelTests;

import com.proschan.gameserver.common.RespModel.RespCode;
import org.junit.Test;

/**
 * Copyright@znt
 * Author:proschan
 * Date:2018/4/8
 * Description:
 * 学习并使用Emum
 */
public class RespCodeTests {

    @Test
    public void RespCodeTest(){
        System.out.println(RespCode.CODE_SUCCESS.getMsg());
        System.out.println(RespCode.CODE_SUCCESS.getCode());
    }

    @Test
    public void test1(){
        //输出某一枚举的值
        System.out.println( Color.RED.getName() );
        System.out.println( Color.RED.getIndex() );
    }
}

enum Color {

    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);


    private String name ;
    private int index ;

    private Color( String name , int index ){
        this.name = name ;
        this.index = index ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }


}