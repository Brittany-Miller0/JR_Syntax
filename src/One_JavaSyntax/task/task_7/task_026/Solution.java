package One_JavaSyntax.task.task_7.task_026;

/*
 * Семейная перепись
 * Создать класс Human с полями имя(String),
 * пол(boolean), возраст(int), отец(Human)
 * мать(Human)
 * Создать объекты и заполнить их так, чтобы получилось:
 * 2 дедушки, 2 бабушки, отец, мать, 3 детей
 * Вывести объекты на экран.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFather1 = new Human("Jon", true, 55);
        Human grandFather2 = new Human("Neck", true, 52);
        Human grandMother1 = new Human("Juli", false, 55);
        Human grandMother2 = new Human("Alexa", false, 48);
        Human father = new Human("Kirk", true, 32, grandFather1, grandMother1);
        Human mother = new Human("Klara", false, 25, grandFather2, grandMother2);
        Human child1 = new Human("Bill", true, 7, father, mother);
        Human child2 = new Human("Ross", true, 5, father, mother);
        Human child3 = new Human("Brittany", false, 19, father, mother);

        ArrayList<Human> list = new ArrayList(Arrays.asList(grandFather1, grandFather2, grandMother1, grandMother2, father, mother, child1, child2, child3));
        for (Human h : list) {
            System.out.println(h.toString());
        }
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}