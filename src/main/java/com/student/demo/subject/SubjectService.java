package com.student.demo.subject;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService  {

    private SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> findAll()
    {
        List<Subject> specialityList = new ArrayList<>();
        subjectRepository.findAll(new Sort(Sort.Direction.ASC, "name")).forEach(specialityList::add);
        return specialityList;
    }
    public Subject findById(Long id)
    {
        return subjectRepository.findById(id).get();
    }

}
