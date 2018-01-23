package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/hello")
public class Hello {
    @RequestMapping(value = "/hello",method=RequestMethod.GET)
    public String welcome(ModelMap model){
        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";
    }
}


