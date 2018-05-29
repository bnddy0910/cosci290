/*
  Zhe Dong
  Co Sci 290
*/

public class Lab20{
  public static void main(String[] args){
    
    int[][] array = new int [5][6];
    

    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 6; j++){
        array[i][j] = 1 + (int)(Math.random() * 8) + 1;
        System.out.print(array[i][j] + " ");
      }    

      System.out.print("\n");
    }
    
    int[] array2 = sumOfRows(array);
    for(int k = 0; k < 5; k++){
        System.out.println(array2[k]);
      }    
    
  }
  

  public static int[] sumOfRows(int[][] sum){
    
    int addThemUp = 0;
    int[] addition = new int[5];
    int index = 0;
    
     for(int i = 0; i < sum.length; i++){
      for(int j = 0; j < sum[i].length; j++){
        addThemUp += sum[i][j];

      }
       
       addition[index] = addThemUp;
       index++;
       System.out.print("\n");
    }
    
    return addition;
  }
}