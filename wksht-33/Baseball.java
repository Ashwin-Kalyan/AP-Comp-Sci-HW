
/**
 * Solutions to wksht 3.3
 *
 * @author Ashwin Kalyan
 * @version 2-13-24
 */
public class Baseball extends SportsTeam
{
    private int homeruns;
    private int RBIs;
    private int errors;

    public Baseball(String teamName)
    {
        super(teamName);
        homeruns = 0;
        RBIs = 0;
        errors = 0;
    }
    
    public Baseball(String teamName, int gamesWon, int gamesLost, int gamesTied, int gamesPlayed, int homeruns, int RBIs, int errors) {
        super(teamName, gamesPlayed, gamesWon, gamesLost, gamesTied);
        this.homeruns = homeruns;
        this.RBIs = RBIs;
        this.errors = errors;
    }

    public double homeRunsPerGame() {
        double dHomeRuns = (double) homeruns;
        double dGamesPlayed = (double) super.gamesPlayed;
        
        double HomeRunsPerGame = dHomeRuns / dGamesPlayed;
        return HomeRunsPerGame;
    }
    
    public double rbisPerGame() {
        double dRBIs = (double) RBIs;
        double dGamesPlayed = (double) super.gamesPlayed;
        
        double rbisPerGame = dRBIs / dGamesPlayed;
        return rbisPerGame;
    }
    
    public double errorsPerGame() {
        double dErrors = (double) errors;
        double dGamesPlayed = (double) super.gamesPlayed;
        
        double errorsPerGame = dErrors / dGamesPlayed;
        return errorsPerGame;
    }
    
    @Override public String toString() {
        return super.toString() + "\nTotal Home Runs: " + homeruns + "\nTotal RBIs: " + RBIs + "\nTotal Errors: " + errors;
    }
}
