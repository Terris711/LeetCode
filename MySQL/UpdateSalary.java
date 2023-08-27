package MySQL;

public class UpdateSalary {
    String res ="UPDATE Salary SET sex = \n" +
            "CASE sex\n" +
            "    WHEN 'm' THEN 'f'\n" +
            "    ELSE 'm'\n" +
            "END;";
}
//56.98%
