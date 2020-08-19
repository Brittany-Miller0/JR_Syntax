package One_JavaSyntax.task.task_4.task_035;

 /*
 * Четные числа
 * (for)
 * Вывести только четные числа от 1 - 100
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}