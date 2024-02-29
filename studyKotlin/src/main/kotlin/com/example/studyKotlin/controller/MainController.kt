package com.example.studyKotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController{
    @GetMapping("/")
    fun `index`(): String{
        println("HI HI loginshin");
        return "Hello Spring kotlin"
    }
}
