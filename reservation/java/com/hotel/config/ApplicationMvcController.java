package com.hotel.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class ApplicationMvcController
{
 
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model)
    {
    	model.addAttribute("loginButtonLabel", "Login Button");
        return "login";
    }
    
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(Model model)
    {
        return "main";
    }

    @RequestMapping(value = "/checkin", method = RequestMethod.GET)
    public String checkin(Model model)
    {
        return "checkin";
    }
    
    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public String checkout(Model model)
    {
        return "checkout";
    }
    
    @RequestMapping(value = "/reservation", method = RequestMethod.GET)
    public String reservation(Model model)
    {
        return "reservation";
    }
}