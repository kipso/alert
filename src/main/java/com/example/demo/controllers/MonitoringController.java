package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/monitor")
public class MonitoringController {
    @GetMapping(value="/")
    public int test() {
        return 777;
    }
}
