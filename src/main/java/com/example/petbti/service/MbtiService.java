package com.example.petbti.service;

import org.springframework.stereotype.Service;
import com.example.petbti.request.MbtiRequest;

@Service
public class MbtiService {

    public String calculateMbti(MbtiRequest req) {
        // Null 방지 및 소문자 변환
        String q1 = safe(req.getQ1());
        String q2 = safe(req.getQ2());
        String q3 = safe(req.getQ3());
        String q4 = safe(req.getQ4());

        System.out.println("🔹 받은 값 → q1=" + q1 + ", q2=" + q2 + ", q3=" + q3 + ", q4=" + q4);

        // 모든 if문에서 "문자열".equals(변수) 형태 사용 → null 절대 안전
        if ("e".equals(q1) && "n".equals(q2) && "f".equals(q3) && "j".equals(q4)) {
            return "ENFJ";
        } else if ("e".equals(q1) && "n".equals(q2) && "f".equals(q3) && "p".equals(q4)) {
            return "ENFP";
        } else if ("e".equals(q1) && "n".equals(q2) && "t".equals(q3) && "j".equals(q4)) {
            return "ENTJ";
        } else if ("e".equals(q1) && "n".equals(q2) && "t".equals(q3) && "p".equals(q4)) {
            return "ENTP";
        } else if ("e".equals(q1) && "s".equals(q2) && "f".equals(q3) && "j".equals(q4)) {
            return "ESFJ";
        } else if ("e".equals(q1) && "s".equals(q2) && "f".equals(q3) && "p".equals(q4)) {
            return "ESFP";
        } else if ("e".equals(q1) && "s".equals(q2) && "t".equals(q3) && "j".equals(q4)) {
            return "ESTJ";
        } else if ("e".equals(q1) && "s".equals(q2) && "t".equals(q3) && "p".equals(q4)) {
            return "ESTP";
        } else if ("i".equals(q1) && "n".equals(q2) && "f".equals(q3) && "j".equals(q4)) {
            return "INFJ";
        } else if ("i".equals(q1) && "n".equals(q2) && "f".equals(q3) && "p".equals(q4)) {
            return "INFP";
        } else if ("i".equals(q1) && "n".equals(q2) && "t".equals(q3) && "j".equals(q4)) {
            return "INTJ";
        } else if ("i".equals(q1) && "n".equals(q2) && "t".equals(q3) && "p".equals(q4)) {
            return "INTP";
        } else if ("i".equals(q1) && "s".equals(q2) && "f".equals(q3) && "j".equals(q4)) {
            return "ISFJ";
        } else if ("i".equals(q1) && "s".equals(q2) && "f".equals(q3) && "p".equals(q4)) {
            return "ISFP";
        } else if ("i".equals(q1) && "s".equals(q2) && "t".equals(q3) && "j".equals(q4)) {
            return "ISTJ";
        } else if ("i".equals(q1) && "s".equals(q2) && "t".equals(q3) && "p".equals(q4)) {
            return "ISTP";
        } else {
            System.out.println("⚠️ 조건 불일치, 기본값 반환");
            return "ESFP"; // 기본값
        }
    }

    private String safe(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase(); // 공백 제거, 소문자화
    }
}
