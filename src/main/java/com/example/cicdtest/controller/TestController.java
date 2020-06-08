package com.example.cicdtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 潘磊明
 * @date 2020/6/7
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "test111";
    }
}
