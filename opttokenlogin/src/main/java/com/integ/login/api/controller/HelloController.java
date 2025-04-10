package com.integ.login.api.controller;

import com.integ.login.api.model.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public ApiResponse hello() {
        return new ApiResponse("Hello from secured Auth0 endpoint!", "SUCCESS", null);
    }
}
