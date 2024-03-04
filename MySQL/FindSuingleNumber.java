package MySQL;

public class FindSuingleNumber {
    String result = "# Write your MySQL query statement below\n" +
            "SELECT max(num) as num FROM Mynumbers\n" +
            "WHERE num not in (SELECT num FROM Mynumbers GROUP BY num HAVING COUNT(num) > 1)";
}

//1014