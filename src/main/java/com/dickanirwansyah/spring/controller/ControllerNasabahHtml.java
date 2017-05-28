/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.controller;

import javax.servlet.http.HttpServlet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dickajava
 */

@Controller
@RequestMapping(value = "/data")
public class ControllerNasabahHtml extends HttpServlet{
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model){
        
        model.addAttribute("title", "List Nasabah");
        model.addAttribute("isi_judul", "List Nasabah");
        return "Nasabah/List";
    }
}
