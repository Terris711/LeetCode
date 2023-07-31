package String;

public class Convert2Base7 {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
}

//O(1)


    public String convertToBase7(int num) {
        int count = 0;
        int result = 0;

        while (num != 0){
            int digit = num % 7;
            result = result + digit * (int) Math.pow(10, count);
            count ++;
            num /= 7;
        }
        return Integer.toString(result);
    }

    //O(n)