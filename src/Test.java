import dsaAssignments.Queue.One;
import dsaAssignments.Stack.Two;

import java.util.*;

public class Test {

    public  static  int gen()
    {
        Random r = new Random(  );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000000));
    }
    public static void main(String[] args) {
        Random r = new Random();

        //------------------------------------------
//        System.out.println(1+ r.nextInt(2)); // print 0/1/2

        //--------------------------------------------
//        bound – the upper bound (exclusive). Must be positive.
//        Returns:
//        the next pseudorandom, uniformly distributed int value between zero (inclusive)
//        and bound (exclusive) from this random number generator's sequence

//            System.out.println( r.nextInt(2) * 10000); // prints 0 * 10000 or 1 * 10000
//            System.out.println(1+  r.nextInt(2) * 10000); // prints  1 + (0* 10000) or 1 + (1 * 10000)



        for (int i = 0; i < 20; i++) {
            System.out.println((1 + r.nextInt(2)) * 10000 + r.nextInt(1000000000)); // prints  1 + (0* 10000) or 1 + (1 * 10000)
            System.out.println((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
        }





//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        ArrayList<Integer> arrayList  = new ArrayList<>();
//        arrayList.add(99);
//        arrayList.add(97);
//        arrayList.add(77);
//        ArrayList<Integer> list2 = new ArrayList<>(arrayList);
//        ArrayList<Integer> list3 = new ArrayList<>(arrayList);
//        System.out.println(arrayList);
////        arrayList.iterator();
//        System.out.println(arrayList.iterator().hasNext());
//        Iterator<Integer> iterator = arrayList.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//
//        }
//        System.out.println(list2.indexOf(77));
    }
}

