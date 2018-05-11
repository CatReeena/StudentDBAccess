package com.student.demo.cafedra;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CafedraService {

    private CafedraRepository cafedraRepository;

    public CafedraService(CafedraRepository cafedraRepository) {
        this.cafedraRepository = cafedraRepository;
    }

    public List<Cafedra> findAll()
    {
        List<Cafedra> cafedraList = new ArrayList<>();
        cafedraRepository.findAll(new Sort(Sort.Direction.ASC, "name")).forEach(cafedraList::add);
        return cafedraList;
    }
    public Cafedra findById(Long id)
    {
        return cafedraRepository.findById(id).get();
    }

}
