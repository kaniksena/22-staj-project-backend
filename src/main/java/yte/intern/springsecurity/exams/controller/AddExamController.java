package yte.intern.springsecurity.exams.controller;

import yte.intern.springsecurity.exams.entity.Exams;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public record AddExamController(
       @NotNull
        Long id,
        @NotEmpty
        String time,
        @NotEmpty
        String dersKodu,
        @NotEmpty
        Long score
) {

    public Exams toEntity() {

        return new Exams(
                id,
                time,
                dersKodu,
                score
        );
    }
}
