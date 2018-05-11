package com.student.demo.speciality;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SpecialityController {

    private SpecialityService specialityService;

    public SpecialityController(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @GetMapping("/speciality")
    public String greeting(@RequestParam(name="id", required=false, defaultValue="1") String id, Model model) {
        Speciality speciality = specialityService.findById(Long.parseLong(id));
        List<Speciality> specialityList = specialityService.findAll();
        model.addAttribute("speciality", speciality);
        model.addAttribute("specialityList", specialityList);
        return "speciality";
    }
}
