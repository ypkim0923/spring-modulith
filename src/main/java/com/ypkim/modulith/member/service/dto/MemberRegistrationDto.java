package com.ypkim.modulith.member.service.dto;

public record MemberRegistrationDto(
    String email,
    String password,
    String name,
    String phone) {
}
