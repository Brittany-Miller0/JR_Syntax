package One_JavaSyntax.task.task_1.task_015;

 /*
 * Лишние строки нам не нужны
 */

public class Solution {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double c = b + 38;
        //int d = a + 12;
        //double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
        //String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);

        System.out.println("Amigo is the best!");
        System.out.println("Amigo " + "is the best!");
        System.out.println("Amigo" + " " + "is the best!");
    }
}
