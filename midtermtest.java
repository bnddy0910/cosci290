//not the real midterm project, just testing some random thing


import java.util.Scanner;
public class midtermtest{
  
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number n");
    
    int n = input.nextInt();
    final int NUMS_PER_LINE = n;
      
      printMatrix(n);
  }  
   public static void printMatrix(int n){
     
       for(int i = 0; i < n; i++){
         for(int k = 0; k < n; k++){
       int random = 0 + (int)(Math.random() * 11);
           if((i + 1) % NUMS_PER_LINE == 0)
             System.out.print(random);
       if((i + 1) % NUMS_PER_LINE ==0)
         System.out.print(random);
           else
       System.out.print(random);
       }
     }

   }
  
}