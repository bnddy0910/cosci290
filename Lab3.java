/*
Zhe Dong
Co Sci 290

Lab 3
*/



public class Lab3{  
  public static void main(String[] args){
  
  int minimum = 1;
  int maximum = 100;
  System.out.println(Math.random());
  int randomNum = minimum + (int)(Math.random() * maximum);
  
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
}

}

  