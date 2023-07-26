package Math;

public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] text = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        String vowels = "ueoaiUEOAI";

        while (left < right){
            while (left < right && vowels.indexOf(text[left]) == -1){
                left++;
            }

            while (left < right && vowels.indexOf(text[right]) == -1){
                right--;
            }

            char temp = text[left];
            text[left] = text[right];
            text[right] = temp;

            left++;
            right--;
        }
        String answer = new String(text);
        return answer;
    }
}

//O(n^2)
