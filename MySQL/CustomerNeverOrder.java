package MySQL;

public class CustomerNeverOrder {
    String result = "SELECT name as Customers FROM Customers c \n" +
            "LEFT JOIN Orders o on c.id = o.customerId\n" +
            "WHERE customerId is null;";
}
