/*
  Zhe Dong
  CoSci 290
  
  HW1 Instructions
  1. Create a class called "GameDriver" and save/name the file "GameDriver.java".
  2. The program shold start up with your text aventure splash screen (it would 
      be a good idea to use the one from Lab 1).
  3. Next, the program should have a print out of some storytelling that starts
      the text adventure.
  4. Then set up the game with questions asked from the user to start the text
      adventure (use same questions from Lab 2).
      TIP: Use Math.random and if-else to randomize elements in the game based 
        on user input. 
  5. When the game is over, end the program with a "GAME OVER" message.
  
  REMEMBER: 
  *Declare all your variables at the beginning of the program.
      
*/

//imports used in this class
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GameDriver{
  
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  Utility tool = new Utility();
  int minimum = 1;
  int maximum = 100;
  String name = "";
  String lastplace = "";
  String color = "";
  System.out.println(Math.random());
  int randomNum = minimum + (int)(Math.random() * maximum);
  tool.readfile("Storytext.txt");
  
  System.out.println( "");
    
    name = input.next();
    
    System.out.println(name + "! What's the last place you remember before the coma?");
    
    lastplace = input.next();
    
    tool.readfile("color.txt");
    
    color = input.next();
    
    tool.readfile("question.txt");
    
    System.out.println("Just kidding, you have to play, make you choice wisely " + name + ", casue if you don't, you will be trap in this tower forevery!");
    
    System.out.println("There's four " + color + " doors showes up, door 1 is in front of you, door 2 on your left and 3 on the right, and 4 behind you, which one do you choose to open?");
    
    randomNum = input.nextInt();
    
    if(randomNum >= 98){
    System.out.println("The door right in front of you open, it's an elevator, it takes you up 3 floors!");
  }
  
    if(randomNum >=75 && randomNum <98){
    System.out.println("The door on your left hand side open, it's a stairs that takes you 1 floor up.");
  }
  
    if(randomNum >=20 && randomNum <75){
    System.out.println("The door on your right hand side open, it's a stairs that takes you 1 floor down.");
  }
  
    else{
    System.out.println("The floor disappear, you fall to the bottom floor!");
    }
      
    tool.readfile("gameover.txt");

   
  
  
  }
}