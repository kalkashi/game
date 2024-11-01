package org.lbg.c4;

public class Player {
    int x;
    int y;

    public Player(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getXValue(){
        return x;
    }

    public int getYValue(){
        return y;
    }

    public void shift(Controls ctrl, int size){
        if(ctrl == Controls.UP){
            if(y>0){
                y = y-1;
            }
            else {
                System.out.println("INVALID MOVE");
            }
        }

        if(ctrl == Controls.DOWN){
            if(y<size-1){
                y = y+1;
            }
            else {
                System.out.println("INVALID MOVE");
            }
        }

        if(ctrl == Controls.RIGHT){
            if(x<size-1){
                x = x+1;
            }
            else {
                System.out.println("INVALID MOVE");
            }
        }

        if(ctrl == Controls.LEFT){
            if(x>0){
                x = x-1;
            }
            else {
                System.out.println("INVALID MOVE");
            }
        }


    }
}
