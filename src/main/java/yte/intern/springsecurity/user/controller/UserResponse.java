package yte.intern.springsecurity.user.controller;


import yte.intern.springsecurity.user.entity.Users;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public record UserResponse(
        @NotNull
        Long id,
        @NotEmpty
        String name,
        @NotEmpty
        String surname,
        @NotEmpty
        String rol,
        @NotEmpty
        @Email
        String email,
        @NotEmpty
        String kullanıcıAdı
) {
    public static UserResponse fromEntity(Users users) {
        return new UserResponse(
                users.getId(),
                users.getName(),
                users.getSurname(),
                users.getRol(),
                users.getEmail(),
                users.getKullanıcıAdı()
        );
    }
}
