/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vera.menu;

import com.vera.mvc.Controller.Controller;

/**
 *
 * @author q
 */
public class Singleton {
     private static Singleton singleton;
    public Controller value;
    private Singleton(Controller value){
     try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }
    //private Singleton(){}
    public static Singleton getSingleton(Controller value){
    if(singleton == null){
    singleton = new Singleton(value);
    }
    return singleton;
    }
}
