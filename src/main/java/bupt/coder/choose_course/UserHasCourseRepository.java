package bupt.coder.choose_course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserHasCourseRepository extends JpaRepository<UserHasCourse, Long> {

}
