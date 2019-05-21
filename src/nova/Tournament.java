package nova;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.util.Map;

public class Tournament {
    private int winnerID;
    private int serieID;
    private String name;
    private int leagueID;
    private int ID;
    private String beginAt;
    private String endAt;

    public Tournament(@NotNull Map<String, Object> tournament) {
        winnerID = main.toInt(tournament.get("winner_id"));

        serieID = main.toInt(tournament.get("serie_id"));

        name = main.toString(tournament.get("name"));

        leagueID = main.toInt(tournament.get("league_id"));

        ID = main.toInt(tournament.get("id"));

        beginAt = main.toString(tournament.get("begin_at"));

        endAt = main.toString(tournament.get("end_at"));
    }

    public int getWinnerID() {
        return winnerID;
    }

    public int getSerieID() {
        return serieID;
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

    public String getBeginAt() {
        return beginAt;
    }

    public String getEndAt() {
        return endAt;
    }
}
