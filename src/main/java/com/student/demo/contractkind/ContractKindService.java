package com.student.demo.contractkind;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractKindService {

    private ContractKindRepository contractKindRepository;

    public ContractKindService(ContractKindRepository contractKindRepository) {
        this.contractKindRepository = contractKindRepository;
    }

    public List<ContractKind> findAll()
    {
        List<ContractKind> contractKindList = new ArrayList<>();
        contractKindRepository.findAll().forEach(contractKindList::add);
        return contractKindList;
    }
    public ContractKind findById(Long id)
    {
        return contractKindRepository.findById(id).get();
    }
}
