package com.example.demo.web

import com.example.demo.model.dao.TestMapper
import com.example.demo.model.dao.UserMapper
import com.example.demo.model.entity.UserEntity
import com.example.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RequestMapping(value = "/test")
@RestController
class TestController {


    @Autowired
    lateinit var testMapper: TestMapper

    @GetMapping(value = "/getUserRoles")
    fun getUserRoles():Any{
      return   testMapper.getUserRoles()
    }


}