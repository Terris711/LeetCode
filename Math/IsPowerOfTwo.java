package Math;

public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n == 0) return false;
        else if (n%2 != 0) return false;
        else return isPowerOfTwo(n/2);
    }
}

//O(nlog)
