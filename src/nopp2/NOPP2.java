/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nopp2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class NOPP2 {

    public static void csillag() {
        System.out.println("*********************");
        System.out.println("*   NOPPVDProject   *");
        System.out.println("*********************");
    }
     public static boolean szokoevE(int x) {

        if (((x % 4 == 0) && (x % 100 != 0)) || (x % 400 == 0)) {

            return true;

        }

        return false;

    }
    
 
    public static void main(String[] args) {

    // O készít egy metódust, ami eldönti hogy szökőév e
    //if (year % 400 == 0) {
    //  System.out.println(year + " Ez egy szökőév.");
    //} 
    //else if (year % 100 == 0) {
    //  System.out.println(year + " Ez nem egy szökőév..");
    //} 
    //else if (year % 4 == 0) {
    // System.out.println(year + " Ez egy szökőév..");
    //} 
    //else {
    //  System.out.println(year + " Ez nem egy szökőév..");
    //}
    int num = 1234, forditott = 0;
    
    System.out.println("Eredeti szám: " + num);

    // P készít egy metódust, 
    //ami egy számként kapott paramétert kap, és visszaadja szövegként, fordított sorrendben.
    while(num != 0) {
    
      int digit = num % 10;
      forditott = forditott * 10 + digit;

      num /= 10;
    }

    System.out.println("Fordított: " + forditott);
  }
}
  

    

