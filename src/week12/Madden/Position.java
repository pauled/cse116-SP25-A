package week12.Madden;

public abstract class Position {
    protected Player stats;

    public Position(Player player){
        this.stats=player;
    }
    public abstract int genOverall();
    public void becomeHB(){
        this.stats.setStat(new HB(this.stats));
    }
}
