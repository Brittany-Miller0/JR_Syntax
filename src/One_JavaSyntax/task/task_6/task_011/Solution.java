package One_JavaSyntax.task.task_6.task_011;

 /*
 * Контролируем массу тела
 * Программа должна считывать вес в киллограммах и рост в метрах
 * и выводить сообщение о индексе массы тела.
 * Реализовать статический метод body
 * Метод должен определить индекс массы тела, и вывести:
 * Недовес: меньше чем 18.5 (меньше 18.5) не включая
 * Нормальный: между 18.5 и 25 (между 18.5 и 25) не включая
 * Избыточный вес: между 25 и 30 (между 25 и 30) не включая
 * Ожирение: 30 и больше (больше 30 или больше)
 *
 * Индекс массы тела = Вес в кг/ (рост в метрах * рост в метрах)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваш вес: ");
        double weight = Double.parseDouble(bis.readLine());
        System.out.println("Введите ваш рост: ");
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double ind = weight / (height * height);
            if (ind < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            } else if (ind >= 18.5 && ind < 25) {
                System.out.println("Нормальный: между 18.5 и 24.9");
            } else if (ind >= 25 && ind < 30) {
                System.out.println("Избыточный вес: между 25 и 29.9");
            } else if (ind >= 30) {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}