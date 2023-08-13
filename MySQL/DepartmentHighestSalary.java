package MySQL;

public class DepartmentHighestSalary {
    String result = "SELECT d.name AS Department, e.name as Employee, e.salary\n" +
            "FROM Employee e, Department D\n" +
            "WHERE e.departmentId = d.id\n" +
            "AND (departmentId, salary) IN (SELECT departmentId, max(salary) as Salary \n" +
            "                                FROM Employee GROUP BY departmentId);";
}
//1595