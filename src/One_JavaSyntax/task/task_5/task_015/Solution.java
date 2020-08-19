package One_JavaSyntax.task.task_5.task_015;

 /*
 * Инициализация объектов
 * Исправить класс, чтобы только 1 метод initialize
 * инициализировал все переменные класса.
 */

public class Solution {
    public static void main(String[] args) {
    }

    class Person {
        String name;
        char sex;
        int money;
        int weight;
        double size;

        public void initialize(String name, int money, int weight, char sex, double size) {
            this.name = name;
            this.money = money;
            this.weight = weight;
            this.sex = sex;
            this.size = size;
        }
    }
}