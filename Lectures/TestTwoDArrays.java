/*
  Zhe Dong
  Co Sci 290
*/


public class TestTwoDArrays{

public static void main(String[] arus){
  
  //declare 2 D arrays
  String[][] words = new String[3][2];
  /*
    {
    (null , null),
    (null , null),
    (null , null)
    }
  */
  
  //get first element in 2d array
  words[0][0] = "cat";
  
  //get element in 2d array
  System.out.println(words[0][0]);
  System.out.println(words[0][1]);
  
  //iterate through array and assign value using loops
  for(int i = 0; i < words.length; i++){ //goes through each row
    for(int j = 0; j < words[i].length; j++){ // goes through each column
      words[i][j] = i * j + " cats"; //assign
    System.out.println(words[i][j]); //print
    } 
  }
  
  System.out.println(print2DArray(words));
  }
  
  public String print2DArray(String[][] array){
    
    String concat = "";
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[i].length; j++){
        concat = concat + array[i][j] + " ";
      }
    }
    return concat;
  }
}