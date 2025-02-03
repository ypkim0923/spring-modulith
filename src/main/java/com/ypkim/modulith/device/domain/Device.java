package com.ypkim.modulith.device.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Device {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String deviceId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;
}
