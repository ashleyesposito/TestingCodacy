/*
* File: finalproject.java
* Author: A. Esposito

*/
package finalproject;

/**
 *
 * @author Ashley
 */
import java.io.*;
import java.util.*;
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(" ********** Welcome to the Titanic Statistical Application **************************");
        System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program :");

        System.out.println("1. How many passengers were on the Titanic?");
        System.out.println("2. What percentage of passengers perished on the Titanic?");
        System.out.println("3. What percentage passengers survived the sinking of the Titanic?");
        System.out.println("4. What percentage of passengers survived for each of the three classes?");
        System.out.println("5. What percentage of passengers survived as a function of gender?");
        System.out.println("6. What specific passengers paid more than $200 for their tickets?");
        System.out.println("7. What specific passengers who were less than 10 years old perished on the titanic?");
        System.out.println("8. What specific passengers who were less than 10 years old survived the sinking of the titanic?");
        System.out.println("9. For each letter in the alphabet, how many passengers last names started with that letter?");
        System.out.println("Q. Quit the program");
        
        Scanner scanner = new Scanner(System.in);
        
        String input=scanner.nextLine();
        String check=input;
       while(9!=input){
        System.out.println("Enter your selection: ");
        String input1=scanner.nextLine();
        check=input1;
       }
       switch (check){
           case 1 :
               System.out.println(1);
               break;
           case 2 :
               System.out.println(2);
               break;
           case 3 :
               System.out.println(3);
               break;
           case 4 :
               System.out.println(4);
               break;
           case 5 :
               System.out.println(5);
               break;
           case 6 :
               System.out.println(6);
               break;
           case 7 :
               System.out.println(7);
               break;
           case 8 :
               System.out.println(8);
               break;
           case 9 :
               System.out.println(9);
               break;
           
           
            
       }

    }
    
}
