package One_JavaSyntax.task.task_9.task_01;

public class Solution {

    /* Стек (Набор элементов)

     *  Структура элементов коллекции (положенный самым последним, достается самым первым)
     *  Стек - специальная коллекция, у которой есть методы (добавить элемент), взять(достать/забрать) элемент
     *  Первым будет взят элемент, добавленный самым последним.

     *  Стек-трейс
     *  Пример:
     *  Функция (А) вызвала -> (Б) -> (B) -> (G)
     *  Чтобы выйти из (Б) нужно сначала выйти из (В), а для этого из (G)

     *  Функция вызванная последней, должна завершиться первой.

     */


    //Получение и вывод текущего стека вызовов:
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
    }

    //Output
    /*
     * getMethodName
     * method3
     * method2
     * method1
     * main
     * */

}
