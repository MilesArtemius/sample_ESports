package nova;

import org.jetbrains.annotations.Contract;
import org.json.JSONArray;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class main {
    private static HttpURLConnection con;

    public static void main(String[] args) throws MalformedURLException, ProtocolException, IOException {
        /*String token = "k18VBiR9Sr1-acQSG_8QzruEA4NDaYfNK4LFoIo7VNhhmvwRYWI";
        Calendar now = Calendar.getInstance();
        String soCalledUTC = new SimpleDateFormat("yyyy-MM-dd").format(now.getTime());
        String url = "https://api.pandascore.co/matches?filter[begin_at]=" + soCalledUTC + "&sort=begin_at&token=" + token;

        try {

            URL myurl = new URL(url);
            con = (HttpURLConnection) myurl.openConnection();

            con.setRequestMethod("GET");

            File sures = new File("C:\\Users\\miles\\Desktop\\ESports\\file.json");
            FileOutputStream fos = new FileOutputStream(sures);
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String line;
                while ((line = in.readLine()) != null) {
                    fos.write(line.getBytes());
                }
            }

            fos.flush();
            fos.close();

        } finally {

            con.disconnect();
        }*/

        StringBuilder s = new StringBuilder();
        File sures = new File("C:\\Users\\miles\\IdeaProjects\\sample\\src\\nova\\0.json");
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(sures)))) {
            String line;
            while ((line = in.readLine()) != null) {
                s.append(line);
            }
        }

        HashMap<String, Object> hashMap = new HashMap<>(Utility.jsonToMap(s.toString()));

        ArrayList<Object> arr = (ArrayList<Object>) hashMap.get("maps");

        for (int i = 0; i < arr.size(); i++) {
            Match match = new Match((Map<String, Object>) arr.get(i));
        }
    }




    @Contract(value = "null -> !null", pure = true)
    public static String toString(Object obj) {
        if (obj == null) {
            return "null";
        } else {
            return (String) obj;
        }
    }

    @Contract(pure = true)
    public static int toInt(Object obj) {
        if (obj == null) {
            return -1;
        } else {
            return (int) obj;
        }
    }

    @Contract(value = "null -> false", pure = true)
    public static boolean toBoolean(Object obj) {
        if (obj == null) {
            return false;
        } else {
            return (boolean) obj;
        }
    }
}


// streams
// summary
// matches...
// lineup
// picks'n'bans
// tournament
