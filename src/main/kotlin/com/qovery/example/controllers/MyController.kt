package com.qovery.example.controllers

import com.qovery.example.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/my")
class MyController {

    @GetMapping
    fun poney() : Int {
        return 42;
    }

}
