package One_JavaSyntax.task.task_9.task_024;

/*
 * Какое сегодня число?
 * Ввести с клавиатуры дату в формате "2013-08-18"
 * Вывести на экран введенную дату в виде : "AUG 18, 2013"
 * Воспользоваться объектом Date и SimplerDateFormat
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        SimpleDateFormat format1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date dateReal = format2.parse(str);
        System.out.println(format1.format(dateReal).toUpperCase());
    }
}