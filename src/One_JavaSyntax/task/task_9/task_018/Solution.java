package One_JavaSyntax.task.task_9.task_018;

/*
 * Перехват checked-исключений
 * В методе handleException обработайте все checked исключения
 * Нужно вывести на экран возникшее checked исключение.
 * Можно использовать только один блок try...catch
 * */

import java.io.IOException;
import java.rmi.RemoteException;

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());

    }

    public static void handleExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}