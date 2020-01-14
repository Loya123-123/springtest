package com.itrigger.springtest.Controller;

import com.itrigger.springtest.Bean.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

@Controller
public class HelloController {
    @Resource
    person person;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        String men=person.toString();
        System.out.println(men);
        return men;
    }
}
