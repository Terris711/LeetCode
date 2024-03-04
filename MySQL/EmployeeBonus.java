package MySQL;

public class EmployeeBonus {
    String result = "# Write your MySQL query statement below\n" +
            "SELECT e.name, b.bonus FROM Employee as e\n" +
            "LEFT JOIN Bonus AS b ON b.empId = e.empId\n" +
            "WHERE b.bonus < 1000 OR b.bonus IS NULL;";
}


//