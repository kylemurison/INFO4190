/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.info4190;

/**
 *
 * @author bigch
 */
import java.util.Scanner;
public class CMtoInches {

    public static void main(String[] args) {
       
        /**
         * adding a comment here, hello world
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of centimeters");
        Double cm = input.nextDouble();
        Double inch = cm * 0.3937008;
        System.out.println(cm + " centimeters is equal to " + inch + " inches!");
    }
}
