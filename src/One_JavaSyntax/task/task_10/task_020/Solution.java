package One_JavaSyntax.task.task_10.task_020;

 /*
 * Функциональности маловато!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> map1 = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        String name;
        int id;
        try {
            do {
                id = Integer.parseInt(reader.readLine());
                name = reader.readLine();
                map.put(name, id);
            }
            while (!name.equals(""));
        } catch (Exception e) {
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
