package com.student.demo.speciality;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {

    List<Speciality> findAll(Sort sort);
}
