package com.ypkim.modulith.user.service;

import com.ypkim.modulith.user.domain.User;
import com.ypkim.modulith.user.domain.UserService;
import com.ypkim.modulith.user.service.dto.UserRegistrationDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserRegistrationService {

    private final UserService service;

    public void register(UserRegistrationDto dto) {
        User user = User.builder()
                        .email(dto.email())
                        .password(dto.password())
                        .name(dto.name())
                        .phone(dto.phone())
                        .build();

        service.save(user);
    }
}
