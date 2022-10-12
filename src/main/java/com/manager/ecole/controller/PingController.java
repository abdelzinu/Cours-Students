package com.manager.ecole.controller;

import com.manager.ecole.dto.PingDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

    @GetMapping
    public PingDTO getAllCourses() {
        return new PingDTO();
    }
}
