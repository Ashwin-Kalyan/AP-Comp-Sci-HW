
/**
 * Solutions to wksht 3.3
 *
 * @author Ashwin Kalyan
 * @version 2-13-24
 */
public class SportsTeam
{
    public String teamName;
    public int gamesPlayed;
    public int gamesWon;
    public int gamesLost;
    public int gamesTied;

    public SportsTeam(String teamName)
    {
       this.teamName = teamName;
       gamesPlayed = 0;
       gamesWon = 0;
       gamesLost = 0;
       gamesTied = 0;
    }
    
    public SportsTeam(String teamName, int gamesPlayed, int gamesWon, int gamesLost, int gamesTied) 
    { 
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.gamesTied = gamesTied;
    }
    
    public int getWinningPercentage() {
        double dGamesWon = (double) gamesWon;
        double dGamesPlayed = (double) gamesPlayed;
        
        int winPerc = (int) ((dGamesWon / dGamesPlayed) * 100);
        return winPerc;
    }

    public String getTeamName() {
        return teamName;
    }
    
    public int getGamesPlayed() {
        return gamesPlayed;
    }
    
    public int getGamesWon() {
        return gamesWon;
    }
    
    public int getGamesLost() {
        return gamesLost;
    }
    
    public int getGamesTied() {
        return gamesTied;
    }
    
    public void playGame(String result) {
        gamesPlayed++;
        
        if (result.equals("W")) {
            gamesWon++;            
        } else if (result.equals("L")) {
            gamesLost++;
        } else {
            gamesTied++;
        }
    }
    
    public String toString() {
        return "Team Name: " + teamName + "\nTotal Games Played: " + gamesPlayed + "\nTotal Games Won: " + gamesWon + "\nTotal Games Lost: " + gamesLost + "\nTotal Games Tied: " + gamesTied; 
    }
}
