package nova;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class Game {
    private int winnerID;
    private int position;
    private int matchID;
    private int length;
    private int ID;
    private boolean finished;
    private String beginAt;

    public Game(@NotNull Map<String, Object> game) {
        matchID = main.toInt(game.get("match_id"));

        finished = main.toBoolean(game.get("finished"));

        ID = main.toInt(game.get("id"));

        beginAt = main.toString(game.get("begin_at"));

        position = main.toInt(game.get("position"));

        winnerID = main.toInt(((Map<String, Object>) game.get("winner")).get("id"));

        length = main.toInt(game.get("length"));
    }

    public int getWinnerID() {
        return winnerID;
    }

    public int getPosition() {
        return position;
    }

    public int getMatchID() {
        return matchID;
    }

    public int getLength() {
        return length;
    }

    public int getID() {
        return ID;
    }

    public boolean isFinished() {
        return finished;
    }

    public String getBeginAt() {
        return beginAt;
    }
}
