package MySQL;

public class DepartmentTopThreeSalaries {
    String result = "SELECT d.name as Department, e.name as Employee, e.salary\n" +
            "FROM Employee as e\n" +
            "INNER JOIN Department as d\n" +
            "ON d.id = e.departmentId\n" +
            "WHERE (\n" +
            "    SELECT COUNT(DISTINCT(salary)) \n" +
            "    FROM Employee\n" +
            "    WHERE salary > e.salary AND DepartmentId = e.DepartmentId\n" +
            ") < 3;";
}
//4157