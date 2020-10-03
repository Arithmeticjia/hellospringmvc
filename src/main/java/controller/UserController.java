package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;

import javax.servlet.http.HttpSession;
@Controller
@RequestMapping("/user")
public class UserController {
    //处理登陆
    @RequestMapping("/login")
    public String login(User user, HttpSession session, Model model){
        System.out.println(user);
        if(user.getUname().equals("admin") && user.getUpass().equals("12345")){
            session.setAttribute("user" ,user);
            return "main";
        }else {
            model.addAttribute("msg","账户或者密码错误！！！");
            return "login";
        }
    }

    //处理注册
    @RequestMapping("/register")
    public String register(User user,Model model){
        if (user.getUname().equals("admin") && user.getUpass().equals("1")){
            return "login";
        }else {
            model.addAttribute("uname",user.getUname());
            return "register";
        }
    }
}
