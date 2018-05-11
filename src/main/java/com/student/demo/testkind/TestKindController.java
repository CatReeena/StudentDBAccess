package com.student.demo.testkind;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestKindController {

    private TestKindService testKindService;

    public TestKindController(TestKindService testKindService) {
        this.testKindService = testKindService;
    }

    @GetMapping("/test")
    public String greeting(@RequestParam(name="id", required=false, defaultValue="1") String id, Model model) {
        TestKind testKind = testKindService.findById(Long.parseLong(id));
        model.addAttribute("testkind", testKind);
        return "testkind";
    }
}
