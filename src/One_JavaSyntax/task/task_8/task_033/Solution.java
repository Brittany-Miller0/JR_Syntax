package One_JavaSyntax.task.task_8.task_033;

 /*
 * Задача по алгоритмам
 * Введи с клавиатуры 20 слов и выведи их в алфавитном порядке
 * Каждое слово с новой строки.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        Arrays.sort(array);
        isGreaterThan("a", "b");
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return true;
    }
}