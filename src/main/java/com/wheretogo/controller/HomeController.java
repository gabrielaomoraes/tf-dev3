package com.wheretogo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gabriela_de_Oliveira on 11/1/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

}
