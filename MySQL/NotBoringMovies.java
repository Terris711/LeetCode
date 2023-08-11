package MySQL;

public class NotBoringMovies {
    String result =
            "SELECT *\n" +
            "FROM Cinema\n" +
            "WHERE id % 2 = 1 AND description != \"boring\"\n" +
            "ORDER BY rating DESC;";
}
