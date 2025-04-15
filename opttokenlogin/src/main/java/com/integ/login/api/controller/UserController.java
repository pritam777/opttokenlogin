package com.integ.login.api.controller;

import com.integ.login.api.model.ApiResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping("/profile")
    public ApiResponse getUserProfile(Authentication authentication) {
        Jwt jwt = (Jwt) authentication.getPrincipal();

        String userId = jwt.getSubject();
        String email = jwt.getClaimAsString("email");

        return new ApiResponse(
            "User profile fetched successfully",
            "SUCCESS",
            "UserID: " + userId + ", Email: " + email
        );
    }
}
