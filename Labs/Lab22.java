/*
  Zhe Dong
  Co Sci 290
*/

import java.util.*;

 public class Lab22{
 
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
     int row = 0;
     int col = 0;
    
     System.out.println("Let's play Connect 4!");
     while(!gameOver){
        printBoard();
        System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2, 3, 4, 5 for row");
        row = input.nextInt();
        System.out.println("Please enter 0, 1, 2, 3, 4, 5 for col");
        col = input.nextInt();
        move(row, col);
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

    public static void move(int row, int col){
      if(board[row][col] == 'x'||board[row][col] == 'o'){
        System.out.println("Place somewhere else, this one is token");
      }
        else{
          board[row][col] = xo;
          changeXO();
        }  
    }
    
    public static boolean checkWinner(){
      int n =0;

	  if(board [5][n]==board[5][n+1] && board[5][n+1] == board[5][n+2] && board[5][n+2] == board[5][n+3] && (board [5][n]=='x' || board [5][n]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [4][n]==board[4][n+1] && board[4][n+1] == board[4][n+2] && board[4][n+2] == board[4][n+3] && (board [4][n]=='x' || board [4][n]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [3][n]==board[3][n+1] && board[3][n+1] == board[3][n+2] && board[3][n+2] == board[3][n+3] && (board [3][n]=='x' || board [3][n]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      } 
      else if(board [2][n]==board[2][n+1] && board[2][n+1] == board[2][n+2] && board[2][n+2] == board[2][n+3] && (board [2][n]=='x' || board [2][n]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [1][n]==board[1][n+1] && board[1][n+1] == board[1][n+2] && board[1][n+2] == board[1][n+3] && (board [1][n]=='x' || board [1][n]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [n][n]==board[n][n+1] && board[n][n+1] == board[n][n+2] && board[n][n+2] == board[n][n+3] && (board [n][n]=='x' || board [n][n]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [n][5]==board[n+1][5] && board[n+1][5] == board[n+2][5] && board[n+2][5] == board[n+3][5] && (board [n][5]=='x' || board [n][5]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [n][4]==board[n+1][4] && board[n+1][4] == board[n+2][4] && board[n+2][4] == board[n+3][4] && (board [n][4]=='x' || board [n][4]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [n][3]==board[n+1][3] && board[n+1][3] == board[n+2][3] && board[n+2][3] == board[n+3][3] && (board [n][3]=='x' || board [n][3]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [n][2]==board[n+1][2] && board[n+1][2] == board[n+2][2] && board[n+2][2] == board[n+3][2] && (board [n][2]=='x' || board [n][2]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [n][1]==board[n+1][1] && board[n+1][1] == board[n+2][1] && board[n+2][1] == board[n+3][1] && (board [n][1]=='x' || board [n][1]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      } 
      else if(board [n][n]==board[n+1][n] && board[n+1][n] == board[n+2][n] && board[n+2][n] == board[n+3][n] && (board [n][n]=='x' || board [n][n]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }  
      else if(board [5][5]==board[4][4] && board[4][4] == board[3][3] && board[3][3] == board[2][2] && (board [5][5]=='x' || board [5][5]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [5][4]==board[4][3] && board[4][3] == board[3][2] && board[3][2] == board[2][1] && (board [5][4]=='x' || board [5][4]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [5][3]==board[4][2] && board[4][2] == board[3][1] && board[3][1] == board[2][0] && (board [5][3]=='x' || board [5][3]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [5][2]==board[4][3] && board[4][3] == board[3][4] && board[3][4] == board[2][5] && (board [5][2]=='x' || board [5][2]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [5][1]==board[4][2] && board[4][2] == board[3][3] && board[3][3] == board[2][4] && (board [5][1]=='x' || board [5][1]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
      else if(board [5][0]==board[4][1] && board[4][1] == board[3][2] && board[3][2] == board[2][3] && (board [5][0]=='x' || board [5][0]=='o')){
        changeXO();
        printBoard();
        System.out.println(xo + " is the winner!!!!");          
        return true;
      }
    else
      return false;

    
  }
  
}