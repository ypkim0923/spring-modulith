package com.ypkim.modulith.user.service.dto;

public record UserRegistrationDto(
    String email,
    String password,
    String name,
    String phone) {
}
