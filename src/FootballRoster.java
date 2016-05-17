/**
 * Created by Erik on 5/16/16.
 */
public class FootballRoster {
    static int RosterSize = 53;
    String team;
    String playerName;
    String position;
    int jerseyNumber;
    double height;
    double weight;
    boolean isActive;
    int experience;
    FootballRoster[] roster = new FootballRoster[RosterSize];

    public FootballRoster(String team, String playerName, String position, int jerseyNumber) {
        this.team = team;
        this.playerName = playerName;
        this.position = position;
        this.jerseyNumber = jerseyNumber;

    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String newTeam) {
        team = newTeam;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String newPlayerName) {
        if (isValidName(newPlayerName)) {
            playerName = newPlayerName;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String newPosition) {
        position = newPosition;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int newJerseyNumber) {
        jerseyNumber = newJerseyNumber;
    }

    public static boolean isValidName(String newPlayerName) {
        return newPlayerName.contains(" ");
    }
}
