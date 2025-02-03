package com.ypkim.modulith.device.domain;

import lombok.Builder;

@Builder
public class Device {
    private String id;
    private String name;
    private String type;
}
