package week7;

public class PowerDecreasing extends Comparator<Weapon>{
    public boolean compare(Weapon a,Weapon b){
        return a.getDamage()>b.getDamage();
    }
}
