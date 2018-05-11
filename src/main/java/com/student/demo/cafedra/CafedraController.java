package com.student.demo.cafedra;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CafedraController {

    private CafedraService cafedraService;

    public CafedraController(CafedraService cafedraService) {
        this.cafedraService = cafedraService;
    }

    @GetMapping("/cafedra")
    public String greeting(@RequestParam(name="id", required=false, defaultValue="1") String id, Model model) {
        Cafedra cafedra = cafedraService.findById(Long.parseLong(id));
        List<Cafedra> cafedraList = cafedraService.findAll();
        model.addAttribute("cafedra", cafedra);
        model.addAttribute("specialityList", cafedraList);
        return "cafedra";
    }
}
