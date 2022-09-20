package Tutorial;

import java.util.HashSet;
import java.util.Hashtable;

public class Hset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(16);
        System.out.println(set.size());

        set.add(11);
        set.add(22);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        System.out.println(set.size());
    }
}
