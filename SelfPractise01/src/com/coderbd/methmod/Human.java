/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.methmod;

/**
 *
 * @author User
 */
public class Human {
   String name;
   int age;
   
  void setInformation( String n,int a){
   name = n;
   age = a;
   
   }
  void display(){
      System.out.println(name);
      System.out.println(age);
  }
}
