package MySQL;

public class DuplicateEmail {
    String result = "# Write your MySQL query statement below\n" +
            "SELECT email FROM Person\n" +
            "GROUP BY email\n" +
            "HAVING COUNT(email) > 1;";
}

//931
