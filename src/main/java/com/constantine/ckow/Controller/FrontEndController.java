package com.constantine.ckow.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

import static com.constantine.ckow.Intercept.WebSpyInterceptor.spying;

@Controller
public class FrontEndController {
    private static final String VERSION = "2.0.0";

    @ModelAttribute
    public void addCommonAttributes(Model model) {
        model.addAttribute("theme", "/Dark.css");
        model.addAttribute("webSpy", spying.get());
    }


    @RequestMapping("/Tree")
    public String getNewAccount() {
        return "Tree";
    }

    @RequestMapping("/")
    public String getHome() {
        return "Home";
    }

    @RequestMapping("/Projects")
    public String getProjects() {
        return "Projects";
    }
}
