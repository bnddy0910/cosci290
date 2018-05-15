import java.util.Random;

public class Test1234{
    static Random randGenObj = new Random();
    public static void main(String[] args){
        int nameLength = 3;
        //My name is Zhe, so using 3
        int arr1[] = new int[nameLength];
        int arr2[] = new int[nameLength];

        for(int i = 0;i < nameLength;i++){
            arr1[i] = randomIntGenerator();
            arr2[i] = randomIntGenerator();
        }

        int oddCount = 0;
        int evenCount = 0;
 
        for(int i = 0;i < nameLength;i++){
            if(isEven(arr1[i]))
                evenCount++;
            if(isEven(arr2[i]))
                evenCount++;
        }
        
        oddCount = 2*nameLength - evenCount;
        System.out.println("Odd Number Count : "+oddCount);
        System.out.println("Even Number Count : "+evenCount);
        int even[] = new int[evenCount];
        int odd[] = new int[oddCount];
        
        int evenCounter = 0;
        int oddCounter = 0;
        
        for(int i = 0;i < nameLength;i++){
            if(isEven(arr1[i])){
                even[evenCounter] = arr1[i];
                evenCounter++;
            }
            else
            {
                odd[oddCounter] = arr1[i];
                oddCounter++;
            }
            
            if(isEven(arr2[i]))
            {
                even[evenCounter] = arr2[i];
                evenCounter++;
            }
            else
            {
                odd[oddCounter] = arr2[i];
                oddCounter++;
            }
        }
        
        for(int i = 0;i < oddCounter;i++){
            System.out.print(odd[i]+" : ");
        }
        System.out.println();
        for(int i = 0;i < evenCounter;i++){
            System.out.print(even[i]+" : ");
        }
    }
    static int randomIntGenerator(){      
        return randGenObj.nextInt(10);
    }
    
    static boolean isEven(int number){
        if(number % 2 == 0)
            return true;
        return false;
    }
}