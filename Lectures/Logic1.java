/*
  Zhe Dong
  Co Sci 290
  
  String manupulation and user validation
  
  Built-in String functions
  str.length
  str.CharAt(int index) - get a specific character at index
  
  lab- write a program that takes user input in the format of "[number bewteen 0-9] [item]" 
  
*/
public class Logic1{

   public static void main(String[] args){
     
     String str = "Java Rules";
     int num = 10;
     
     for(int index = 0; index < str.length(); index++){
       //first iterartion - index = 0 - "J" - index updates to 1
       //second iterartion - index = 1 - "a" - ndex updates to 2
       System.out.println(str.charAt(index));
       

     }/*
      if(num % 2 == 0){
      System.out.println("This number is even!");
       }
      else{
        System.out.println("This number is odd!");
      }*/
   }/*
    System.out.println(str.substring(0, 4)); //"output" - "java"*/
}