package com.student.demo.testkind;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestKindService {

    private TestKindRepository testKindRepository;

    public TestKindService(TestKindRepository testKindRepository) {
        this.testKindRepository = testKindRepository;
    }

    public List<TestKind> findAll()
    {
        List<TestKind> testKindList = new ArrayList<>();
        testKindRepository.findAll().forEach(testKindList::add);
        return testKindList;
    }
    public TestKind findById(Long id)
    {
        return testKindRepository.findById(id).get();
    }

}
