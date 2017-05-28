/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.controller;

import com.dickanirwansyah.spring.dao.NasabahDAO;
import com.dickanirwansyah.spring.entities.Nasabah;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dickajava
 */

@RestController
@RequestMapping(value = "/api")
public class ControllerNasabahApi {
    
    @Autowired
    private NasabahDAO nasabahDAO;
    
    @RequestMapping(value = "/listnasabah", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Nasabah> doFindAll(){
        return nasabahDAO.findAll();
    }
    
    @RequestMapping(value = "/listnasabah/{idnasabah}", method = RequestMethod.GET)
    public Nasabah doFindById(@PathVariable int idnasabah){
        return nasabahDAO.findOne(idnasabah);
    }
    
    @RequestMapping(value = "/delete/{idnasabah}", method = RequestMethod.DELETE)
    public void doDelete(@PathVariable int idnasabah){
        if(nasabahDAO.findOne(idnasabah)!=null){
            nasabahDAO.delete(idnasabah);
        }
    }
}
