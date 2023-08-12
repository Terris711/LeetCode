package MySQL;

public class RankScores {
    String result = "SELECT score, DENSE_RANK() OVER(ORDER BY score DESC) as 'rank' FROM Scores;";
}

//639
