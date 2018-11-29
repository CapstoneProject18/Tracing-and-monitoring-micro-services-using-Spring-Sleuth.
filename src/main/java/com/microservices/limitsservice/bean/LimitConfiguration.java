/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservices.limitsservice.bean;

/**
 *
 * @author piku
 */
public class LimitConfiguration {
    private int maximum;
 private int minimum;
 protected LimitConfiguration() {
 }
 public LimitConfiguration(int maximum, int minimum) {

 super();
 this.maximum = maximum;
 this.minimum = minimum;
 }
 public int getMaximum() {
 return maximum;
 }
 public int getMinimum() {
 return minimum;
 }

 
}
