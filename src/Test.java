import dsaAssignments.Queue.One;
import dsaAssignments.Stack.Two;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        ArrayList<Integer> arrayList  = new ArrayList<>();
        arrayList.add(99);
        arrayList.add(97);
        arrayList.add(77);
        ArrayList<Integer> list2 = new ArrayList<>(arrayList);
        ArrayList<Integer> list3 = new ArrayList<>(arrayList);
        System.out.println(arrayList);

//        arrayList.iterator();
        System.out.println(arrayList.iterator().hasNext());
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

//        System.out.println(list2.indexOf(77));
    }
}

