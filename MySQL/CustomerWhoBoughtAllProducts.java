package MySQL;

public class CustomerWhoBoughtAllProducts {
    String result = "SELECT customer_id FROM Customer \n" +
            "GROUP BY customer_id\n" +
            "HAVING COUNT(DISTINCT product_key) = (SELECT COUNT(product_key) FROM Product);";
}
