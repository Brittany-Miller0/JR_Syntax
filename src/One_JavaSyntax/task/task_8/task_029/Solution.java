package One_JavaSyntax.task.task_8.task_029;

 /*
 * Пять победителей
 * Создать массив на 20 чисел
 * Заполнить его числами с клавиатуры
 * Вывести 5 наибольших чисел.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Integer[] integerArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(integerArray, Comparator.reverseOrder());
            integerArray[i] = array[i];
        }
    }
}

/*
    for (int i = array.length - 1; i > 0; i--) {
    for (int j = 0; j < i; j++) {
    if (array[j] < array[j + 1]) {
    int tmp = array[j];
    array[j] = array[j + 1];
    array[j + 1] = tmp;
 }*/