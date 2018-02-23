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

public class HW1{
  
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  int minimum = 1;
  int maximum = 100;
  String name = "";
  String lastplace = "";
  String color = "";
  System.out.println(Math.random());
  int randomNum = minimum + (int)(Math.random() * maximum);
  
  System.out.println( " ___________                                 ._.  \n"
                      + " \\_  _____/ ______  ______  _____    ______   ____| |  \n" 
                      + "  |    __)_ /  ___/ / _____\\__  \\ \\__  _\\_/ __ \\ |  \n"
                      + "  |        \\___  \\ \\___  / __ \\|  |_  > >  ___/\\|  \n"
                      + " /_______  /____  > \\_____| >____  /   __/  \\___  >_  \n"
                      + "        \\/    \\/    \\/    \\/|__  |__|     \\/\\/   ");
    System.out.println("You just wake up from a coma, what's your name?");
    
    name = input.next();
    
    System.out.println(name + "! What's the last place you remember before the coma?");
    
    lastplace = input.next();
    
    System.out.println("What is you favorite color?");
    
    color = input.next();
    
    System.out.println("You have been choosen to play a tower escape game , here's the rules, you will choose from four doors, if you choose the right doors, you will go up, if you choose the wrong doors, you will go down, when you reach the top of the twoer, you win. do you want to continue? Yes or No?");
    
    System.out.println("Just kidding, you have to play, make you choice wisely " + name + ", casue if you don't, you will stack in this tower for every!");
    
    System.out.println("There's four " + color + " doors showes up, door 1 is in front of you, door 2 on your left and 3 on the right, and 4 behind you, which one do you choose to open?");
    
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
    System.out.println("The floor disappear, you fall to the bottom floor!");}
      
    System.out.println(" _______  _______  __   __  _______    _______  __   __  _______  ______    __  \n"
                     + "|       ||   _   ||  |_|  ||       |  |       ||  | |  ||       ||    _ |  |  | \n"
                     + "|    ___||  |_|  ||       ||    ___|  |   _   ||  |_|  ||    ___||   | ||  |  | \n"
                     + "|   | __ |       ||       ||   |___   |  | |  ||       ||   |___ |   |_||_ |  | \n"
                     + "|   ||  ||       ||       ||    ___|  |  |_|  ||       ||    ___||    __  ||__| \n"
                     + "|   |_| ||   _   || ||_|| ||   |___   |       | |     | |   |___ |   |  | | __  \n"
                     + "|_______||__| |__||_|   |_||_______|  |_______|  |___|  |_______||___|  |_||__| \n");

   
  
  
  }
}