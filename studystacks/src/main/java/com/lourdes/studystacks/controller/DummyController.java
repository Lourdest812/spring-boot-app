package com.lourdes.studystacks.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lourdes.studystacks.model.DummyModel;

@RestController
public class DummyController {
    @GetMapping("/dummy-view")
    public String dummyView(Model model) {
        DummyModel dummyModel = new DummyModel("Hello, this is a dummy message!");
        model.addAttribute("dummy", dummyModel);
        return dummyModel.getMessage();
    }
}

