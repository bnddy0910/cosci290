/*
//Zhe Dong
//Co Sci 290

*/

import java.util.Scanner;

public class Lab0213{
  
  public static void main(String[] args){
    
    String name = "";
    String color = "";
    String lastplace = "";
    int age = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("You just wake up from a coma, what's your name?");
    
    name = input.next();
    
    System.out.println(name + "! How old are you?" );
    
    age = input.nextInt();
    
    System.out.println(name + "! What's the last place you remember before the coma?");
    
    lastplace = input.next();
    
    System.out.println("You see a door in front of you, with a key on it, what color is the door");
    
    color = input.next();
    
    System.out.println(color + " door?");
    
    
    
    
    
    
  }
}