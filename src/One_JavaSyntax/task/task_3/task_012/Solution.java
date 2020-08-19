package One_JavaSyntax.task.task_3.task_012;

 /*
 * Набираем воду в бассейн
 * a * b * c
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        //напишите тут ваш код
        return (a * b * c) * 1000;
    }
}