package MySQL;

public class ValidTriangle {
    String res = "SELECT x,y,z,\n" +
            "case WHEN (x+y) > z AND (x+z) > y AND (y+z) > x THEN 'Yes' else 'No' end as triangle\n" +
            "FROM Triangle";
}
// 706