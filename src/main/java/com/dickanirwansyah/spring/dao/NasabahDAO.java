/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.dao;

import com.dickanirwansyah.spring.entities.Nasabah;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dickajava
 */
public interface NasabahDAO extends JpaRepository<Nasabah, Integer>{
    
}
