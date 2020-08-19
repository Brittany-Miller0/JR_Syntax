package One_JavaSyntax.task.task_9.task_026;

/*
 * Написать программу, которая вводит с клавиатуры строку текста.
 * Программа должна вывести на экран две строки:
 * 1. первая строка содержит только гласные буквы из введённой строки.
 * 2. вторая — только согласные буквы и знаки препинания из введённой строки.
 * Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
 * Пример ввода:
 * Мама мыла раму.
 * Пример вывода:
 * а а ы а а у
 * М м м л р м .
 *
 * Требования:
 * 1. Программа должна считывать данные с клавиатуры.
 * 2. Программа должна выводить две строки.
 * 3. Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
 * 4. Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
 * 5. Каждая строка должна заканчиваться пробелом.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chArr = reader.readLine().toCharArray();
        ArrayList<Character> listVow = new ArrayList<>();
        ArrayList<Character> listNVow = new ArrayList<>();
        for (int i = 0; i < chArr.length; i++) {
            if (isVowel(chArr[i])) {
                listVow.add(chArr[i]);
            } else if (chArr[i] == ' ') {
                continue;
            } else {
                listNVow.add(chArr[i]);
            }
        }

        for (char c : listVow) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (char c : listNVow) {
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        // приводим символ в нижний регистр - от заглавных к строчным буквам
        c = Character.toLowerCase(c);
        // ищем среди массива гласных
        for (char d : vowels) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}