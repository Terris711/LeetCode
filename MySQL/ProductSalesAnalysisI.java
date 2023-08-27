package MySQL;

public class ProductSalesAnalysisI {
    String res = "SELECT p.product_name, s.year, s.price FROM Sales as s\n" +
            "LEFT JOIN Product as p\n" +
            "ON p.product_id = s.product_id;";

    String res2 = "# Write your MySQL query statement below\n" +
            "SELECT DISTINCT \n" +
            "    P.product_name, S.year, S.price \n" +
            "FROM \n" +
            "    (SELECT DISTINCT product_id, year, price FROM Sales) S\n" +
            "INNER JOIN\n" +
            "    Product AS P\n" +
            "USING (product_id);";
}

//3009


