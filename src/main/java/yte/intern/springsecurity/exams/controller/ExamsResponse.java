package yte.intern.springsecurity.exams.controller;

import yte.intern.springsecurity.exams.entity.Exams;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public record ExamsResponse(
        @NotEmpty
        String time,
        @NotEmpty
        String dersKodu,
        @NotEmpty
        @Size(min = 0, max = 100)
        Long score
)  {
    public static ExamsResponse fromEntity(Exams exams) {

        return new ExamsResponse(
                exams.getTime(),
                exams.getDersKodu(),
                exams.getScore()

        );
    }
}
