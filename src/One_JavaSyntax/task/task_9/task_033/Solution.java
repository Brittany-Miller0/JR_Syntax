package One_JavaSyntax.task.task_9.task_033;

 /*
 * Задача:
 * Пользователь вводит с клавиатуры список слов (и чисел).
 * Слова вывести в возрастающем порядке, числа - в убывающем.
 *
 * Пример ввода:
 * Вишня
 * 1
 * Боб
 * 3
 * Яблоко
 * 2
 * 0
 * Арбуз
 * Пример вывода:
 * Арбуз
 * 3
 * Боб
 * 2
 * Вишня
 * 1
 * 0
 * Яблоко
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        List<Boolean> listBoolean = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();
        List<String> listString = new ArrayList<>();

        // Cоздаем список listBoolean для "правильного" последовательного вывода
        for (String a : array) {
            if (isNumber(a)) {
                listBoolean.add(true);
            } else {
                listBoolean.add(false);
            }
        }

        // Создаем два списка: список цифр и список слов
        for (int n = 0; n < array.length; n++) {
            if (isNumber(array[n])) {
                int n1 = Integer.parseInt(array[n]);
                listInteger.add(n1);
            } else {
                listString.add(array[n]);
            }
        }

        // Сортируем списки // Сортирую список цифр
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < listInteger.size(); i++) {
                if (listInteger.get(i - 1) < (listInteger.get(i))) {
                    int temp = listInteger.get(i - 1);

                    listInteger.set(i - 1, listInteger.get(i));

                    listInteger.set(i, temp);

                    swapped = true;
                }

            }
        }

        // Сортируем списки // Сортирую список слов
        swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < listString.size(); i++) {
                if (isGreaterThan(listString.get(i - 1), listString.get(i))) {
                    String temp = listString.get(i - 1);

                    listString.set(i - 1, listString.get(i));

                    listString.set(i, temp);

                    swapped = true;
                }
            }
        }

        // Записываем "правильный" вывод в array[]
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < listBoolean.size(); i++) {
            if (listBoolean.get(i)) {
                array[i] = new Integer(listInteger.get(n1)).toString();
                n1++;
            } else {
                array[i] = listString.get(n2);
                n2++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}