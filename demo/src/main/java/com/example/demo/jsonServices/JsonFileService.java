package com.example.demo.jsonServices;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class JsonFileService {

    @SuppressWarnings("unchecked")
	public Map<String, Object> readJsonFile(String fileName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        // Use ClassPathResource to read the file from the classpath
        ClassPathResource resource = new ClassPathResource(fileName);

        // Read the JSON file into a Map
        return objectMapper.readValue(resource.getInputStream(), Map.class);
    }
}
