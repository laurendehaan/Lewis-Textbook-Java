//  NAME:           Lauren DeHaan
//  GROUP:          APCS
//  LAST MODIFIED:  23 October 2019
//  PROBLEM ID:     Lewis 8.1 Recursive Palindrome Tester
//  DESCRIPTION:    Program that reads in text and determines
//                  whether or not it is a palindrome recursively
//                  not including nonalphanumeric characters.
//  SOURCES/HELP:   Lewis Java Book

import java.util.*;

public class PalindromeTester2
{
   //  Creates recursive function to test palindromes
   public static boolean palindrome(String pal)
   {
        // if length is 0 or 1 then String is palindrome
        if(pal.length() == 0 || pal.length() == 1)
        {
            return true; 
        }
        
        // Checks first and last char of string then does the same
        // for the resulting substring and repeats
        if(pal.charAt(0) == pal.charAt(pal.length()-1))
        {
             return palindrome(pal.substring(1, pal.length()-1));
        }
        
        // If the string is not a palindrome 
        return false;
   }
   
   // Calls recursive function
   public static void main (String[] args)
   {
       // Signature
      System.out.print("Lauren DeHaan\nAPCS\nLewis 8.1 Recursive Palindrome Tester");

      // Declares variables and scanner
      Scanner scan = new Scanner(System.in);
      String str, another = "y";

      // Controls amount of times program runs based on user input
      while (another.equalsIgnoreCase("y")) // allows y or Y
      {
         System.out.print ("\n\nEnter a potential palindrome:  ");
         str = scan.nextLine();
         
         // Disregards all nonalphanumeric values
         str = str.replaceAll("[^a-zA-Z]","").toLowerCase();
         
         // Calls recursive palindrome function and outputs the results    
          if(palindrome(str))
          {
               System.out.println("\nThat IS a palindrome.");
          }
          else
          {
               System.out.println("\nThat is NOT a palindrome.");   
          }      

         System.out.println();
         System.out.print ("Test another palindrome (y/n)? ");
         another = scan.nextLine();
      }
   }
}
