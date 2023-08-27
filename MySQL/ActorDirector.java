package MySQL;

public class ActorDirector {
    String res = "SELECT actor_id, director_id FROM ActorDirector\n" +
            "GROUP BY actor_id, director_id\n" +
            "HAVING COUNT(timestamp) >= 3;";
}
