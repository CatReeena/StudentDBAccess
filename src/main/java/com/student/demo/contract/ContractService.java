package com.student.demo.contract;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractService {

    private ContractRepository contractRepository;

    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<Contract> findAll()
    {
        List<Contract> contractList = new ArrayList<>();
        contractRepository.findAll().forEach(contractList::add);
        return contractList;
    }
    public Contract findById(Long id)
    {
        return contractRepository.findById(id).get();
    }
}
