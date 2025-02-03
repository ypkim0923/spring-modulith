package com.ypkim.modulith.user.domain;

import lombok.Builder;

@Builder
public class User {
    private String email;
    private String password;
    private String name;
    private String phone;
}
