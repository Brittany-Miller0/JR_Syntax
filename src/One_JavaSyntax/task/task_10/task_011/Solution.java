package One_JavaSyntax.task.task_10.task_011;

/*
 * Большая зарплата
 * Вывести надпись 40 раз, урезая по одной, первой букве.
 */

public class Solution {
    public static void main(String[] args) {
        String s = " Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        for (int i = 0; i < 40; i++) {
            System.out.println(s.substring(i, s.length()));
        }
    }

}
