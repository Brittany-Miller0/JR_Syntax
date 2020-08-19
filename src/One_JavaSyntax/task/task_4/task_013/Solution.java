package One_JavaSyntax.task.task_4.task_013;

 /*
 * День недели
 * Вводим с клавиатуры день недели
 * Вывести: понедельник, вторник, среда, четверг, пятница, суббота, воскресенье
 * Если 7 или меньше 1, то такого дня недели не существует
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        String num = reader.readLine();
        int number = Integer.parseInt(num);

        switch (number) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня недели не существует");
        }
    }
}