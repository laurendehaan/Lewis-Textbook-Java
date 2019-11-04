// NAME             :   Lauren DeHaan
// CLASS            :   APCS
// LAST MODIFIED    :   16 October 2019
// PROBLEM ID       :   Recursive Power Program
// DESCRIPTION      :   This program calculates a user-inputted 
//                      number, X^N, recursively. 
// SOURCES/HELP     :   Lewis Java Book

import java.io.*;
import java.util.*;

public class Recursive
{
   // Creates power function
    public static int power (int x, int n)    
   {                       
          // Calculates X^N recursively
          if (n==0)
          {
               return 1;
          }
          return (x * power(x, n-1));    
    }       
    
   public static void main (String [] args)
   {
        // Signature
        System.out.print("Lauren DeHaan\nAPCS\nRecursive Power Program");
        
        // Declares scanner
        Scanner scan = new Scanner(System.in);
        
        // Controls how many times program runs
        do{
            // Declares variables
            int x, n;
            
            // Prompts and reads in user input
            System.out.print("\n\nEnter a number x to a power n(xn):      ");
            x = scan.nextInt();
            n = scan.nextInt();   
            
            // Calls power method
            int result = power(x, n);
            
            // Outputs the value and asks if the user wants to use program again
            System.out.println(" " + x + "^"+ n + " is " + result);
            System.out.println("\nWould you like to run this program again?(Y/N)      ");
         }while(scan.next().equals("Y"));      
   }             
}        
