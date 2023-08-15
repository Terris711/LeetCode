package MySQL;

public class ConsecutiveNumber {
    String result = "SELECT DISTINCT log1.num as ConsecutiveNums\n" +
            "FROM Logs as log1\n" +
            "JOIN Logs as log2 ON log1.id = log2.id - 1\n" +
            "JOIN Logs as log3 ON log1.id = log3.id - 2\n" +
            "WHERE log1.num = log2.num and log1.num = log3.num";
}
//1572