package MySQL;

public class BigCountry {
    String res ="SELECT name, population, area FROM World\n" +
            "WHERE area >= 3000000 OR population >= 25000000;";
}
//560