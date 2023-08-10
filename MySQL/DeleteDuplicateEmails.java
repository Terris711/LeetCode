package MySQL;

public class DeleteDuplicateEmails {
    # Write your MySQL query statement below
    DELETE p1 FROM Person p1, Person p2
    WHERE p1.email = p2.email AND p1.id > p2.id;


    DELETE FROM Person
    WHERE id NOT IN (SELECT * FROM (SELECT MIN(id) FROM Person GROUP BY email) as p)
}
