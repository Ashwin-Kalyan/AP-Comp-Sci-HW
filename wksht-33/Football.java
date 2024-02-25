
/**
 * Solutions to wksht 3.3
 *
 * @author Ashwin Kalyan
 * @version 2-13-24
 */
public class Football extends SportsTeam
{
    private int touchDowns;
    private int interceptions;

    public Football(String teamName)
    {
        super(teamName);
        touchDowns = 0;
        interceptions = 0;
    }
    
    public Football(String teamName, int touchDowns, int interceptions, int gamesWon, int gamesLost, int gamesTied, int gamesPlayed) {
        super(teamName, gamesPlayed, gamesWon, gamesLost, gamesTied);
        this.touchDowns = touchDowns;
        this.interceptions = interceptions;
    }

    public double touchDownsPerGame() {
        double dTouchDowns = (double) touchDowns;
        double dGamesPlayed = (double) super.gamesPlayed;
        
        double touchDownsPerGame = dTouchDowns / dGamesPlayed;
        return touchDownsPerGame;
    }
    
    public double interceptionsPerGame() {
        double dInterceptions = (double) interceptions;
        double dGamesPlayed = (double) super.gamesPlayed;
        
        double interceptionsPerGame = dInterceptions / dGamesPlayed;
        return interceptionsPerGame;
    }
    
    @Override public String toString() {
        return super.toString() + "\nTotal Interceptions: " + interceptions + "\nTotal Touch Downs: " + touchDowns;
    }
}
