/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dickajava
 */
@Controller
@RequestMapping(value = "/Hallo")
public class ControllerHallo {
    
    @RequestMapping(method = RequestMethod.GET)
    public String HalloSpring(Model model){
        model.addAttribute("title", "Training Springboot");
        model.addAttribute("hallo", "Hallo Springboot tester");
        return "/hallo/indexHallo";
    }
}
