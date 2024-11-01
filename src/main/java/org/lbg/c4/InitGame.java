package org.lbg.c4;

import java.util.InputMismatchException;
import java.util.Scanner;


public class InitGame {
    private final Board board;
    private final Scanner scanner;
    int size = 0;
    int maxSize = 10;
    int minSize = 3;
    boolean hasUserFinishedGame = false;

    public InitGame(Scanner scanner){

        this.scanner = scanner;
        this.board = null;
    }
    public void initialiseBoard() {
        System.out.println("Please specify a board size between 3 and 10");
        while (this.size < minSize || this.size > maxSize) {
            try {
                int result = scanner.nextInt();
                if (result < minSize || result > maxSize) {
                    System.out.println("The board size cannot be smaller than 3 or larger than 10");
                } else {
                    size = result;
                }
            } catch (InputMismatchException e) {
                System.out.println("Board size must be an integer value between 3 and 10");
                scanner.nextLine();
            }
        }
    }

    public void letsGo() {

        initialiseBoard();

        Scanner obj = new Scanner(System.in);
        Board board = new Board(size,obj);
        while(hasUserFinishedGame == false){
            System.out.println("Position of player: " + board.p.getXValue() + " " + board.p.getYValue());
            System.out.println("Position of monster: " + board.m.getXValue() + " " + board.m.getYValue());
            System.out.println("Position of treasure: " + board.t.getXValue() + " " + board.t.getYValue());

            if(board.foundTreasure()){
                System.out.println("Good Job bro!");
                hasUserFinishedGame = true;
                break;
            }
            else if(board.foundMonster()){
                System.out.println(board.findMonster().monsterSaysHello());
                hasUserFinishedGame = true;
                break;
            }

            System.out.println("Enter your move player , hope you get the treasure ");
            String val = obj.next().toUpperCase();
            Controls ctrl = Controls.valueOf(val);
            board.findPlayer().shift(ctrl,board.getSize());

        }


    }
}
