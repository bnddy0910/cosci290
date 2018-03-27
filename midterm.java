/*
  Zhe Dong
  Co Sci 290
*/

import java.util.Scanner;
public class midterm{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number n");
    
    int n = input.nextInt();
    
      printMatrix(n);
    System.out.println("-------------------------------");
      printMatries(n);
  }  
   public static void printMatrix(int n){
     
       for(int i = 0; i < n; i++){
         for(int j = 0; j < n; j++){

       System.out.print((int)(Math.random() * 11) + " ");
       }
         System.out.println();
     }

   }
  public static void printMatries(int n){
     
       for(int i = 0; i < n; i++){
         for(int j = 0; j < n; j++){

       System.out.print((int)(Math.random() * 11) + " ");
       }
         System.out.println();
     }

   }
  
}