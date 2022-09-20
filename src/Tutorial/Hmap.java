package Tutorial;

import java.util.HashMap;

public class Hmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 1);

        // print all keys
        System.out.println(map.keySet());

        // print all values
        System.out.println(map.values());
        System.out.println(map);

        // traverse all keys
        for (String i :
                map.keySet()) {
            System.out.println(i);
        }
        // traverse all values
        for (Integer i :
                map.values()) {
            System.out.println(i);
        }
    }
    /*
    can't contain duplicate keys, but duplicate values

     */

}
