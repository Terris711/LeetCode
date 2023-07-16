package Array;


public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int patternLength = p.length();
        int start = 0;

        int[] pattern = new int[27];
        int[] string = new int[27];

        List<Integer> answer = new ArrayList<>();

        // Find ascii value in p
        for (int i = 0; i < p.length(); i++){
            pattern[p.charAt(i) - 'a']++;
        }

        // Find ascii value in s
        for (int i = 0; i < s.length(); i++ ){
            string[s.charAt(i) - 'a'] ++;
            if ( i - start == patternLength){
                string[s.charAt(start) - 'a'] --;
                start ++;
            }

            if(Arrays.equals(pattern, string)){
                answer.add(start);
            }
        }

        return answer;
    }
}
