package nova;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.util.Map;

public class Serie {
    private int year;
    private int winnerID;
    private String season;
    private String prizePool;
    private String name;
    private int leagueID;
    private int ID;
    private String fullName;
    private String description;
    private String beginAt;
    private String endAt;

    public Serie(@NotNull Map<String, Object> serie) {
        year = main.toInt(serie.get("year"));

        winnerID = main.toInt(serie.get("winner_id"));

        season = main.toString(serie.get("season"));

        prizePool = main.toString(serie.get("prizepool"));

        name = main.toString(serie.get("name"));

        leagueID = main.toInt(serie.get("league_id"));

        ID = main.toInt(serie.get("id"));

        fullName = main.toString(serie.get("full_name"));

        description = main.toString(serie.get("description"));

        beginAt = main.toString(serie.get("begin_at"));

        endAt = main.toString(serie.get("end_at"));
    }

    public int getYear() {
        return year;
    }

    public int getWinnerID() {
        return winnerID;
    }

    public String getSeason() {
        return season;
    }

    public String getPrizePool() {
        return prizePool;
    }

    public String getName() {
        return name;
    }

    public int getLeagueID() {
        return leagueID;
    }

    public int getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDescription() {
        return description;
    }

    public String getBeginAt() {
        return beginAt;
    }

    public String getEndAt() {
        return endAt;
    }
}
