package academy.learnprogramming.bootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    @ResponseBody
    @GetMapping("hello")
    public String hello() {
        log.info("hello called.");
        return "hello spring boot"; // is what is displayed in the html page.
    }

    @GetMapping("welcome")
    public String welcome(Model context) {
        log.info("welcome called.");
        context.addAttribute("welcome", "welcome to springboot");
        return "welcome"; //is what is displayed in the html page.
    }


}
