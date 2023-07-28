package Math;

public class myPow {
    public double myPow(double x, int n) {
        //base case
        if (n == 0) return 1;

        long temp = n;
        if (temp < 0){
            temp = -temp;
            x = 1/x;
        }

        if(temp % 2 == 0) {
            return myPow(x * x, (int)(temp/2)); // x^(temp/2)
        }
        else {
            return x*myPow(x, (int)(temp - 1)); // x^(temp -1)*x
        }
    }
    //O(1)
}
