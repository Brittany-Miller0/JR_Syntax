package One_JavaSyntax.task.task_4.task_027;

 /*
 * Описываем числа
 * Ввести целое число в диапазоне: 1-999
 * четное однозначное число //четное и 1 цифра
 * нечетное однозначное число //нечетное и 1 цифра
 * четное двухзначное число //четное и 2 цифры
 * нечетное двухзначное число //нечетное и 2 цифры
 * четное трехзначное число //четное и 3 цифры
 * нечетное двухзначное число //нечетное и 3 цифры
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int a = Integer.parseInt(num);

        if ((1 <= a) && (a <= 999)) {
            if ((a <= 9) && (a % 2 == 0)) System.out.println("четное однозначное число");
            if ((a <= 9) && (a % 2 != 0)) System.out.println("нечетное однозначное число");
            if ((10 <= a) && (a <= 99) && (a % 2 == 0)) System.out.println("четное двухзначное число");
            if ((10 <= a) && (a <= 99) && (a % 2 != 0)) System.out.println("нечетное двухзначное число");
            if ((100 <= a) && (a <= 999) && (a % 2 == 0)) System.out.println("четное трехзначное число");
            if ((100 <= a) && (a <= 999) && (a % 2 != 0)) System.out.println("нечетное трехзначное число");
        }
    }
}