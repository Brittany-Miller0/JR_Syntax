package One_JavaSyntax.task.task_3.task_018;

 /*
 * План по захвату мира
 * Ввести с клавиатуры число и имя, вывести на экран:
 * "имя" захватит мир через "число" лет. Му-ха-ха!
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String name = reader.readLine();
        System.out.println("Введите количество лет: ");
        String sAge = reader.readLine();
        int age = Integer.parseInt(sAge);
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");

        //Или
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String s = sc.nextLine();
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        System.out.println(s + " захватит мир через " + a + " лет. Му-ха-ха.");*/
    }
}
