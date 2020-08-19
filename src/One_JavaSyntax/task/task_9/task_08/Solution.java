package One_JavaSyntax.task.task_9.task_08;

 /*
 * Исключения - специальный механизм для контроля над ошибками в программе.
 * Пример ошибок:
 * 1.Программа пытается записать файл на заполненный диск.
 * 2.Программа пытается вызвать метод у переменной, которая хранит ссылку - null
 * 3.Программа пытается разделить число на 0;
 *
 * 1.Когда возникает ошибка, JVM - создает специальный объект - exception - исключение, в который
 * записывается вся информация об ошибке.
 *
 * 2.Затем исключение приводит к тому, что программа выходит из текущей функции, и так до тех пор (пока не выйдет из main)
 *
 * Однако мы можем перехватить исключение.
 * В нужном месте, для нужных нам исключений мы можем написать специальный код, который будет перехватывать эти исключения.
 * try-catch
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Solution {
    //Пример программы, которая перехватывает исключение - деление на 0. И продолжает работать.
    public static void main(String[] args) {
        System.out.println("Program starts");

        try {
            System.out.println("Before method1 calling");

            method1();
            System.out.println("After method1 calling. Never will be shown");

        } catch (Exception e) {
            System.out.println("Exception has been caught");
        }
        System.out.println("Program is still running");
    }

    private static void method1() {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }

    //Output
    /*
     * "Program starts"
     * "Before method1 calling"
     * "Exception has been caught"
     * "Program is still running"
     * Произошло завершение метода method1, а не main();
     *
     *Если внутри try возникло исключение, то код перестает исполняться и срабатывает catch
     *Если исключение не возникло, то блок try исполняется до конца, а catch никогда не начнет исполняться.
     *
     *Все исключения - классы, унаследованные от класса Exception
     *
     * Можно обрабатывать несколько исключений через блок catch
     * */

    /*
     * В Java
     * Исключения делятся на проверяемые/контролируемые и неконтролируемые/непроверяемые
     * По-умолчанию - все исключения обязательно нужно перехватывать.
     * */

    /*
     *                                             Object
     *                                            Throwable (!)
     *                 Error                                              Exception(!)
     * OutOfMemoryError       StackOverFlowError                    RuntimeException         IOException(!)
     *                   |                                                                       FileNotFoundException(!)
     *             LinkageError   IllegalArgumentException         IndexOutOfBoundsException          SocketException(!)
     *                   NUmberFormatException                               |
     *                                     ArithmeticException ArrayIndexOutOfBoundsException
     *
     * */

    /*
     * Если в методе выбрасыются ClassNotFoundException(!) || FileNotFoundException(!)
     * throws ClassNotFoundException, FileNotFoundException
     * */


    /*
     *  Если написано много catch(), то будет выполнен тот, тип в котором совпадает с типом исключения.
     *  1.catch(Exception e) может перехватить любое исключение.
     *  2.Порядок блоков catch имеет значение.
     *  catch(Exception e) - перебьет блоки catch(с конкретным исключением).
     */

    //Примеры проверяемых (Checked) исключений
    public static void main2(String[] args) throws FileNotFoundException, ClassNotFoundException {
        //Перехватываем исключение
        try {
            method2();
        } catch (Exception e) {

        }
    }

    private static void method2() throws FileNotFoundException, ClassNotFoundException {
        //кинется исключение, что такого файла нет.
        FileInputStream fis = new FileInputStream("C2:\\badFileName.txt");
    }

    //Не обрабатываем исключение.
    /*public static void main3(String[] args) throws ClassNotFoundException {
        try {
            method3();
        }
        catch (FileNotFoundException e){
            System.out.println("FNFE");
        }
        catch (ClassNotFoundException e){
            System.out.println("FNFE");
        }
    }

    private static void method3() {
    }*/

    // a instanceof B имеет а тип B
    //Имеет ли объект, который хранистя в переменной Exception, тип RuntimeException

}
