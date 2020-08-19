package One_JavaSyntax.task.task_3.task_08;

 /*
 * Произведение 10 чисел
 * Вывести произведение чисел от 1 до 10
 */

public class Solution {
    public static void main(String[] args) {

        int x = 1;
        for (int y = 1; y <= 10; y++) {
            x *= y;
        }
        System.out.println(x);

        //Напролом
        //System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10);
    }
}
