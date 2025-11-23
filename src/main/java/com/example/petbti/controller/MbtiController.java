package com.example.petbti.controller;

import com.example.petbti.service.MbtiService;
import com.example.petbti.request.MbtiRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
// ✅ 수정할 부분
// 와일드카드(*) 대신 실제 프론트엔드(HTML)가 로드되는 출처를 명시합니다.
@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
public class MbtiController {
    // ...

    private final MbtiService mbtiService;

    public MbtiController(MbtiService mbtiService) {
        this.mbtiService = mbtiService;
    }

    @PostMapping("/submit")
    public String submitMbti(@RequestBody MbtiRequest request) {
        return mbtiService.calculateMbti(request);
    }
}
