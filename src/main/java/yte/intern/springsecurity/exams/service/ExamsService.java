package yte.intern.springsecurity.exams.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yte.intern.springsecurity.common.MessageResponse;
import yte.intern.springsecurity.common.ResultType;
import yte.intern.springsecurity.exams.entity.Exams;
import yte.intern.springsecurity.exams.repository.ExamsRepository;
import yte.intern.springsecurity.user.entity.Users;


import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamsService {

    private final ExamsRepository examsRepository;

    public MessageResponse AddExam(Exams exams) {
        examsRepository.save(exams);
        return new MessageResponse("User has been added successfully", ResultType.SUCCESS);

    }

    public List<Exams> getAllExams() {

        return examsRepository.findAll();
    }
    public Exams getById(Long id) {

        return (Exams) examsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("hata"));
    }
    public MessageResponse deleteExam(Long id) {
        examsRepository.deleteById(id);
        return new MessageResponse("Exam with id %d has been deleted", ResultType.SUCCESS);
    }


}
