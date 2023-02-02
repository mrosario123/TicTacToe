package org.example;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){

        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        char currentPlayer = 'X';
        boolean gameOver = false;

        Scanner scanner = new Scanner(System.in);

        while(!gameOver){
            System.out.println("Player " + currentPlayer + ", enter row (0-2):");
            int row = scanner.nextInt();
            System.out.println("Player " + currentPlayer + ", enter column (0-2):");
            int column = scanner.nextInt();

            if(board[row][column] == ' '){
                board[row][column] = currentPlayer;

                if(checkWin(board, currentPlayer)){
                    printBoard(board);
                    System.out.println("Player " + currentPlayer + "wins");
                    gameOver = true;
                }else{

                    if(currentPlayer == 'X'){
                        currentPlayer = 'O';
                    }else {
                        currentPlayer = 'X';
                    }
                }
            }else{
                System.out.println("That spot is already taken. Please try again.");
            }
        }
    }

    public static void printBoard(char[][] board){
        for(int i = 0; i < 3; i++){
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if(i != 2){
                System.out.println("---|---|---");
            }
        }
        System.out.println();
    }

}
