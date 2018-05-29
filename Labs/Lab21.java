/*
  Zhe Dong
  Co Sci 290
*/


import java.util.*;
public class Lab21{
  static char[][] board = {
                            {' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}
                          };
  static char xo = 'x';
  static boolean gameOver = false;
    
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int row = 0;
    int col = 0;
    
    while(!gameOver){
      printBoard();
      System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2 for row");
      row = input.nextInt();
      System.out.println("Please enter 0, 1, 2 for col");
      col = input.nextInt();
      move(row, col);
      if(checkWinner()){
        gameOver = true;
      }
    }
    
  }

  public static void printBoard(){
      System.out.println(" " + board[0][0] + " | " + board[1][0] + " | " + board[2][0] + " ");
      System.out.println(" " + board[0][1] + " | " + board[1][1] + " | " + board[2][1] + " ");
      System.out.println(" " + board[0][2] + " | " + board[1][2] + " | " + board[2][2] + " ");
  }
  
  public static void changeXO(){
   if (xo == 'o'){
     xo = 'x';
   }
    else{
      xo = 'o';
    }
    
  }

  public static void move(int row, int col){
      if (board[row][col] == ' '){
        board[row][col] = xo;
        changeXO();
      }
    else{
      System.out.println("Place somewhere else, this one is token");
    }

   
  }
  

  public static boolean checkWinner(){
     if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != ' ' ||
        board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != ' ' || 
        board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != ' ' ||
        board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != ' ' ||
        board[1][0] == board[0][0] && board[1][0] == board[2][0] && board[1][0] != ' ' ||
        board[2][0] == board[0][0] && board[2][0] == board[1][0] && board[2][0] != ' ' ||
        board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != ' ' ||
        board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != ' ' ||
        board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ' ||
        board[2][0] == board[1][1] && board[2][0] == board[0][2] && board[2][0] != ' ' ){
      printBoard();
      changeXO();
      System.out.println("Player " + xo + " is the winner!");
    }
        else{        
          
        }
      return false;
  }
  
 
}
