
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top ten by penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Sidney Crosby Statistics");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("Philadelphia Flyers Statistics");
        NHLStatistics.teamStatistics("PHI");
        
        NHLStatistics.sortByPoints();
        
        System.out.println("Anaheim Ducks Statistics");
        NHLStatistics.teamStatistics("ANA");
        
        
        
        
        
        
    }
}
