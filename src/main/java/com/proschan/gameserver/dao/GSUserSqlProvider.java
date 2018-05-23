package com.proschan.gameserver.dao;

import com.proschan.gameserver.model.GSUser;
import org.apache.ibatis.jdbc.SQL;

public class GSUserSqlProvider {

    public String insertSelective(GSUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("gs_user");
        
        if (record.getUserid() != null) {
            sql.VALUES("userID", "#{userid,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("userName", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getUserpassword() != null) {
            sql.VALUES("userPassword", "#{userpassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserphone() != null) {
            sql.VALUES("userPhone", "#{userphone,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(GSUser record) {
        SQL sql = new SQL();
        sql.UPDATE("gs_user");
        
        if (record.getUsername() != null) {
            sql.SET("userName = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getUserpassword() != null) {
            sql.SET("userPassword = #{userpassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserphone() != null) {
            sql.SET("userPhone = #{userphone,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("userID = #{userid,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}