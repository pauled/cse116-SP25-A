package week7;

public class Closest extends Comparator<Weapon>{
    public boolean compare(Weapon a,Weapon b){
        double aDist=a.getX()*a.getX()+a.getyLoc()*a.getyLoc();
        double bDist=b.getX()*b.getX()+b.getyLoc()*b.getyLoc();
        return aDist<bDist;
    }
}
