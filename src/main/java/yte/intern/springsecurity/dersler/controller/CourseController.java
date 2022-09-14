package yte.intern.springsecurity.dersler.controller;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;
import yte.intern.springsecurity.common.MessageResponse;
import yte.intern.springsecurity.dersler.service.CourseService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

private final CourseService courseService;

@PostMapping
    public MessageResponse addCourse(@RequestBody @Valid AddCourseRequest request){
    return courseService.addCourse(request.toEntity());
}
@GetMapping
    public List<CourseResponse> getAllCourse(){
    return courseService.getAllCourse()
            .stream()
            .map(CourseResponse::fromEntity)
            .toList();

}
    @GetMapping("/{derskodu}")
    public CourseResponse getCourseById(@PathVariable Long derskodu) {
        return CourseResponse.fromEntity(courseService.getById(derskodu));
    }

    @GetMapping("/name/{dersadı}")
    public List<CourseResponse> getCourseByName(@PathVariable String dersadı) {
        return courseService.getByName(dersadı)
                .stream()
                .map(CourseResponse::fromEntity)
                .toList();
    }
    @GetMapping("/tip/{tip}")
    public List<CourseResponse> getCourseByTip(@PathVariable String tip) {
        return courseService.getByTip(tip)
                .stream()
                .map(CourseResponse::fromEntity)
                .toList();
    }
@SneakyThrows
@PutMapping("/{derskodu}")
public MessageResponse updateCourse(@RequestBody @Valid UpdateCourse request,
                                     @PathVariable Long derskodu)  {

        return courseService.updateCourse(derskodu, request.toEntity());


}
    @DeleteMapping("/{derskodu}")
    public MessageResponse deleteStudent(@PathVariable Long derskodu) {
        return courseService.deleteCourse(derskodu);
    }
}
