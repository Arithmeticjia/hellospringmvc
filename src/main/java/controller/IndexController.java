package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/toLogin")
    public String login(){
        System.out.println("ok");
        return "login";
    }

    @RequestMapping("/toRegister")
    public String register(){
        return "register";
    }
}