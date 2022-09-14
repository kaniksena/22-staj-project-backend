package yte.intern.springsecurity.dersler.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yte.intern.springsecurity.common.MessageResponse;
import yte.intern.springsecurity.common.ResultType;
import yte.intern.springsecurity.dersler.repository.CourseRepositroy;
import yte.intern.springsecurity.dersler.entity.CustomCourse;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private  final CourseRepositroy courseRepositroy;
    public MessageResponse addCourse(CustomCourse customCourse){
        courseRepositroy.save(customCourse);
        return new MessageResponse("Course has been addedd successfully", ResultType.SUCCESS);

    }
    public List<CustomCourse> getAllCourse(){
        return courseRepositroy.findAll();
    }
    public  CustomCourse getById(Long dersKodu)  {

        return (CustomCourse) courseRepositroy.findById(dersKodu)
                .orElseThrow(() -> new EntityNotFoundException("hata"));
    }

    public List<CustomCourse>getByName(String dersAdı){

        return (List<CustomCourse>) courseRepositroy.findByDersAdı(dersAdı);
    }
    public List<CustomCourse>getByTip(String tip){

        return (List<CustomCourse>) courseRepositroy.findByTip(tip);
    }
    public MessageResponse updateCourse(Long dersKodu, CustomCourse newCourse) {
        CustomCourse existingCourse =getById(dersKodu);
        existingCourse.update(newCourse);
        courseRepositroy.save(existingCourse);
        return new MessageResponse("Student with id %d has been updated".formatted(dersKodu), ResultType.SUCCESS);

    }

    public MessageResponse deleteCourse(Long dersKodu) {
        courseRepositroy.deleteById(dersKodu);
        return new MessageResponse("Student with id %d has been deleted", ResultType.SUCCESS);
    }

}



