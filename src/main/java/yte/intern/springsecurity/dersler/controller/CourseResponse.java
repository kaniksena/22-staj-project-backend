package yte.intern.springsecurity.dersler.controller;

import yte.intern.springsecurity.dersler.entity.CustomCourse;

import javax.validation.constraints.NotEmpty;

public record CourseResponse(
        Long dersKodu,
        String dersAdı,
        String tanım,
        String tip,
        String zaman,
        String oda,
        String ogretimGorevlisi
) {
    public static CourseResponse fromEntity(CustomCourse course) {
        return new CourseResponse(
                course.getDersKodu(),
                course.getDersAdı(),
                course.getTanım(),
                course.getTip(),
                course.getZaman(),
                course.getOda(),
                course.getOgretimGorevlisi()
                );
    }
}
