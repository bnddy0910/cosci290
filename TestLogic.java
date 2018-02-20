/*
  Zhe Dong
  Co Sci 290
  
  Topics:
  -multi-way if-else
  -logical operators
  -symbolic logical
  
*/

import java.util.Scanner;
public class TestLogic{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    
    int grade = input.nextInt();
    
    //int grade = 90;
    
    //sample if
    if(grade >= 90){
      System.out.println("A");
    }
    
    //two-way if-else
    if(grade < 90){
      System.out.println("grade is not an A");
    }
    else{
      System.out.println("grade is an A");
    }
    
    //multi if - else if - else
    if(grade >= 90){
      System.out.println("A");
    }
    else if(grade >= 80){
      System.out.println("B");
    }
    else if (grade >= 70){
      System.out.println("C");
    }
    else{
      System.out.println("F");
    }
    
    /*
      Logical operators
      
      ! - NOT
      != - NOT equal to
      == - is equal to
      && - AND
      || - OR
    */  
    
    //using if-else, write code that checks whether
    //a student grade is good, avarage, or bad
    if(grade >= 80){
      System.out.println("This is a good grade.");
    }
    else if(grade < 80 && grade >= 70){
      System.out.println("This grade is average.");
    }  
    else{
      System.out.println("This is a bad grade");
    }
    
  }
}