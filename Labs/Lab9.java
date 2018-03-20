/*
  Zhe Dong
  Co Sci 290
  Lab 9
*/


import java.util.Scanner;
public class Lab9{
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
   
    System.out.println("Enter an integer");
    int number= input.nextInt();
    
    //System.out.println(reverse(input.nextInt()));
    
    if(isPalindrome(number)){
    System.out.println(number + " This integer is a palindrome");
    }
    else{
      System.out.println(number + " This integer is not a palindrome");
    }
   
  }
    
    public static int reverse(int number){
      boolean isNegative = number < 0 ? true : false;
      if(isNegative){
        number = number * -1;
      }
      int reverse = 0;
      int lastDigit = 0;
      
      while(number >= 1){
        lastDigit = number % 10;
        reverse = reverse * 10 + lastDigit;
        number = number / 10;
      }
      return isNegative == true? reverse*-1 : reverse;
    }
  
  public static boolean isPalindrome(int number){
    boolean palindrome;
    palindrome = number == reverse(number);
    return palindrome;
    
  }
}