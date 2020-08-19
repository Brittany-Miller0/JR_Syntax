package One_JavaSyntax.task.task_7.task_021;

 /*
 * Перестановочка подоспела
 * Ввести с клавиатуры 2 числа N и М
 * Ввести N строк и заполнить ими список.
 * Переставить М первых строк в конец списка.
 * Вывести список на экран, каждое значение с новой строки.
 * Работаем с 1 списком.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int j = 0; j < M; j++) {
            String s = list.get(0);
            list.remove(0);
            list.add(s);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}