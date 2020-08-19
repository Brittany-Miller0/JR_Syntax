package One_JavaSyntax.task.task_8.task_023;

 /*
 * Множество всех животных
 * 1.Внутри класса Solution создать public static class Cat, Dog без конструктора
 * или с конструктором без параметров.
 * 2.Реализовать метод createCats, который должен возвращать множество с 4 котами.
 * 3.Реализовать метод createDogs, который должен возвращать множество с 3мя котами.
 * 4.Реализовать метод join, который должен возвращать объединненое множество всех животных - всех котов и собак.
 * 5.Реализовать метод removeCars , который должен удалять их множества pets всех котов,
 * которые есть в множестве cats.
 * 6.Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
 * Каждое животное с новой строки.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result1 = new HashSet<>();

        //напишите тут ваш код
        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            result1.add(cat);
        }
        return result1;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result2 = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog();
            result2.add(dog);
        }
        return result2;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator iterator = pets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //напишите тут ваш код
    public static class Cat {
        public Cat() {
        }
    }

    public static class Dog {
        public Dog() {
        }
    }
}