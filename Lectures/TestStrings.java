/*
  Zhe Dong
  Co Sci 290

  Demo on the String class
*/

import java.util.Scanner;
public class TestStrings{

  //main method
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
   
    int nameLength = 0;
    String answer = input.next();
    boolean flag = false;
    
    /*
      Using Pseduocode write your logic
      
      while the user gives a name that is less than 2 characters(
      
        check if  input is < two characters
        now check if input is < 2 letterns)
       
    */
    
    
    while(nameLength < 2){
        System.out.println("What is your name?");  
    
      //check if name is less than 2 characters
       if(answer.length() < 2 || flag){
      System.out.println("Please enter in a name that is at least two character long and no number");
      }
      else{//name is at least 2 characters
        
        //check if name contains letters
        
        //for example, Logan
        //name.charAt(0) to look at the character in index 0
        
        //use a for-loop because we know how many letter it has 
        for(int index = 0; index < answer.length(); index++){
          
          //check if the character is a number
          if(!Character.isLetter(answer.charAt(index))){// if it is not a letter
            flag = true;
            break;
           
          }
          
        }
        
      }
      
      nameLength = answer.length();
    
    }
    

    
    /*
      name.length() - gives a int of how many characters the String is long
    */
    
    
   
    
    /*
      answer.toLowerCase() = makes all letters lowercase
      answer.toUpperCase() = makes all letters uppercase
      answer.equals("some other string") - checks if two Strings are exactly the same
     
   */
    
    
    /*
    System.out.println("Are you rich? Yes or No?");
    
    if(answer.equalsIgnoreCase("No")){
      System.out.println("That sucks!");
    }
    else{
      System.out.println("Cool!");
    }
    */
  }
}

