/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservices.netflixzuulapigatewayserver;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger; import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 *
 * @author piku
 */
@Component
public class ZuulLoggingFilter {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
 
 public boolean shouldFilter()
          {
 return true;
 }

 public Object run() {
 HttpServletRequest request =
 RequestContext.getCurrentContext().getRequest();
 logger.info("request -> {} request uri -> {}", request, request.getRequestURI());
 return null;
 }
 
 public String filterType() {
 return "pre";
 }

 public int filterOrder() {
 return 1;
 }

}
