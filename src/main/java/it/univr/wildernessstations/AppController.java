package it.univr.wildernessstations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/homepage")
    public String homepage() {
        return "homepage";
    }

}
