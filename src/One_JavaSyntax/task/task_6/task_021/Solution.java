package One_JavaSyntax.task.task_6.task_021;

 /*
 * Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта:
 * кошку-дочь и кошку-маму. Вывести их на экран.
 * Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Создать класс, который бы помог описать данную ситуацию.
 * Пример ввода:
 * дедушка Вася
 * бабушка Мурка
 * папа Котофей
 * мама Василиса
 * сын Мурчик
 * дочь Пушинка
 * Пример вывода:
 * Cat name is дедушка Вася, no mother, no father
 * Cat name is бабушка Мурка, no mother, no father
 * Cat name is папа Котофей, no mother, father is дедушка Вася
 * Cat name is мама Василиса, mother is бабушка Мурка, no father
 * Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
 * Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
 * Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
 * Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat grandpa = new Cat(grandpaName, null, null);

        String grannyName = reader.readLine();
        Cat granny = new Cat(grannyName, null, null);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null, grandpa);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName, granny, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mother, father);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName, mother, father);

        System.out.println(grandpa);
        System.out.println(granny);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }

        public Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            return "The cat's name is " +
                    name + (mother == null ? ", no mother" : ", mother is " + mother.name) +
                    (father == null ? ", no father" : ", father is " + father.name);
        }
    }

}
