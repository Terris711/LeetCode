package MySQL;

public class RisingTemperature {
    String result = "SELECT w1.id\n" +
            "FROM Weather w1, Weather w2\n" +
            "WHERE DATEDIFF(w1.recordDate, w2.recordDate) = 1 AND w1.temperature > w2.temperature;";
}
