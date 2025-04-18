package week12.Madden;

public class QB extends Position{
    public QB(Player player){
        super(player);
    }
    public int genOverall(){
        int overall=this.stats.getSpd()*100;//math stuff
        return overall;
    }

}
