package com.student.demo.subject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SubjectController {

    private SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("/subject")
    public String greeting(@RequestParam(name="id", required=false, defaultValue="1") String id, Model model) {
        Subject speciality = subjectService.findById(Long.parseLong(id));
        List<Subject> specialityList = subjectService.findAll();
        model.addAttribute("subjectList", specialityList);
        return "subject";
    }
}
