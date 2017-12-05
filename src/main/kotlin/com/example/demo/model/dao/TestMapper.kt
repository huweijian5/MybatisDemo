package com.example.demo.model.dao

import com.example.demo.bean.TestResult
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.Select

/**
 * 多表联合查询示例
 */
@Mapper
interface TestMapper {

    @Select("SELECT u.id user_id,r.name rolename,u.name username " +
            "FROM tb_role r,tb_user u ,tb_user_role ur " +
            "WHERE ur.user_id=u.id AND ur.role_id=r.id ")
    @Results(Result(property = "username", column = "username"),
            Result(property = "userId", column = "user_id"),
            Result(property = "rolename", column = "rolename"))
    fun getUserRoles(): List<TestResult>
}