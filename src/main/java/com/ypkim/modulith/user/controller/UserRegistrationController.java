package com.ypkim.modulith.user.controller;


import com.ypkim.modulith.user.service.UserRegistrationService;
import com.ypkim.modulith.user.service.dto.UserRegistrationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRegistrationController {
    private final UserRegistrationService service;

    @PostMapping
    public ResponseEntity<Void> post(@RequestBody UserRegistrationDto dto) {

        service.register(dto);

        return ResponseEntity.ok().build();
    }
}
