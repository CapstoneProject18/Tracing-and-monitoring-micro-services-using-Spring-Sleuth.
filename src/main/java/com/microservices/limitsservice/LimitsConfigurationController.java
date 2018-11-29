/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservices.limitsservice;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RestController;
import com.microservices.limitsservice.bean.LimitConfiguration;
import com.microservices.limitsservice.Configuration;
/**
 *
 * @author piku
 */@RestController
public class LimitsConfigurationController {
     
     @Autowired
 private Configuration configuration;
 @GetMapping("/limits") public LimitConfiguration retrieveLimitsFromConfigurations() {
     int s = configuration.getMaximum();
     int p =  configuration.getMinimum();
 return new LimitConfiguration(s , p);
 }
    
}
