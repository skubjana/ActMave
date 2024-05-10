/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unitmave;

import java.util.Scanner;

/**
 *
 * @author skubjana
 */
public class UnitMave {

    public static void main(String[] args) {
        MyMethods my = new MyMethods();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any string value: ");
        String name = sc.nextLine();
        
        System.out.print("\nWhat is your birth year? > ");
        int birthYear = sc.nextInt();
        
        System.out.println("Does the string have a white space and is less more than 6 characters long? > " + my.checkName(name));
        
        System.out.println("Is age even or odd??? > " + my.checkAge(birthYear));
    }
}
