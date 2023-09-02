package MySQL;

public class MonthlyTransactionI {
    String res = "SELECT SUBSTRING(trans_date,1,7)  as month, country, \n" +
            "        COUNT(id) as trans_count, \n" +
            "        SUM(CASE WHEN state = \"approved\" THEN 1 ELSE 0 END) as approved_count, \n" +
            "        SUM(amount) as trans_total_amount, \n" +
            "        SUM(CASE WHEN state = \"approved\" THEN amount ELSE 0 END) as approved_total_amount\n" +
            "FROM Transactions\n" +
            "GROUP BY month, country;";
}
