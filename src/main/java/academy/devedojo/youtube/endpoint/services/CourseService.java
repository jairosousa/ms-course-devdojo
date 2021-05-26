package academy.devedojo.youtube.endpoint.services;/*
 * @Created 26/05/2021 - 13:48
 * @Projet course
 * @Author jnasciso
 *
 */

import academy.devedojo.youtube.endpoint.repository.CourseRepository;
import academy.devedojo.youtube.model.Course;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @Author: Jairo Nascimento on 26/05/2021 - 13:48
 */
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {

  private final CourseRepository courseRepository;

  public Iterable<Course> list(Pageable pageable) {
    log.info("Listing all course");
    return courseRepository.findAll(pageable);
  }
}
