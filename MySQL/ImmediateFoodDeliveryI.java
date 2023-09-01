package MySQL;

public class ImmediateFoodDeliveryI {
    String res = "SELECT ROUND(100*AVG(order_date = customer_pref_delivery_date),2) as immediate_percentage \n" +
            "FROM Delivery;";
}
