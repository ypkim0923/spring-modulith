package com.ypkim.modulith.member.controller;


import com.ypkim.modulith.member.service.MemberRegistrationService;
import com.ypkim.modulith.member.service.dto.MemberRegistrationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class MemberRegistrationController {
    private final MemberRegistrationService service;

    @PostMapping
    public ResponseEntity<Void> post(@RequestBody MemberRegistrationDto dto) {

        service.register(dto);

        return ResponseEntity.ok().build();
    }
}
