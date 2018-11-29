/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservices.limitsservice;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author piku
 */
@Component

@ConfigurationProperties("limits-service") public class Configuration {
    private int minimum;
    private int maximum;

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }

}
