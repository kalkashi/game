package org.lbg.c4;
import java.util.Random;
public class MonsterDB {
    static Random r = new Random();

    public static Monster create(int x,int y){
        int typeOfMonster = r.nextInt();
        if(typeOfMonster == 0){
            return new UglyMonster(x,y);
        }
        else if(typeOfMonster == 1){
            return new WeirdMonster(x,y);
        }
        return new CoolMonster(x,y);

    }
}
