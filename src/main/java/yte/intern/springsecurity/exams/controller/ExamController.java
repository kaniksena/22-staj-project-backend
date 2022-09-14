package yte.intern.springsecurity.exams.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import yte.intern.springsecurity.common.MessageResponse;
import yte.intern.springsecurity.exams.repository.ExamsRepository;
import yte.intern.springsecurity.exams.service.ExamsService;
import yte.intern.springsecurity.user.controller.UserResponse;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/exams")
@RequiredArgsConstructor
public class ExamController {

    private final ExamsService examsService;

    @PostMapping
    public MessageResponse addExams(@RequestBody @Valid AddExamController request) {
       return examsService.AddExam(request.toEntity());
    }

    @GetMapping
    public List<ExamsResponse> getAllExams(){
        return examsService.getAllExams()
                .stream()
                .map(ExamsResponse::fromEntity)
                .toList();

    }

    @GetMapping("/{id}")
    public ExamsResponse getById(@PathVariable Long id) {
        return ExamsResponse.fromEntity(examsService.getById(id));
    }

    @DeleteMapping("/{id}")
    public MessageResponse deleteExam(@PathVariable Long id) {
        return examsService.deleteExam(id);
    }
}

