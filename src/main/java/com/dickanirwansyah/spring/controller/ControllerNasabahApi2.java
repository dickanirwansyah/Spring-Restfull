/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.controller;

import com.dickanirwansyah.spring.dao.NasabahDAO;
import com.dickanirwansyah.spring.entities.Nasabah;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dickajava
 */

@RestController
@RequestMapping(value = "/api")
public class ControllerNasabahApi2 {
    
    @Autowired
    private NasabahDAO nasabahDAO;
    
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Iterable<Nasabah> getFindAll(){
        return nasabahDAO.findAll();
    }
    
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void insertNasabah(@RequestBody Nasabah nasabah){
        
        nasabahDAO.save(nasabah);
    }
    
    @RequestMapping(value = "/update/{idnasabah}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void updateNasabah(@PathVariable("idnasabah") int idnasabah, @RequestBody Nasabah nasabah){
        
        nasabah.setIdnasabah(idnasabah);
        nasabahDAO.save(nasabah);
    }
    
    
    @RequestMapping(value = "/caribyid/{idnasabah}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Nasabah getFindById(@PathVariable("idnasabah") int id, Nasabah nasabah){
        
        nasabah.setIdnasabah(id);
        return nasabahDAO.findOne(id);
    }
    
    
    @RequestMapping(value = "/hapus/{idnasabah}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void deleteNasabah(@PathVariable("idnasabah") int idnasabah, Nasabah nasabah){
        
        if(nasabahDAO.findOne(idnasabah)!=null){
            
            nasabahDAO.delete(idnasabah);
        }
    }
}
