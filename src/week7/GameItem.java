package week7;

import week10.Player;
import week10.Usable;
import week10.Useless;

public abstract class GameItem implements Usable, Useless {
    protected double xLoc;
    protected double yLoc;

    public GameItem(double xLoc,double yLoc){
        this.xLoc=xLoc;
        this.yLoc=yLoc;
    }
    public void move(double dx,double dy){
        this.xLoc+=dx;
        this.yLoc+=dy;
    }

    public double getxLoc() {
        return xLoc;
    }

    public double getyLoc() {
        return yLoc;
    }

    //public abstract void use(Player player);
    public String toString(){
        String out="loc: ("+this.getxLoc()+","+this.getyLoc()+") ";
        return out;
    }
    public String toString2(){
        return super.toString();
    }
}
