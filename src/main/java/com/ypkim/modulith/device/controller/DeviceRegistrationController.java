package com.ypkim.modulith.device.controller;

import com.ypkim.modulith.device.service.DeviceRegistrationService;
import com.ypkim.modulith.device.service.dto.DeviceRegistrationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/device")
@RequiredArgsConstructor
public class DeviceRegistrationController {
    private final DeviceRegistrationService service;

    public ResponseEntity<Void> post(@RequestBody DeviceRegistrationDto dto) {
        service.register(dto);

        return ResponseEntity.ok().build();
    }
}
