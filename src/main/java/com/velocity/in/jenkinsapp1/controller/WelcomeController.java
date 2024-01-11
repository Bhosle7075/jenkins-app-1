package com.velocity.in.jenkinsapp1.controller;

import com.velocity.in.jenkinsapp1.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @Autowired
    private StateService stateService;

    @GetMapping("/indian-states")
    public ResponseEntity<Map<String, String>> getMapOfState() {
        Map<String, String> response = stateService.getIndianStatesWithCapital();
        return ResponseEntity.ok(response);
    }
}
