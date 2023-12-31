package Array;

public class plusOne {
    class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length -1; i >= 0; i--){
                if (digits[i] < 9){
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
    }
}
//O(n) with java

public class Solution {
    public int[] PlusOne(int[] digits) {
        for (int i = digits.Length - 1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        digits = new int[digits.Length + 1];
        digits[0] = 1;
        return digits;
    }
}

//O(n) with C#


