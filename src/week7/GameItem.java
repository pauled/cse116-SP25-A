package week7;

import week4.Player;

public class GameItem {
    private double xLoc;
    private double yLoc;

    public GameItem(double xLoc,double yLoc){
        this.xLoc=xLoc;
        this.yLoc=yLoc;
    }
    public void use(Player player){}
    public String toString(){
        String out="loc: ("+this.xLoc+","+this.yLoc+") ";
        return out;
    }
}
