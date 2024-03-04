package MySQL;

public class SalesAnalysisIII {
    String res ="SELECT p.product_id, p.product_name FROM Product as p\n" +
            "LEFT JOIN Sales as s\n" +
            "ON p.product_id = s.product_id\n" +
            "GROUP BY p.product_id\n" +
            "HAVING MIN(s.sale_date) >= \"2019-01-01\" AND MAX(s.sale_date) <= \"2019-03-31\";";
}
//1977