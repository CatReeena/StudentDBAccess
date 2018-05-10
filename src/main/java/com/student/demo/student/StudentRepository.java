package com.student.demo.student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository  extends CrudRepository<Student, Long> {
}
