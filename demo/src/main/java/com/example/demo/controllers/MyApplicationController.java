package com.example.demo.controllers;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.MyApplicationService;

@RestController
public class MyApplicationController {
	
	@GetMapping("/")
	public String getData() {
		return "Hello World";
	}
	
	@Autowired
    private MyApplicationService myApplicationService;

	@CrossOrigin
    @GetMapping("/read-json")
    public Map<String, Object> readJsonFile() {
        try {
            String fileName = "static/data.json";
            return myApplicationService.readJsonFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
