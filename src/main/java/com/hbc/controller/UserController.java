package com.hbc.controller;

import com.hbc.domain.User;
import com.hbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //后台管理相关
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<User> userList = userService.findAll();
        model.addAttribute("userList",userList);
        return "/admin/userList";//这里自动将model传过去了
    }

    @RequestMapping("/start")
    public String start(){
        return "/begin/start";
    }

    //前台展示相关
    //注册（提前检查功能，可以提前赋值进一步升级避免为空状态）
    @RequestMapping(value = "/checkName")//consumes = "application/json"限定了请求的格式
    @ResponseBody
    public String  checkName(HttpServletRequest request,HttpServletResponse response) throws IOException {
        User user = new User();
        String username = request.getParameter("username");
        System.out.println("用户名是："+username);
        user.setUsername(username);
        boolean nameExists = userService.nameExists(user);
        if(nameExists){
            return "用户名已经存在";
        }else {
            return "";
        }
    }
    @RequestMapping("/register")
    public String register(User user){
        if (!userService.nameExists(user)){
            userService.add(user);
            return "/fore/homePage";
        }
        return "/fore/login";
    }

    @RequestMapping("/registerPage")
    public String registerPage(){
        return "register";
    }


    //登录
    @RequestMapping("/login")
    public String login(User user,Model model){
        User user1 = userService.find(user);
        if (user1!=null){
            model.addAttribute("user",user);
            return "/fore/homePage";
        }else {
            model.addAttribute("notice","用户名或密码错误");
            return "/fore/login";
        }
    }

    //查看个人信息
    @RequestMapping("/change")
    public String change(User user,Model model){
        userService.update(user);
        return "fore/userPage";
    }

    //接收html
    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        String html = request.getParameter("text");
        System.out.println(html);
        return "/fore/homePage";
    }


}
