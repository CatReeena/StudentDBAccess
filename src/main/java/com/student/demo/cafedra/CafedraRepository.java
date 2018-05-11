package com.student.demo.cafedra;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CafedraRepository extends CrudRepository<Cafedra,Long> {

    List<Cafedra> findAll(Sort sort);
}
