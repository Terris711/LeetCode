package Math;

public class Multiply {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] answer = new int[len1 + len2];

        if (len1 == 0 || len2 == 0 || "0".equals(num1) || "0".equals(num2)){
            return "0";
        }

        if ("1".equals(num1)){
            return num2;
        }

        if ("1".equals(num2)){
            return num1;
        }

        for (int i = len1 - 1; i >= 0; i--){
            for (int j = len2 -1; j >= 0; j--){
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                product += answer[i + j + 1];

                answer[i + j + 1] = product % 10;
                answer[i + j] += product / 10;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int item : answer){
            if (stringBuilder.length() == 0 && item == 0){
                continue;
            }
            stringBuilder.append(item);
        }
        return stringBuilder.toString();
    }
}
