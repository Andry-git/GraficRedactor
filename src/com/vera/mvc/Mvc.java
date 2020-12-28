/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vera.mvc;


import com.vera.mvc.Controller.Controller;
import com.vera.mvc.model.Model;

/**
 *
 * @author Wera
 */
public class Mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Controller();
        //Model singleton = Model.getSingleton();
        //С моделью тут она тоже запускается, но немного странно
        //Её здесь писать не надо, но показываю, что так тоже можно
    }
    
}
