
package morsecodeconverter;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Shanell Spann
 * Assignment 5
 * 11/01/2020
 * Objective: Practice text processing by using loops & switch case to write a 
 * program that asks a user to enter a string (text) and then convert that 
 * string into Morse Code which is a bunch of dashes & dots used to encode telecommunication.  
 */
public class MorseCodeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner keyboard =new Scanner(System.in);
       System.out.println("Enter a word or phrase: ");
       //Read entered string
       String str= keyboard.nextLine();
       
       //Loop for getting each character
       for(int i=0; i < str.length(); i++)
       {
                  //Each character from the string
                    char c = str.charAt(i);
                    //Convert each character into Morse code.
                     switch(c)
                     {
                      case ' ':
                         System.out.print("space");
                         break;
                      case ',':
                         System.out.print("--..--");
                         break;
                      case '.':
                         System.out.print(".-.-.-");
                         break;
                      case '?':
                         System.out.print("..--..");
                         break;
                      case '0':
                         System.out.print("-----");
                         break;
                      case '1':
                         System.out.print(".----");
                         break;
                      case '2':
                         System.out.print("..---");
                         break;
                       case '3':
                         System.out.print("...--");
                         break;
                       case '4':
                         System.out.print("....-");
                         break;
                        
                       case '5':
                         System.out.print(".....");
                         break;
                       case '6':
                         System.out.print("-....");
                         break;
                       case '7':
                         System.out.print("--...");
                         break;
                       case '8':
                         System.out.print("---..");
                         break;
                       case '9':
                         System.out.print("----.");
                         break;
                       case 'A':
                         System.out.print(".-");
                         break;
                      case 'B':
                         System.out.print("-...");
                         break;
                      case 'C':
                         System.out.print("-.-.");
                         break;
                      case 'D':
                         System.out.print("-..");
                         break;
                      case 'E':
                         System.out.print(".");
                         break;
                      case 'F':
                         System.out.print("..-.");
                         break;
                      case 'G':
                         System.out.print("--.");
                         break;
                      case 'H':
                         System.out.print("....");
                         break;
                      case 'I':
                         System.out.print("..");
                         break;
                      case 'J':
                         System.out.print(".---");
                         break;
                      case 'K':
                         System.out.print("-.-");
                         break;
                      case 'L':
                         System.out.print(".-..");
                         break;
                      case 'M':
                         System.out.print("--");
                         break;
                      case 'N':
                         System.out.print("-.");
                         break;
                      case 'O':
                         System.out.print("---");
                         break;
                      case 'P':
                         System.out.print(".--.");
                         break;
                      case 'Q':
                         System.out.print("--.-");
                         break;
                      case 'R':
                         System.out.print(".-.");
                         break;
                      case 'S':
                         System.out.print("...");
                         break;
                      case 'T':
                         System.out.print("-");
                         break;
                      case 'U':
                         System.out.print("..-");
                         break;
                      case 'V':
                         System.out.print("...-");
                         break;
                      case 'W':
                         System.out.print(".--");
                         break;
                      case 'X':
                         System.out.print("-..-");
                         break;
                      case 'Y':
                         System.out.print("-.--");
                         break;
                      case 'Z':
                         System.out.print("--..");
                         break;
                      case '-':
                         System.out.print("-");
                         break;
                     
                     }
      
        }
    }   
}
