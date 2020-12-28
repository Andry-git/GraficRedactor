/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vera.mvc;

import com.vera.menu.Singleton1;
import com.vera.menu.Singleton;
import com.vera.mvc.Controller.Controller;
import com.vera.mvc.view.MyFrame;

/**
 *
 * @author Wera
 */
public class Mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new Controller();
        Singleton singleton = Singleton.getSingleton(new Controller());
        System.out.println("\nЕсли два разных значения, то создано два Синглтона" + "\n" +
                "Если два одинаковых знчачения, то Синглтон сработал дважды)" + "\n\n" +
                "Результат:" + "\n");
        Singleton1 singleton1 = Singleton1.getSingleton1("Собака");
        Singleton1 anotherSingleton = Singleton1.getSingleton1("Кошка");
        System.out.println(singleton1.slovo);
        System.out.println(anotherSingleton.slovo);
    }
    
}
