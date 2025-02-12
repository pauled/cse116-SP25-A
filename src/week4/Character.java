package week4;

public class Character {
    private int battleWon;
    private int expPts;

    public Character(){
        this.battleWon=0;
        this.expPts=0;
    }
    public void winBattle(int xp){
        this.battleWon++;
        this.expPts+=xp;
    }
    public String toString(){
        String out="battles won: "+this.battleWon;
        out+=" xp: "+this.expPts+"\n";
        return out;
    }
}
