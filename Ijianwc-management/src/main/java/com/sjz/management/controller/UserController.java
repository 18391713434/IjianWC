package com.sjz.management.controller;


import com.sjz.ijianwc.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public Result login(){
        return Result.success().data("token","admin");
    }

    @GetMapping("/info")
    public Result info(){
        return Result.success().data("roles","[admin]");
    }


}
