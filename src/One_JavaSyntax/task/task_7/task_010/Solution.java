package One_JavaSyntax.task.task_7.task_010;

 /*
 * В начало списка
 * Создать список в методе main
 * Добавить в него 10 строчек с клавиатуры,  добавлять не в конец списка, а в начало.
 * Использовать цикл - вывести содержимое на экран с новой строки.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(0, reader.readLine());
        }

        for (int x = 0; x < 10; x++) {
            System.out.println(list.get(x));
        }
    }
}
