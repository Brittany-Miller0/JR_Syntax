package One_JavaSyntax.task.task_3.task_011;

 /*
 * Конвертируем время
 * Добавить метод, который будет конвертировать часы в секунды.
 */

public class Solution {
    //напишите тут ваш код
    public static int convertToSeconds(int hour) {
        return hour * 3600;
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(6));
        System.out.println(convertToSeconds(7));

    }
}
