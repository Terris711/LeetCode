package MySQL;

public class ReformatDepartmentTable {
    String res ="# Write your MySQL query statement below\n" +
            "SELECT id, \n" +
            "sum(if(month = 'Jan', revenue, null)) as Jan_Revenue,\n" +
            "sum(if(month = 'Feb', revenue, null)) as Feb_Revenue,\n" +
            "sum(if(month = 'Mar', revenue, null))as Mar_Revenue,\n" +
            "sum(if(month = 'Apr', revenue, null)) as Apr_Revenue,\n" +
            "sum(if(month = 'May', revenue, null)) as May_Revenue,\n" +
            "sum(if(month = 'Jun', revenue, null)) as Jun_Revenue,\n" +
            "sum(if(month = 'Jul', revenue, null)) as Jul_Revenue,\n" +
            "sum(if(month = 'Aug', revenue, null)) as Aug_Revenue,\n" +
            "sum(if(month = 'Sep', revenue, null)) as Sep_Revenue,\n" +
            "sum(if(month = 'Oct', revenue, null)) as Oct_Revenue,\n" +
            "sum(if(month = 'Nov', revenue, null)) as Nov_Revenue,\n" +
            "sum(if(month = 'Dec', revenue, null)) as Dec_Revenue\n" +
            "FROM Department\n" +
            "GROUP BY id;\n";
}
//1076
