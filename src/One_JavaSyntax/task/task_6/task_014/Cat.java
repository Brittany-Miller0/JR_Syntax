package One_JavaSyntax.task.task_6.task_014;

 /* Статические коты
 * 1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
 * 2. Пусть при каждом создании кота (нового объекта Cat)
 * в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
 * 3. Метод printCats должен выводить всех котов на экран.
 * Нужно использовать переменную cats.
 */

import java.util.ArrayList;

public class Cat {

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int y = 0; y < 10; y++) {
            cats.add(new Cat());
        }
        printCats();
    }

    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void printCats() {
        //напишите тут ваш код
        for (int x = 0; x < cats.size(); x++) {
            System.out.println(cats.get(x));
        }
    }
}