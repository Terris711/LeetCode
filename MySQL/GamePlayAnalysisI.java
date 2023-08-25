package MySQL;

public class GamePlayAnalysisI {
    String result = "# Write your MySQL query statement below\n" +
            "SELECT player_id, min(event_date) as first_login\n" +
            "FROM Activity\n" +
            "GROUP BY player_id";
}

// SQL
