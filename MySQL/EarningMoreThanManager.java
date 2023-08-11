package MySQL;

public class EarningMoreThanManager {
    String answer = "SELECT name as Employee FROM Employee e " +
                    "WHERE salary > (SELECT salary FROM Employee WHERE id = e.managerId);";
    //Slow

    //Fast
    String answer1 = "SELECT e.name as Employee FROM Employee e " +
                    "INNER JOIN employee m " +
                    "ON e.managerId = m.id WHERE e.salary > m.salary;";
}
