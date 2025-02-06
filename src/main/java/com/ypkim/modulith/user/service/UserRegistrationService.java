package com.ypkim.modulith.user.service;

import com.ypkim.modulith.device.service.DeviceRegistrationService;
import com.ypkim.modulith.user.domain.User;
import com.ypkim.modulith.user.service.dto.UserRegistrationDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserRegistrationService {

    public void register(UserRegistrationDto dto) {
        User user = User.builder()
                        .email(dto.email())
                        .password(dto.password())
                        .name(dto.name())
                        .phone(dto.phone())
                        .build();

    }
}
