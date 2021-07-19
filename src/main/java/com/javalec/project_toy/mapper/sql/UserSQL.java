package com.javalec.project_toy.mapper.sql;

import org.apache.ibatis.jdbc.SQL;

public class UserSQL {

    public String getTest(){
        return new SQL()
                .SELECT("*")
                .FROM("test")
                .toString();
    }
}
