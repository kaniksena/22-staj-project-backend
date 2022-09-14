package yte.intern.springsecurity.dersler.controller;

import yte.intern.springsecurity.dersler.entity.CustomCourse;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public record UpdateCourse(

    @NotNull
    Long dersKodu,
        @NotEmpty
        String dersAdı,

        @NotEmpty
        String tanım,
        @NotEmpty
        String tip,
        @NotEmpty
        String zaman,
        @NotEmpty
        String oda,
        @NotEmpty
        String ogretimGorevlisi

) {
    public CustomCourse toEntity() {
        return new CustomCourse(
                dersKodu,
                dersAdı,
                tanım,
                tip,
                zaman,
                oda,
                ogretimGorevlisi
        );
    }
}
