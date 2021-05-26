package academy.devedojo.youtube.endpoint.repository;

import academy.devedojo.youtube.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Author: Jairo Nascimento
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

}
