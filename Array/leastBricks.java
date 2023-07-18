package Array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leastBricks {
    public int leastBricks(List<List<Integer>> wall) {
        int max = 0; // max bricks with single edge

        Map<Integer, Integer> map = new HashMap<>(); //count num of brick

        for (List<Integer> row : wall){
            int edge = 0 ;

            for (int brick = 0; brick < row.size() - 1; brick ++){
                edge += row.get(brick);
                map.put(edge, map.getOrDefault(edge, 0) + 1);
                max = Math.max(max, map.get(edge));
            }
        }
        return wall.size() - max;
    }
}
