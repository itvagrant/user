package com.example.user.dao;

import com.example.user.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDaoNewMapper {

    @Results(id="resultMap1", value={
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "updateTime", column = "update_time")
    }
    )
    @Select("select * from user where id= #{id};")
    User getUserById(@Param("id") long id);

    @ResultMap("resultMap1")
    @Select("select * from user;")
    List<User> findAll();
}
