package com.example.demo.model.dao

import com.example.demo.model.entity.UserEntity
import org.apache.ibatis.annotations.*


@Mapper
interface UserMapper {

    @Select("SELECT * FROM tb_user")
    @Results(
            Result(property = "tmp", column = "name"),//为tmp字段附值
            Result(property = "name", column = "name"))
    fun getAll(): List<UserEntity>

    @Select("SELECT * FROM tb_user WHERE id=#{id}")
    fun getOneById(id: Long): UserEntity

    @Insert("INSERT INTO tb_user(id,name,age) VALUES(#{id},#{name},#{age})")
    fun addOne(user: UserEntity)

    @Delete("DELETE FROM tb_user WHERE id=#{id}")
    fun deleteOne(id: Long)

    @Update("UPDATE tb_user SET name=#{name},age=#{age} WHERE id=#{id}")
    fun updateOne(user: UserEntity)
}