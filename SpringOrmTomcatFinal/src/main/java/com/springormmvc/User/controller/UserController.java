package com.springormmvc.User.controller;

import com.springmormmvc.User.entity.User;
import com.springormmvc.User.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController  {
    @Autowired
    UserService userService;
    @RequestMapping("registrationPage")
    public String showRegistrationPage()
    {
        return "userReg";
    }
    @RequestMapping(value = "registerUser", method= RequestMethod.POST)
    public String registerUser(@ModelAttribute("user")User user, ModelMap modelMap){
        int result = userService.save(user);
        modelMap.addAttribute("result","User Created with ID"+result);
        return "userReg";
    }
    @RequestMapping("getUsers")
    public String getUser(ModelMap modelMap)
    {

        List<User> users = userService.getUsers();
        modelMap.addAttribute("users",users);
        return "displayUsers";
    }
    @RequestMapping("validateEmail")
    public @ResponseBody String validateEmail(@RequestParam("id")int id)
    {
        User user = userService.getUser(id);
        String msg="";
        if (user!=null)
        {
            msg=id+"Already exits";
        }
        return  msg;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


}
