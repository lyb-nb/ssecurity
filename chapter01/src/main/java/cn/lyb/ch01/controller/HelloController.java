package cn.lyb.ch01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lyb
 * @Date 2019/8/6 23:31
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "+++Hello Spring Boot+++";
    }
}
