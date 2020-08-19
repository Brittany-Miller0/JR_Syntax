package One_JavaSyntax.task.task_10.task_012;

 /*
 * Количество букв
 */

import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            alphabet.add((char) ('а' + i));
        }
        alphabet.add(6, 'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //Напишите тут ваш код

        int count = 0;
        //сначала по алфавиту, потом по строке, потом по символу строки.
        for (char abs : alphabet) {
            for (String lonelyString : list) {
                for (char symbol : lonelyString.toCharArray()) {
                    if (abs == symbol)
                        count++;
                }
            }
            System.out.println(abs + " " + count);
            count = 0;
        }
    }
}