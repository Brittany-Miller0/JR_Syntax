package One_JavaSyntax.task.task_5.task_017;

 /*
 * Конструируем котиков
 * Создать класс Cat с 5ю конструкторами
 * Имя
 * Имя, вес, возраст
 * Имя, возраст (вес стандартный)
 * Вес, цвет, (имя, адрес и возраст - неизвестны)
 * Вес, цвет, адрес
 */

public class Solution {
    public static void main(String[] args) {
    }

    public static class Cat {
        private String name;
        private String color;
        private String address;
        private int age;
        private int weight;

        public Cat(String name) {
            this.name = name;
            this.color = "Black";
            this.age = 3;
            this.weight = 5;
        }

        public Cat(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
            this.color = "Red-headed";
        }

        public Cat(int weight, String color) {
            this.weight = weight;
            this.color = color;
            this.age = 3;
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Cat(int weight, String color, String address) {
            this.weight = weight;
            this.color = color;
            this.address = address;
            this.age = 4;
        }
    }
}
