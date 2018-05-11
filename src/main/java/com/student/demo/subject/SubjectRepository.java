package com.student.demo.subject;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubjectRepository extends CrudRepository<Subject,Long> {

    List<Subject> findAll(Sort sort);
}
