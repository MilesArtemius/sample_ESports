package nova;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class League {
    private String url;
    private String name;
    private boolean liveSupported;
    private String imageUrl;
    private int ID;

    public League(@NotNull Map<String, Object> league) {
        url = main.toString(league.get("url"));

        name = main.toString(league.get("name"));

        liveSupported = main.toBoolean(league.get("live_supported"));

        imageUrl = main.toString(league.get("image_url"));

        ID = main.toInt(league.get("id"));
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public boolean isLiveSupported() {
        return liveSupported;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getID() {
        return ID;
    }
}
