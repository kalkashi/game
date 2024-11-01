package org.lbg.c4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Board {
    static int size = 0;

    public static void initialiseBoard() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please specify a board size between 3 and 10");
        while (size < 3 || size > 10) {
            try {
                int result = obj.nextInt();
                if(result < 3 || result > 10){
                    System.out.println("The board size cannot be smaller than 3 or larger than 10");
                } else
                {
                    size = result;
                }
            } catch (InputMismatchException e) {
                System.out.println("Board size must be an integer value between 3 and 10");
                obj.nextLine();
            }
        }
    }
}
