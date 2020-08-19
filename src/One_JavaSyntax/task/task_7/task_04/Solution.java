package One_JavaSyntax.task.task_7.task_04;

/*
 * Переверни массив
 * Создать массив на 10 чисел
 * Ввести с клавиатуры 10 чисел и записать их в массив
 * Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[10];

        for (int i = num.length - 1; i >= 0; i--) {
            num[i] = Integer.parseInt(reader.readLine());
        }

        for (int num1 : num) {
            System.out.println(num1);
        }
    }
}
