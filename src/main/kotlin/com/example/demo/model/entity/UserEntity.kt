package com.example.demo.model.entity

data class UserEntity(
        var id: Long? = 0,
        var name:String?="",
        var age:Int?=0,
        var tmp:Any?=""//表中不存在的字段
)