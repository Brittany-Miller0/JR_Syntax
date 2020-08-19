package One_JavaSyntax.task.task_5.task_010;

 /*
 * Кошкоинициация
 * Создать 5 инициализаторов
 * Имя
 * Имя,вес, возраст
 * Имя, возраст (вес стандартный)
 * Вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
 * Вес, цвет, адрес (чужой домашний кот)
 */

public class Solution {

    public static void main(String[] args) {
        Cat cat = new Cat();
    }

    public static class Cat {
        //напишите тут ваш код
        private String name;
        private int weight;
        private int age;
        private String color;
        private String address;

        public void initialize(String name) {
            this.name = name;
            this.weight = 5;
            this.age = 3;
            this.color = "Black";
        }

        public void initialize(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
            this.color = "Orange";
        }

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void initialize(int weight, String color) {
            this.weight = weight;
            this.color = color;
            this.age = 5;
        }

        public void initialize(int weight, String color, String address) {
            this.weight = weight;
            this.color = color;
            this.address = address;
            this.age = 4;
        }
    }
}