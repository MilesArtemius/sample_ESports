package nova;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.util.Map;

public class Player {
    private String type;
    private String name;
    private String logoUrl;
    private int ID;
    private String acronym;

    public Player(@NotNull Map<String, Object> player) {
        type = (String) player.get("type");

        if (type.equals("Team")) {
            Map<String, Object> opponent = (Map<String, Object>) player.get("opponent");

            name = main.toString(opponent.get("name"));

            logoUrl = main.toString(opponent.get("image_url"));

            ID = main.toInt(opponent.get("id"));

            acronym = main.toString(opponent.get("acronym"));
        } else {
            System.out.println("NO NO NO NO NO NO NO NO!!!");
        }
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public int getID() {
        return ID;
    }

    public String getAcronym() {
        return acronym;
    }
}
