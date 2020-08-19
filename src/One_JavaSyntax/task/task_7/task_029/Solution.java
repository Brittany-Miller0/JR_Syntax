package One_JavaSyntax.task.task_7.task_029;

 /*
 * Меняем функциональность
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            if (str.length() % 2 == 0) resultStrings.add(str + " " + str);
            else resultStrings.add(str + " " + str + " " + str);
        }

        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i));
        }
    }
}