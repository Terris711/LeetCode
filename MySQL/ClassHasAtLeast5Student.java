package MySQL;

public class ClassHasAtLeast5Student {
    String res ="SELECT class FROM Courses\n" +
            "GROUP BY class HAVING COUNT(student) >= 5";
}
