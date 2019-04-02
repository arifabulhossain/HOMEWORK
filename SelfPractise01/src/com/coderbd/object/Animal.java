/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.object;

/**
 *
 * @author User
 */
public class Animal {
    String name;
    int age;
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "cat";
        a.age = 03;
        
        System.out.println(a.name);
        System.out.println(a.age);
    }
}
