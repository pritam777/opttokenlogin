package com.integ.login.api.controller;

import com.integ.login.api.model.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/public")
public class PublicController {

    @GetMapping("/hello")
    public ApiResponse hello() {
        return new ApiResponse("Hello from secured Auth0 endpoint!", "SUCCESS", "OTL-MS-0001");
    }
    
    @GetMapping("/health")
    public ApiResponse healthCheck() {
        return new ApiResponse("Service is up and running", "SUCCESS", "Version: 1.0.0");
    }
}
