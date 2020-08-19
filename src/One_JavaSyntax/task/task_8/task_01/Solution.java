package One_JavaSyntax.task.task_8.task_01;

/*
 * В Java коллекции делятся на 3 основных группы:
 * Set - множество
 * List - список
 * Map - словарь (карта)
 *
 * Set - коллекция (множество)
 * Можно добавить, поискать, удалить элемент (Все в куче)
 * У элементов нет строго заданного порядка.
 *
 * List - список
 * Можно взять элемент по номеру, добавить в начало, середину, конец, убрать по номеру.
 * Есть порядок элементов.
 *
 * Map - карта или словарь
 * "Мap - набор "ключ" - "значение".
 * Уникальное название - называют ключом.
 * Ключ может быть любым типом.
 *
 * Список коллекций и интерфейсов:
 *
 * Интерфейс    Класс/Реализация       Описание
 *
 * 			 ArrayList			    список
 * 			 LinkedList				список
 * List      Vector					вектор
 * 			 Stack					Стек
 *
 *
 *     		 HashSet 				множество
 * Set 	     TreeSet				Множество
 * 			 SortedSet				Отсортированное множество
 *
 *
 * 			 HashMap				карта/словарь
 * Map	     TreeMap				карта/словарь
 * 			 SortedMap				Отсортированный словарь
 * 			 Hashtable				Хеш-таблица
 *
 * Set - множество - куча ненумерованных объектов.
 * Главная особенность - Set - в нем только уникальные объекты (все разные)
 * Добавить элемент - add() , addAll();
 * Удалить элемент -  remove(), removeAll();
 * Проверять, если ли элемент - contains(), containsAll();
 * Узнать количество элементов - size();
 *
 * Map - множество пар.
 * Множество не одиноких элементов, а пар ключ-значение
 * Ограничение:
 * Первый объект в паре (ключ) - должен быть уникальным
 * В Мар не может содержаться 2 пары с одинаковыми ключами.
 *
 * Получить множество всех пар - entrySet();
 * Получить множество всех ключей - keySet();
 * Получить множество всех значений - values()
 *
 * добавить пару - put(key, value);
 * Получить значение по ключу - get(key)
 *
 * Проверить наличие ключа - containsKey(key)
 * Проверить наличие значения - containsValue(value)
 *
 * Проверить Мар паустой - isEmpty();
 * Очистить Мар - clear();
 *
 * Удалить элемент по ключу - remove(key);
 *
 * 1.Вывод на экран элементов Set.
 * 2.Вывод на экран элементов List.
 * 3.Вывод на экран элементов Map.
 *
 */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //Вывод на экран элементов Set:
        Set<String> set = new HashSet<>();
        set.add("Мама");
        set.add("Mila");
        set.add("Ramu");

        //Получение итератора для множества
        Iterator<String> iterator = set.iterator();

        //Проверка, есть ли ещё элементы
        while (iterator.hasNext()) {
            //Получение текущего элемента и переход на следующий
            String text = iterator.next();
            System.out.println(text);
        }

        //Вывод на экран элементов List
        List<String> list = new ArrayList<>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");

        //Получение итератора для списка
        Iterator<String> integer = list.iterator();

        //Проверка, есть ли ещё элементы
        while (iterator.hasNext()) {
            //Получение текущего элемента и переход на следующий
            String text = iterator.next();
            System.out.println(text);
        }

        //Вывод на экран элементов Map

        //Все элементы хранятся в парах
        Map<String, String> map = new HashMap<>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("Third", "Ramu");

        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();

        while (iterator.hasNext()) {
            //получение "пары" элементов
            //Map.Entry<String, String> pair = iterator.next();
            //String key = pair.getKey(); //ключ
            //String value = pair.getValue(); //значение
            //System.out.println(key + ":" + value);
        }

        //У коллекции получаем специальный объект-iterator (с 2мя методами)
        //Метод next() - возвращает очередной элемент коллекции.
        //Метод hasNext() проверяет есть ли еще элементы, которые не возвращал next();

        //Оператор for each используется при работе с коллекциями и контейнерами.
        //В нем неявно используется итератор, но мы видим уже полученный элемент.

        //Вывод на экран элементов Set:
        //Сокращенная запись:

        Set<String> set1 = new HashSet<>();
        set1.add("Mama");
        set1.add("Mila");
        set1.add("Ramu");

        for (String text : set1) {
            System.out.println(text);
        }

        //Вывод на экран элементов List:
        List<String> list1 = new ArrayList<>();
        list1.add("Mama");
        list1.add("Mila");
        list1.add("Ramu");

        for (String text : list1) {
            System.out.println(text);
        }

        //Вывод на экран элементов Map:
        Map<String, String> map1 = new HashMap<>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey(); //ключ
            String value = pair.getValue(); //значение
            System.out.println(key + ":" + value);
        }
    }
}
