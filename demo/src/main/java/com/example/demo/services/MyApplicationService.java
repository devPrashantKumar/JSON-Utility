package com.example.demo.services;

import com.example.demo.jsonServices.JsonFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class MyApplicationService {

	@Autowired
	JsonFileService jsonFileService;

	public Map<String, Object> readJsonFile(String fileName) throws IOException {
		return jsonFileService.readJsonFile(fileName);

	}
}
