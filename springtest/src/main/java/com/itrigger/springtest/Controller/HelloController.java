package com.itrigger.springtest.Controller;

import com.itrigger.springtest.Bean.person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    person person;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return person.toString();
    }
}
