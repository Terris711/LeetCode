package Array;

public class bulbSwitch {
    class Solution {
        public int bulbSwitch(int n) {
            int count = 0;
            for (int i = 1; i*i <= n; i++){
                count ++;
            }
            return count;
        }
    }
}



public class bulbSwitch2 {
    class Solution2 {
        public int bulbSwitch(int n) {
            return (int) Math.sqrt(n);
        }
    }
}

//O(n)
