package com.mindsgraph.backend.mindsgraphbackendver1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @RequestMapping("/")
    @ResponseBody
    public String mainPage() {
        return "Project Mindsgraph-backend-ver1";
    }
}
