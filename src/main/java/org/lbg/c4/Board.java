package org.lbg.c4;
import java.util.Scanner;

public class Board {
    static int size = 0;

    public static void initialiseBoard() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please specify a board size between 3 and 10");
        while (size < 3 || size > 10) {
            try {
                size=obj.nextInt();
                if(size<3 || size>10){
                    System.out.println("Please specify a board size between 3 and 10");
                }
            } catch (Exception e) {
                System.out.println("Please enter an integer");
            }
        }
    }
}
