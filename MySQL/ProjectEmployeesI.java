package MySQL;

public class ProjectEmployeesI {
    String res ="SELECT p.project_id, ROUND(AVG(e.experience_years),2) as average_years \n" +
            "FROM Project as p\n" +
            "LEFT JOIN Employee as e\n" +
            "ON p.employee_id = e.employee_id\n" +
            "GROUP BY p.project_id;";
}
