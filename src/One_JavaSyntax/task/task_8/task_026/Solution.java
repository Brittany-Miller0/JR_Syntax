package One_JavaSyntax.task.task_8.task_026;

 /*
 * Омовение Рамы
 * Написать программу, которая выводит с клавиатуры строку текста.
 * Программа заменяет в тексте первые буквы всех слов на заглавные.
 * Пример:
 * мама мыла раму
 * Мама Мыла Раму
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        char[] result = string.toCharArray();
        result[0] = Character.toUpperCase(result[0]);

        for (int i = 0; i < result.length; i++) {
            if (result[i] == ' ') {
                result[i + 1] = Character.toUpperCase(result[i + 1]);
            }
        }
        System.out.println(result);
    }
}