package com.student.demo.speciality;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpecialityService {

    private SpecialityRepository specialityRepository;

    public SpecialityService(SpecialityRepository specialityRepository) {
       this.specialityRepository = specialityRepository;
    }

    public List<Speciality> findAll()
    {
        List<Speciality> specialityList = new ArrayList<>();
        specialityRepository.findAll(new Sort(Sort.Direction.ASC, "name")).forEach(specialityList::add);
        return specialityList;
    }
    public Speciality findById(Long id)
    {
        return specialityRepository.findById(id).get();
    }

}
