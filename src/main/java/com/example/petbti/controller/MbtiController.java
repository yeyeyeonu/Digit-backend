package com.example.petbti.controller;

import com.example.petbti.service.MbtiService;
import com.example.petbti.request.MbtiRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class MbtiController {

    private final MbtiService mbtiService;

    public MbtiController(MbtiService mbtiService) {
        this.mbtiService = mbtiService;
    }

    @PostMapping("/submit")
    public String submitMbti(@RequestBody MbtiRequest request) {
        return mbtiService.calculateMbti(request);
    }
}
