package com.constantine.ckow.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class FrontEndController {
    private static final String VERSION = "0.0.1";

    @ModelAttribute
    public void addCommonAttributes(Model model) {
        model.addAttribute("theme", "/Dark.css");
    }


    @RequestMapping("/Tree")
    public String getNewAccount() {
        return "Tree";
    }

    @RequestMapping("/")
    public String getHome() {
        return "Home";
    }
}
