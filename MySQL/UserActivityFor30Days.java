package MySQL;

public class UserActivityFor30Days {
    String res ="SELECT activity_date as day, COUNT(distinct user_id) as active_users\n" +
            "FROM Activity\n" +
            "GROUP BY day\n" +
            "HAVING activity_date >= '2019-06-28' AND activity_date <= '2019-07-27';";
}
