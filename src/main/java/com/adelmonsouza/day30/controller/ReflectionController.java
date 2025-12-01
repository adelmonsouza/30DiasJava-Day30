package com.adelmonsouza.day30.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/reflection")
public class ReflectionController {

    @GetMapping
    public ResponseEntity<Map<String, String>> getInfo() {
        return ResponseEntity.ok(Map.of(
            "status", "success",
            "message", "Reflection endpoint - Day 30",
            "day", "30"
        ));
    }
}
