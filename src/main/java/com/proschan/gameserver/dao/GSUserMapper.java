package com.proschan.gameserver.dao;

import com.proschan.gameserver.model.GSUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface GSUserMapper {
    @Delete({
        "delete from gs_user",
        "where userID = #{userid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userid);

    @Insert({
        "insert into gs_user (userID, userName, ",
        "userPassword, userPhone)",
        "values (#{userid,jdbcType=BIGINT}, #{username,jdbcType=VARCHAR}, ",
        "#{userpassword,jdbcType=VARCHAR}, #{userphone,jdbcType=VARCHAR})"
    })
    int insert(GSUser record);

    @InsertProvider(type=GSUserSqlProvider.class, method="insertSelective")
    int insertSelective(GSUser record);

    @Select({
        "select",
        "userID, userName, userPassword, userPhone",
        "from gs_user",
        "where userID = #{userid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="userID", property="userid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="userName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="userPassword", property="userpassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="userPhone", property="userphone", jdbcType=JdbcType.VARCHAR)
    })
    GSUser selectByPrimaryKey(Long userid);

    @UpdateProvider(type=GSUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GSUser record);

    @Update({
        "update gs_user",
        "set userName = #{username,jdbcType=VARCHAR},",
          "userPassword = #{userpassword,jdbcType=VARCHAR},",
          "userPhone = #{userphone,jdbcType=VARCHAR}",
        "where userID = #{userid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GSUser record);
}