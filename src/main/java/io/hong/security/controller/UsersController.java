package io.hong.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping(value="/user")
    public String user() {
        return "/user/user";
    }

    @GetMapping(value="/manager")
    public String manager() {
        return "/user/manager";
    }

    @GetMapping(value="/admin")
    public String admin() {
        return "/user/admin";
    }
}
