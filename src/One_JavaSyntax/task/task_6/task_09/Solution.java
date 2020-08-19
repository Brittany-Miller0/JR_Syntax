package One_JavaSyntax.task.task_6.task_09;

 /*
 * Класс ConsoleReader
 * String readString() - читает с клавиатуры строку
 * int readInt() - читает с клавиатуры число
 * double readDouble() - читает с клавиатуры дробное число
 * boolean readBoolean() - читает с клавиатуры строку true and false и возвращает true or false
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    static class ConsoleReader {
        public static String readString() throws Exception {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            return str;
        }

        public static int readInt() throws Exception {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int num1 = Integer.parseInt(reader.readLine());
            return num1;
        }

        public static double readDouble() throws Exception {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double num2 = Double.parseDouble(reader.readLine());
            return num2;
        }

        public static boolean readBoolean() throws Exception {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            boolean bool = Boolean.parseBoolean(reader.readLine());
            return bool;
        }
    }
}