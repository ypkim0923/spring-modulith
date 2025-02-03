package com.ypkim.modulith.device.domain;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class DeviceService {
    private final DeviceRepository repository;

    public Device save(Device device) {
        return repository.save(device);
    }
}
