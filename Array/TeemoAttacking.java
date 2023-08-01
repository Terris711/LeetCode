package Array;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int answer = duration;

        for (int i = 1; i < timeSeries.length; i++){
            if (timeSeries[i] <= timeSeries[i -1] + duration){
                answer += timeSeries[i] - timeSeries[i - 1];
            } else {
                answer += duration;
            }
        }
        return answer;
    }
}

//O(n)
