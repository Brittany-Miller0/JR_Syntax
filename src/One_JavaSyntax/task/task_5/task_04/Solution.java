package One_JavaSyntax.task.task_5.task_04;

/*
 * Трикотаж
 * Three cats;
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Brittany", 19, 182, 50);
        Cat cat2 = new Cat("AlexNka", 19, 183, 50);
        Cat cat3 = new Cat("Jen_Ledger", 30, 162, 50);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}