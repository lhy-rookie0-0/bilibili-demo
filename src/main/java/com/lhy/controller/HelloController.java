package com.lhy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world hhh";
    }

    @RequestMapping("/demo1")
    public String demo1(String id, String name, HttpServletRequest request) {
        request.setAttribute("id", id);
        request.setAttribute("name", name);
        return "index";
    }

    @RequestMapping("/demo2")
    public String demo2(String id, String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping("/demo3")
    public ModelAndView demo3(String id, String name,Model model) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("id", id);
        mav.addObject("name", name);
        return mav;
    }
}
