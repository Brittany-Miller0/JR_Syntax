package One_JavaSyntax.task.task_7.task_028;

/*
 * Не компилируется задача про котиков
 * Программа выводит с клавиатуры даннные про котиков и выводит на экран.
 *
 * Требования:
 * 1. Программа должна считывать данные с клавиатуры.
 * 2. Если пользователь ввел: Barsik, 6, 5 и 22 (каждое значение с новой строки), то программа должна вывести "Cat name is Barsik, age is 6, weight is 5, tail = 22".
 * 3. Если пользователь ввел: Murka, 8, 7 и 20 (каждое значение с новой строки), то программа должна вывести "Cat name is Murka, age is 8, weight is 7, tail = 20".
 * 4. Если пользователь ввел: Barsik, 6, 5, 22, Murka, 8, 7 и 20 (каждое значение с новой строки), то программа должна вывести две строки:
 * "Cat name is Barsik, age is 6, weight is 5, tail = 22" и "Cat name is Murka, age is 8, weight is 7, tail = 20".
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();
            String age = reader.readLine();
            String weight = reader.readLine();
            String tailLength = reader.readLine();

            if (name == null || name.isEmpty() ||
                    age == null || age.isEmpty() ||
                    weight == null ||
                    weight.isEmpty() ||
                    tailLength == null ||
                    tailLength.isEmpty()) {
                break;
            }

            Cat cat = new Cat(name, Integer.parseInt(age), Integer.parseInt(weight), Integer.parseInt(tailLength));
            CATS.add(cat);
        }
        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        public Cat(String name) {
            this.name = name;
        }

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}