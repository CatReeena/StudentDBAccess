package com.student.demo.contractkind;

import com.student.demo.contract.Contract;
import com.student.demo.contract.ContractService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContractKindController {

    private ContractKindService contractKindService;

    public ContractKindController(ContractKindService contractKindService) {
        this.contractKindService = contractKindService;
    }

    @GetMapping("/contractKind")
    public String findByContractKind(@RequestParam(name="id", required=false, defaultValue="1") String id, Model model) {
        ContractKind contractKind = contractKindService.findById(Long.parseLong(id));
        model.addAttribute("contractKind", contractKind);
        return "contractkind";
    }
}
