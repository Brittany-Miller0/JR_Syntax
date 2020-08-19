package One_JavaSyntax.task.task_5.task_02;

 /*
 * Реализовать метод fight
 * Вес, возраст, силы
 * Проверка объектов на победу
 * true - win, false - lose
 */


public class Solution {


    public static class Cat {
        public int age;
        public int weight;
        public int strength;

        public static void main(String[] args) {
        }

        public Cat() {
        }

        public boolean fight(Cat anotherCat) {
            //напишите тут ваш код
            int i = 0;
            int k = 0;
            if (this.age > anotherCat.age) {
                i++;
            } else if (this.age == anotherCat.age) {
                k++;
                i++;
            } else {
                k++;
            }
            if (this.weight > anotherCat.weight) {
                i++;
            } else if (this.weight == anotherCat.weight) {
                k++;
                i++;
            } else {
                k++;
            }
            if (this.strength > anotherCat.strength) {
                i++;
            } else if (this.strength == anotherCat.strength) {
                k++;
                i++;
            } else {
                k++;
            }
            if (i > k) {
                return true;
            } else return false;
        }
    }
}
