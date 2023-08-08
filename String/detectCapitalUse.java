package String;

public class detectCapitalUse {

    //Use Buil-in function
    public boolean detectCapitalUse(String word) {
        return word.toUpperCase().equals(word) || word.substring(1).toLowerCase().equals(word.substring(1));
    }
    //O(n)
}
