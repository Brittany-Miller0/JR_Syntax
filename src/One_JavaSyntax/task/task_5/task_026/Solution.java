package One_JavaSyntax.task.task_5.task_026;

 /*
 * Мужчина и женщина
 * Создать классы Man, Woman
 * Поля: String name, int age, String address
 * Создать конструкторы, в которых передаются все возможные параметры.
 * Создать по 2 объекта каждого класса со всеми данными. (с помощью конструктора)
 * Вывести на экран : name + "" + age + "" + address
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Man man1 = new Man("AlexNka", 18, "Home1");
        Man man2 = new Man("Aleksa", 18, "Home2");
        Woman woman1 = new Woman("Brittany", 19, "Home3");
        Woman woman2 = new Woman("Miller", 19, "Home4");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        String address;
        int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        String address;
        int age;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}