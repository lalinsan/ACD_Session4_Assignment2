/*
* Student: Eduardo Aguirre
* Session 4
* Assignment 2
* Java Application that reverse a hardcoded String and also reverse the a String entered by the user. 
*/


import java.util.Scanner;
public class ReverseString{
   public static void main(String[] args){
        
         //Reverse String using a StringBuffer
	  System.out.println("===========================================================");
	  System.out.println("               Reversed hardcoded value ");
	  System.out.println("===========================================================");
	  String string="Advanced Java Programming";
      
	  //Creates a new instance of the StringBuffer 
	  String reverseString = new StringBuffer(string).reverse().toString(); //Method that reverse the String stored temporarily in the String Buffer
      System.out.println("Original String :"+ " "+string);  //Prints out the initial String
      System.out.println("Reversed String: "+ " "+reverseString); //Prints out the String after it is reversed
      System.out.println();
      System.out.println("************************************************************");
     
      //Reverse String using from the value entered by the user.
      System.out.println("===========================================================");
	  System.out.println("               Reversed User Input value ");
	  System.out.println("===========================================================");
      String original, reverseString2 = "";
      @SuppressWarnings("resource")
      Scanner sc = new Scanner(System.in);//Creates an Instance if of Scanner Object to take user's input
      
     
      System.out.print("Enter the String to be reversed :"); //Prompts the user to enter a String
      original = sc.nextLine(); //Stores the String
          
          //Execute the loop that Reverses the String
          int length = original.length();
          for ( int i = length - 1 ; i >= 0 ; i-- )
          {
        	  reverseString2 = reverseString2 + original.charAt(i); 
              
          }
          
      	  System.out.println("Original String :"+ " "+original);
          System.out.println("Reverse of entered string is: "+reverseString2);
          System.out.println("==============================================================");
   }
}
 
