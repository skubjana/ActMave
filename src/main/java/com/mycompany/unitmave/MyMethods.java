/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unitmave;

/**
 *
 * @author skubjana
 */
public class MyMethods {
    
    public boolean checkName(String myStr){
        
        return (myStr.contains(" ") && myStr.length() > 6);
    }
    
    public boolean checkAge(int bYear){
        
        int curYear = 2024;
        
        int age = curYear - bYear;
        
        return (age % 2 == 0);
        
    }
}
