import java.util.*;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map hp = new HashMap<Character, String>();
        Map hs = new HashMap<String, Character>();

        String[] words = s.split(" ");

        if (words.length != pattern.length()){
            return false;
        }

        for (int i=0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            if (hp.containsKey(c)){
                if (!hp.get(c).equals(words[i])){
                    return false;
                }
            }
            hp.put(c, words[i]);

            if (hs.containsKey(words[i])){
                if (!hs.get(words[i]).equals(c)){
                    return false;
                }
            }
            hs.put(words[i], c);
        }

        return true;
    }
}
