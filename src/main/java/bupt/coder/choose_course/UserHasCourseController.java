package bupt.coder.choose_course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UserHasCourse")
public class UserHasCourseController {

    @Autowired
    private UserHasCourseRepository userHasCourseRepository;

    @PutMapping
    public void add(@RequestBody UserHasCourse userHasCourse) {
        userHasCourseRepository.saveAndFlush(userHasCourse);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        UserHasCourse userHasCourse = userHasCourseRepository.findById(id).get();
        userHasCourseRepository.delete(userHasCourse);
    }

    @PostMapping("/{id}")
    public void update(@RequestBody UserHasCourse userHasCourse, @PathVariable long id) {
        UserHasCourse old = userHasCourseRepository.findById(id).get();
        old.setUserId(userHasCourse.getUserId());
        old.setCourseId(userHasCourse.getCourseId());
        userHasCourseRepository.saveAndFlush(old);
    }

    @GetMapping("/{id}")
    public UserHasCourse find(@PathVariable long id) {
        return userHasCourseRepository.findById(id).get();
    }


    @GetMapping
    public List<UserHasCourse> findAll() {
        return userHasCourseRepository.findAll();
    }
}
