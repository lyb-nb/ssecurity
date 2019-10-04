package cn.lybb.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lyb
 * @since 2019/10/4 22:16
 */
@Controller
public class AdminController {

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/")
    public String login(){
        return "login";
    }
}
