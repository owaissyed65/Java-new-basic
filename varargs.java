//import java.sql.PreparedStatement;

/*
Take multy argument in one method
 */
public class varargs {
static int sum (int ...arr){
        // Available as int [] arr
        int result = 0;
        for (int a: arr)
        {
        result += a;

        }
    return result;
}
    public static void main(String[] args) {
//        System.out.println("I love You!");
        System.out.println("The sum of 2,3 is : " + sum(2, 3));
        System.out.println("The sum of 2,3,4 is : " + sum(2, 3, 4));
        System.out.println("The sum of 2,3,4,5 is : " + sum(2, 3, 4, 5));
        System.out.println("The sum of 2,3,4,5,6 is : " + sum(2, 3, 4, 5, 6));
        System.out.println("The sum of 2,3,4,5,6,7 is : " + sum(2, 3, 4, 5, 6, 7));
        System.out.println("The sum of 2,3,4,5,6,7,8 is : " + sum(2, 3, 4, 5, 6, 7, 8));
        System.out.println("The sum of 2,3,4,5,6,7,8,9 is : " + sum(2, 3, 4, 5, 6, 7, 8, 9));
    }

    }
