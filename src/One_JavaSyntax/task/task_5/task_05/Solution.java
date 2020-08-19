package One_JavaSyntax.task.task_5.task_05;

/*
 * Кошачья бойня
 * Создать 3 кота class Cat
 * Провести 3 боя
 */

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Brittany", 19, 182, 55);
        Cat cat2 = new Cat("AlexNka", 18, 183, 50);
        Cat cat3 = new Cat("Jen_Ledger", 30, 162, 45);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));

    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
