package Math;

public class TitleToNumber {
    public int titleToNumber(String columnTitle) {
        int answer = 0;
        for (int i = 0; i < columnTitle.length(); i++){
            answer = answer * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return answer;
    }

    //O(n)
}
