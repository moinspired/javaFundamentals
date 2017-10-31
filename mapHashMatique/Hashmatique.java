import java.util.HashMap;

public class Hashmatique{

    public static void main(String[] args){
    HashMap<String, String> songs = new HashMap<>();
    songs.put("The Boloody Win", "Lyrics1");
    songs.put("Close", "Lyrics2");
    songs.put("Praise", "Lyrics3");
    songs.put("One Way", "Lyrics2=4");
    
    for (String s: songs.keySet()){
        System.out.println(s);
    }

    }   

}