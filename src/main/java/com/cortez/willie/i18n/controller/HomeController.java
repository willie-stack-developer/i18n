package com.cortez.willie.i18n.controller;

import com.cortez.willie.i18n.repository.LanguageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HomeController {

    private final LanguageRepository languageRepository;

    public HomeController(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @GetMapping(value = {"", "/"})
    public String root(){
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(Map<String, Object> model){
        return "index";
    }
}
