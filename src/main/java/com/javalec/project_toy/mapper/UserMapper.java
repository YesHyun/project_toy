package com.javalec.project_toy.mapper;

import com.javalec.project_toy.dto.User;
import com.javalec.project_toy.mapper.sql.UserSQL;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@Mapper
public interface UserMapper {
    @SelectProvider(type = UserSQL.class, method = "getTest")
    List<User> getTest();
}
