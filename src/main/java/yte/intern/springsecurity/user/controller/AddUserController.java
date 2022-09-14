package yte.intern.springsecurity.user.controller;

import yte.intern.springsecurity.user.entity.Users;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public record AddUserController(
        @NotEmpty
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
    public Users toEntity() {

        return new Users(
                id,
                name,
                surname,
                rol,
                email,
                kullanıcıAdı
        );
    }
}
