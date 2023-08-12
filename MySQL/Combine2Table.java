package MySQL;

public class Combine2Table {
    String result = "SELECT firstname, lastName, city, state\n" +
            "FROM Person p LEFT JOIN Address a ON p.personId = a.personId;";
}
//878
