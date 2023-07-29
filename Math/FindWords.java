package Math;

public class FindWords {
    public String[] findWords(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for (char c: "qwertyuiop".toCharArray()) map.put(c,1);
        for (char c: "asdfghjkl".toCharArray()) map.put(c,2);
        for (char c: "zxcvbnm".toCharArray()) map.put(c,3);

        for (String s:words){
            char[] c = s.toLowerCase().toCharArray();
            boolean check = true;
            for (int i = 0; i < c.length - 1; i++){
                if(map.getOrDefault(c[i],0) != map.getOrDefault(c[i+1],0)){
                    check = false;
                }
            }

            if (check == true) list.add(s);
        }
        return list.toArray(new String[list.size()]);
    }
}
