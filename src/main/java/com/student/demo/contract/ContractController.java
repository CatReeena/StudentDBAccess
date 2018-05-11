package com.student.demo.contract;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContractController {

    private ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/contract")
    public String greeting(@RequestParam(name="id", required=false, defaultValue="1") String id, Model model) {
        Contract contract = contractService.findById(Long.parseLong(id));
        model.addAttribute("contract", contract);
        return "contractkind";
    }
}
