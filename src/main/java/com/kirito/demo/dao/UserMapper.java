package com.kirito.demo.dao;

import com.kirito.demo.entity.UserDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by ccy
 * 2018/6/24 10:14
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<UserDO> getUsers();

    @Select("SELECT * FROM user WHERE username=#{param1} and password=#{param2}")
    UserDO findUser(String username, String password);

    @Insert("INSERT INTO user(username,password) VALUES (#{username},#{password})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void addUser(UserDO user);

    @Update("UPDATE user SET username = #{username},password=#{password} WHERE id = #{id}")
    void updateUser(UserDO user);


}
