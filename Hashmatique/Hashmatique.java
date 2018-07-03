import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Come Together", "He wear no shoeshine");
        trackList.put("Let It Be", "Speaking words of wisdom");
        trackList.put("I'm So Tired", "You know it's three weeks...I'm going insane");
        trackList.put("A Day in the Life", "I read the news today ohhh boy");

        System.out.println(trackList.get("Let It Be"));

        Set<String> keys = trackList.keySet();
        for (String key : keys){
            System.out.println("Track: " + key + "   Lyrics: " + trackList.get(key));
        }
    }
}