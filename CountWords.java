//  NAME:           Lauren DeHaan
//  GROUP:          APCS
//  LAST MODIFIED:  10 September 2019
//  PROBLEM ID:     Lewis 3.8 StringTokenizer Delimeters
//  DESCRIPTION:    Program that takes the ASCII values of characters of 2
//                  strings, calculates a value for each and verifies if they
//                  are equal.
//  SOURCES/HELP:   USACO Website, Mr. Houtrouw

import java.io.*;
import java.util.*;

public class CountWords
{
   //  Reads several lines of text, counting the number of words
   //  and the number of non-space characters.
   public static void main (String[] args)
   {
      // Signature
      System.out.print("Lauren DeHaan\nAPCS\nLewis 3.8 StringTokenizer Delimiters");

      // Declares variables and scanner      
      Scanner scan = new Scanner(System.in);
      int wordCount = 0, characterCount = 0;
      String line, word;
      StringTokenizer tokenizer;

      System.out.println ("\n\nPlease enter text (type DONE to quit):");
      line = scan.nextLine();
      
      // Controls amount of times program runs based on user input
      while (!line.equals("DONE"))
      {
         tokenizer = new StringTokenizer (line, ";!?-,'.:{~}[]\" ");
         while (tokenizer.hasMoreTokens())
         {
            word = tokenizer.nextToken();
            wordCount++;
            characterCount += word.length();
         }
         line = scan.nextLine();
      }

      System.out.println ("\nNumber of words: " + wordCount);
      System.out.println ("Number of characters: " + characterCount);
   }
}
