/*
  Zhe Dong
  Co Sci 290
*/

import java.util.Random;

public class Quiz2{
    static Random randGenObj = new Random();
      public static void main(String[] args){
        int nameLength = 3;
        //My name is Zhe, so using 3
        int arr1[] = new int[nameLength];
        int arr2[] = new int[nameLength];
        System.out.print(arr1);
        System.out.print(arr2);
        
        for(int i = 0;i < nameLength;i++){
            arr1[i] = randomIntGenerator();
            arr2[i] = randomIntGenerator();
        }
    }
    
    static int randomIntGenerator(){      
        return randGenObj.nextInt(1000);
    }
}