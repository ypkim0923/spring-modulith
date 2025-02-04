package com.ypkim.modulith.member;

import com.ypkim.modulith.common.config.AmqpConfig;
import org.springframework.modulith.events.Externalized;

@Externalized(target = AmqpConfig.QUEUE_NAME)
public record DeviceEvent(String data) {
}
