package com.ypkim.modulith.device.service;

import com.ypkim.modulith.member.DeviceEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DeviceEventListener {

    @ApplicationModuleListener
    void on(DeviceEvent event) throws Exception {
        log.info("Event Start!!");
        Thread.sleep(10_000);
        log.info("Event End!!");
        log.info("Event Data : {}", event.data());
    }
}
