package MySQL;

public class CustomerPlacingLargestOrders {
    String result = "# Write your MySQL query statement below\n" +
            "SELECT customer_number FROM Orders\n" +
            "GROUP BY customer_number\n" +
            "ORDER BY COUNT(customer_number) desc limit 1;"
}
