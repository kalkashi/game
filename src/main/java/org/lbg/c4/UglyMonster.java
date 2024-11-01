package org.lbg.c4;

public class UglyMonster extends Monster {
    public UglyMonster(int x,int y){
        super(x,y);
    }
    @Override
    public String monsterSaysHello(){
        return("Ugly Monster has devoured you in a rather ugly way");
    }
}
