package SystemDesign;

public class TimeMap {
    HashMap<String, ArrayList<Pair<Integer, String>>> timeKeyMap;

    public TimeMap() {
        timeKeyMap = new HashMap();
    }

    public void set(String key, String value, int timestamp) {
        if(!timeKeyMap.containsKey(key)){
            timeKeyMap.put(key, new ArrayList());
        }

        timeKeyMap.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if(!timeKeyMap.containsKey(key)){
            return "";
        }

        if(timestamp < timeKeyMap.get(key).get(0).getKey()){
            return "";
        }

        int left = 0;
        int right = timeKeyMap.get(key).size();

        while(left < right){
            int mid = (left + right) / 2;

            if (timeKeyMap.get(key).get(mid).getKey() <= timestamp){
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (right == 0){
            return "";
        }
        return timeKeyMap.get(key).get(right - 1).getValue();
    }
}
