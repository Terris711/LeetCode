package MySQL;

public class GETNTHHIGHESTSALARY {
    String answer = "CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT\n" +
            "BEGIN\n" +
            "SET N = N - 1;\n" +
            "  RETURN (\n" +
            "      # Write your MySQL query statement below.\n" +
            "      SELECT DISTINCT(salary) FROM Employee ORDER BY salary DESC\n" +
            "      LIMIT 1 OFFSET N\n" +
            "  );\n" +
            "END";
}
//1092

