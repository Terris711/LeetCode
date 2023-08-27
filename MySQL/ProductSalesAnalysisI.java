package MySQL;

public class ProductSalesAnalysisI {
    String res = "SELECT p.product_name, s.year, s.price FROM Sales as s\n" +
            "LEFT JOIN Product as p\n" +
            "ON p.product_id = s.product_id;";
}

//3009
