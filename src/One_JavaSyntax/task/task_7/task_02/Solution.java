package One_JavaSyntax.task.task_7.task_02;

 /*
 * Создать массив на 10 строк.
 * Ввести с клавиатуры 8 строк и сохранить их в массив.
 * Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
 * Каждый элемент - с новой строки.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[10];
        for (int i = 0; i < 8; i++) {
            str[i] = reader.readLine();
        }
        for (int j = str.length - 1; j >= 0; j--) {
            System.out.println(str[j]);
        }
    }
}

