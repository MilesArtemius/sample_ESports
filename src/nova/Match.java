package nova;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Match {
    private int winnerID;
    private VideoGame videoGame;
    private Tournament tournament;
    private String status;
    private Serie serie;
    private List<Result> results;
    private List<Player> opponents;
    private String name;
    private String matchType;
    private Live live;
    private League league;
    private int id;
    private ArrayList<Game> games;
    private boolean draw;
    private String beginsAt;



    private class VideoGame {
        private int id;
        private String name;

        private VideoGame(Map<String, Object> game) {
            id = main.toInt(game.get("id"));
            name = (String) game.get("name");
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    private class Result {
        private int playerID;
        private int score;

        private Result(Map<String, Object> result) {
            playerID = main.toInt(result.get("team_id"));
            score = main.toInt(result.get("score"));
        }

        public int getPlayerID() {
            return playerID;
        }

        public int getScore() {
            return score;
        }
    }

    private class Live {
        private String url;
        private boolean supported;
        private String opensAt;

        private Live(Map<String, Object> live) {
            url = (String) live.get("url");
            supported = main.toBoolean(live.get("supported"));
            opensAt = (String) live.get("opens_at");
        }

        public String getUrl() {
            return url;
        }

        public boolean isSupported() {
            return supported;
        }

        public String getOpensAt() {
            return opensAt;
        }
    }



    public Match(@NotNull Map<String, Object> match) {
        beginsAt = main.toString(match.get("begin_at"));

        draw = main.toBoolean(match.get("draw"));

        List<Object> opps = (List<Object>) match.get("opponents");
        opponents = new ArrayList<Player>();
        for (int i = 0; i < opps.size(); i++) {
            opponents.add(new Player((Map<String, Object>) opps.get(i)));
        }

        id = main.toInt(match.get("id"));

        league = new League((Map<String, Object>) match.get("league"));

        live = new Live((Map<String, Object>) match.get("live"));

        matchType = main.toString(match.get("match_type"));

        name = main.toString(match.get("name"));

        List<Object> gms = (List<Object>) match.get("games");
        games = new ArrayList<Game>();
        for (int i = 0; i < gms.size(); i++) {
            games.add(new Game((Map<String, Object>) gms.get(i)));
        }

        serie = new Serie((Map<String, Object>) match.get("serie"));

        status = main.toString(match.get("status"));

        tournament = new Tournament((Map<String, Object>) match.get("tournament"));

        List<Object> res = (List<Object>) match.get("results");
        results = new ArrayList<Result>();
        for (int i = 0; i < res.size(); i++) {
            results.add(new Result((Map<String, Object>) res.get(i)));
        }

        videoGame = new VideoGame((Map<String, Object>) match.get("videogame"));

        winnerID = main.toInt(match.get("winner_id"));
    }

    public int getWinner() {
        return winnerID;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public String getStatus() {
        return status;
    }

    public Serie getSerie() {
        return serie;
    }

    public List<Result> getResults() {
        return results;
    }

    public List<Player> getOpponents() {
        return opponents;
    }

    public String getName() {
        return name;
    }

    public String getMatchType() {
        return matchType;
    }

    public League getLeague() {
        return league;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public boolean isDraw() {
        return draw;
    }

    public String getBeginsAt() {
        return beginsAt;
    }
}
