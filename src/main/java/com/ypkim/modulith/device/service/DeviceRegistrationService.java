package com.ypkim.modulith.device.service;

import com.ypkim.modulith.device.domain.Device;
import com.ypkim.modulith.device.service.dto.DeviceRegistrationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeviceRegistrationService {

    public void register(DeviceRegistrationDto dto) {

        var device = Device.builder()
                           .id(dto.deviceId())
                           .name(dto.name())
                           .type(dto.type())
                           .build();

    }
}
