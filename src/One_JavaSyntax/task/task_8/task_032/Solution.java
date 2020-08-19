package One_JavaSyntax.task.task_8.task_032;

 /*
 * Модернизация ПО
 * Программа определяет, какая семья (фамилию) живет в доме с указанным номером.
 * Новая задача: Программа должна работать не с номерами домов, а с городами:
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) {
                break;
            }
            list.add(town);
        }

        String family = reader.readLine();

        if (list.contains(family)) {
            String familyName = list.get(list.indexOf(family) + 1);
            System.out.println(familyName);
        }

        // Прочти номер дома
        /*  int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }*/
    }
}