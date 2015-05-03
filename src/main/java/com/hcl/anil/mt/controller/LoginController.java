package com.hcl.anil.mt.controller;

import com.hcl.anil.mt.dto.User;
import com.hcl.anil.mt.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by M ANIL KUMAR on 02-05-2015.
 */
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showLoginPage(@ModelAttribute(value = "user") User user){
        return "login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginSubmit(@ModelAttribute(value = "user") User user,ModelMap loginMap){
        boolean isAuthenticated = loginService.authenticateUser(user);
        if(isAuthenticated){
            return "main";
        }
        String loginFailedMsg ="UserName or Password is Invalid";
        loginMap.addAttribute("loginFailedMsg", loginFailedMsg);
        return "login";
    }
}
