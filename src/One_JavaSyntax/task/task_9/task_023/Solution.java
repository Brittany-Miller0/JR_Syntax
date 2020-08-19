package One_JavaSyntax.task.task_9.task_023;

 /*
 * Метод в try..catch
 * Написать программу, которая будет вводить числа с клавиатуры.
 * Код по чтению чисел с клавиатуры должен быть в методе readData.
 * Обернуть все тело (код внутри readData) этого метода в try..catch.
 * Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
 * Числа выводить с новой строки сохраняя порядок ввода.
 *
 * Требования:
 * 1. Программа должна считывать данные с клавиатуры.
 * 2. Метод main не изменять.
 * 3. Метод main не должен кидать исключений.
 * 4. Метод readData должен содержать блок try..catch.
 * 5. Если пользователь ввел текст, а не число, программа должна выв
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                int i = Integer.parseInt(reader.readLine());
                list.add(i);
            }
        } catch (NumberFormatException | IOException e) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
