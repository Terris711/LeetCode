package MySQL;

public class AverageSellingPrice {
    String res = "SELECT p.product_id, ROUND(SUM(price*units)/SUM(units), 2) as average_price\n" +
            "FROM Prices as p\n" +
            "INNER JOIN UnitsSold as u\n" +
            "ON p.product_id = u.product_id\n" +
            "AND u.purchase_date BETWEEN start_date AND end_date\n" +
            "GROUP BY product_id;";
}

// Inner join should be faster than left join