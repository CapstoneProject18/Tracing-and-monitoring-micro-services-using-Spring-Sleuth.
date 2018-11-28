/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservices.currencyconversionservice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author piku
 */
 //@FeignClient(name="currency-exchange-service", url="localhost:8000")
 @FeignClient(name="netflix-zuul-api-gateway-server")
 @RibbonClient(name="currency-exchange-service")
public interface  CurrencyExchangeServiceProxy {
     @GetMapping("/currency-exchange/from/{from}/to/{to}")
 public CurrencyConversionBean retrieveExchangeValue
 (@PathVariable("from") String from, @PathVariable("to") String to);
}
