package com.chess;

import com.chess.models.Square;
import com.chess.piece.Empty;

import static com.chess.Board.*;

public class Main {


    //White start from [0][0]
  static   Square[][]  board = new Square[8][8];






    public static   void init(){
        // Assign white
        for(int i=0;i<2;i++){
            for(int j=0;j<8;j++){
                 board[i][j] = new Square(i,j,setPiece(i,j));
            }
        }
        // Assign Black
        for(int i=7;i>=6;i--){
            for(int j=0;j<8;j++){
                board[i][j] = new Square(i,j,setPiece(i,j));
            }
        }
        // Assign Empty
        for (int i=2;i<6;i++){
            for (int j=0;j<8;j++){
                board[i][j] = new Square(i,j,new Empty(i,j));
            }
        }
     }






    public static void main(String[] args) {
         init();
         Game game = new Game(board);
         game.startGame();







        }

    }
