package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;

@RestController
@RequestMapping(value="/monitor")
public class MonitoringController {
    @GetMapping(value="/")
    public int test() throws FileNotFoundException {
        Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream("/Users/kipso/Downloads/demo/src/main/resources/alert_config.yaml");

        System.out.println(inputStream);

        HashMap yamlMap = yaml.load(inputStream);
        for (Object o : yamlMap.entrySet()) {
            System.out.println(o);
        }

        return 777;
    }
}
