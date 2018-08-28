/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package ctis310hw1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sudduthnc
 */
public class CTIS310HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your first name.");
        String firstName = scan.nextLine();
        String password = firstName.substring(0, 1).toUpperCase() + firstName.substring(1, 2).toLowerCase();
        System.out.println("Password so far: " + password);
        
        System.out.println("Please enter your last name.");
        String lastName = scan.nextLine();
        password = password + lastName.substring(0, 1).toUpperCase() + lastName.substring(1, 2).toLowerCase();
        System.out.println("Password so far: " + password);
        
        System.out.println("Please enter your favorite number.");
        String favNum = scan.nextLine();
        //String favNumString = Integer.toString(favNum);
        password = password + favNum.substring(0,1) + "^" + favNum.substring(1, 2);
        System.out.println("Password so far: " + password);
        
        System.out.println("Please enter your favorite city.");
        String cityFav = scan.next();
        password = password + cityFav.substring(0, 1).toUpperCase() + cityFav.substring(1, 2).toLowerCase();
        System.out.println("Password so far: " + password);
        
        String randNumString = Integer.toString(rand.nextInt(99) + 1);
        System.out.println("Your random number: " + randNumString);
        password = password + randNumString.substring(0, 1) + "." + randNumString.substring(1, 2);
        System.out.println("Your Final Password is: " + password);
    }
    
}
