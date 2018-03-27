/*
  Zhe Dong
  Co Sci 290
*/

import java.util.Scanner;
public class Lab11{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number n");
    int n = input.nextInt();

    printMatrix(n);
    
  }
  
  public static void printMatrix(int n){
    
    
    do{
      for(int i = 0; i < n; i++){
        int random = 0 + (int)(Math.random() * 2);
        System.out.println(random);
      }
      while(System.out.println(random));
      count++;
      return;
      }
    }
  }