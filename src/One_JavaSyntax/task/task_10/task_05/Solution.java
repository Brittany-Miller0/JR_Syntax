package One_JavaSyntax.task.task_10.task_05;

 /*
 * Задача №5 на преобразование целых типов
 * c = 256
 */

public class Solution {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}