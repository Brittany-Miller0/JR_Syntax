package One_JavaSyntax.task.task_10.task_013;

 /*
 * Конструкторы класса Human
 * Написать класс Human c 6 полями
 * Реализовать 10 конструкторов для него (со смыслом)
 */

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String hairColor;
        private String eyeColor;
        private int age;
        private int height;
        private int weight;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String hairColor) {
            this.name = name;
            this.hairColor = hairColor;
        }

        public Human(String name, String hairColor, String eyeColor) {
            this.name = name;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
        }

        public Human(String name, String hairColor, String eyeColor, int age) {
            this.name = name;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
            this.age = age;
        }

        public Human(String name, String hairColor, String eyeColor, int age, int height) {
            this.name = name;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
            this.age = age;
            this.height = height;
        }

        public Human(String name, String hairColor, String eyeColor, int age, int height, int weight) {
            this.name = name;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String eyeColor, int age, int height, int weight) {
            this.name = name;
            this.eyeColor = eyeColor;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public Human(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public Human(String name, int weight, String eyeColor) {
            this.name = name;
            this.weight = weight;
            this.eyeColor = eyeColor;
        }
    }
}