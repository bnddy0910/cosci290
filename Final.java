/*
  Zhe Dong
  Co Sci 290
*/


import java.util.*;
public class Final{
   static char[][] board = {
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '}
                          };
    static char xo = 'x';
    static boolean gameOver = false;

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int col = 0;
    System.out.println("Let's play Connect 4!");
    while(!gameOver){
      printBoard();
      System.out.println("Please enter 0, 1, 2, 3, 4, 5 for col");
      col = input.nextInt();
      generate(int col);
      if(checkWinner()){
        gameOver = true;
      }
    }   
  }
  
  public static void printBoard(){
        for (int i = 0; i < 6; i++) {
            System.out.print("| ");
            for (int j = 0; j < 6; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }     
  }
  
  public static void changeXO(){
    
	if(xo == 'x'){
	  xo = 'o';
	}
    else{
	  xo = 'x';
    }
  }

  public static void generate(int col){
    for(row = 0; row < 6; row++){
      if(row == 5){
        board[row][col] = xo;
        break;
         }
      else if (board[row + 1][col] != ' '){
        board[row][col] = xo;
        break;
      }
    }
    
    
    
    
    
    changeXO();
    
  }
}