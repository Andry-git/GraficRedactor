/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vera.menu;

/**
 *
 * @author q
 */
public class Singleton1 {
    private static Singleton1 singleton1;
    public String slovo;
    private Singleton1(String slovo){
     try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.slovo = slovo;
    }
    public static Singleton1 getSingleton1(String slovo){
    if(singleton1 == null){
    singleton1 = new Singleton1(slovo);
    }
    return singleton1;
    }
}
