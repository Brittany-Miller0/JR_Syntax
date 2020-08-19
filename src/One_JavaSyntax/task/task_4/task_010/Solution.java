package One_JavaSyntax.task.task_4.task_010;

 /*
 * Попадём-не-попадём
 * Проверка числа от 50 до 100
 * "Число а не содержится в интервале"
 * "Число а содержится в интервале"
 */

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        //напишите тут ваш код
        if (50 <= a && a <= 100) {
            System.out.println("Число " + a + " содержится в интервале.");
        } else {
            System.out.println("Число " + a + " не содержится в интервале.");
        }
    }
}