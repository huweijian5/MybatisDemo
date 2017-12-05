package com.example.demo.service

import com.example.demo.model.dao.UserMapper
import com.example.demo.model.entity.UserEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userMapper: UserMapper

    fun addUser(user: UserEntity) {
        userMapper.addOne(user)
    }

    fun getAllUser(): List<UserEntity> {
        return userMapper.getAll()
    }

    fun getUser(id:Long):UserEntity {
        return userMapper.getOneById(id)
    }


    fun updateUser(user: UserEntity) {
        userMapper.updateOne(user)
    }

    fun deleteUser(id:Long) {
        userMapper.deleteOne(id)
    }
}