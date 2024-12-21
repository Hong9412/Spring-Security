package io.hong.security.users.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String LoginForm() {
        return "/login/login";
    }

    @GetMapping("/join")
    public String JoinForm() {
        return "/login/join";
    }
}
