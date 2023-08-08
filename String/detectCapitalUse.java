package String;

public class detectCapitalUse {

    //Use Buil-in function
    public boolean detectCapitalUse(String word) {
        return word.toUpperCase().equals(word) || word.substring(1).toLowerCase().equals(word.substring(1));
    }
    //O(n)


    public boolean detectCapitalUseImpl(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                count++;
            }
        }

        if (count == 0 || count == word.length() || (count == 1 && word.charAt(0) >= 'A') && word.charAt(0) <= 'Z'){
            return true;
        }
        return false;
    }

    //O(n)

}
