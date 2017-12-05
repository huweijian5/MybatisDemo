package com.example.demo.web

import com.example.demo.model.dao.UserMapper
import com.example.demo.model.entity.UserEntity
import com.example.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @Autowired
    lateinit var userService: UserService

    @GetMapping(value = "/addUser")
    fun add(
            @RequestParam(required = false) id: Long? = null,
            @RequestParam name: String,
            @RequestParam age: Int
    ): Any? {
        var userEntity: UserEntity
        if (id != null) {
            userEntity = UserEntity(id = id, name = name, age = age)
        } else {
            userEntity = UserEntity(name = name, age = age)
        }
        try {
            userService.addUser(userEntity)
        } catch (e: Exception) {
            return e.message
        }
        return "success"
    }

    @GetMapping(value = "/getAllUser")
    fun getAllUser(
    ): Any? {
        return userService.getAllUser()
    }

    @GetMapping(value = "/getUser")
    fun getUser(
            @RequestParam id: Long
    ): Any? {
        return userService.getUser(id)
    }

    @GetMapping(value = "/updateUser")
    fun updateUser(
            @RequestParam id: Long,
            @RequestParam name: String,
            @RequestParam age: Int
    ): Any? {
        var userEntity = UserEntity(id = id, name = name, age = age)
        userService.updateUser(userEntity)

        return "success"
    }

    @GetMapping(value = "/deleteUser")
    fun deleteUser(
            @RequestParam id: Long
    ): Any? {
        userService.deleteUser(id)
        return "success"
    }
}