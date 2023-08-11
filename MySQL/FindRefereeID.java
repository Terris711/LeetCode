package MySQL;

public class FindRefereeID {
    SELECT name FROM Customer
    WHERE referee_id != 2 or referee_id is null;

    //O(n)
}
