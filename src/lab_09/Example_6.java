package lab_09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example_6 {
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<>();

        map.put(0, "Andrey");
        map.put(1, "Danil");
        map.put(2, "Egor");
        map.put(3, "Elizaveta");
        map.put(4, "Anna");
        map.put(5, "Ruslan");
        map.put(6, "Alina");
        map.put(7, "July");
        map.put(8, "Matvei");
        map.put(9, "Konstantin");
        map.put(10, "Aleksey");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            if (key == 0) {
                String values = entry.getValue();
                System.out.println("Значения ключом равным нулю: " + values);
            }
        }
        System.out.println(" ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (key > 5) {
                System.out.println("Значения ключей больше 5: " + "key = " + key + "; value = " + value);
            }
        }
        System.out.println(" ");
        int m = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (value.length() > 5) {
                m = key * m;
                System.out.println("Перемноженные ключи больше 5: " + key);
            }

        }
    }
}
