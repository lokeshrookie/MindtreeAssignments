package Tutorial;

import java.util.Hashtable;
import java.util.Iterator;

public class Htable {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("one", 1);
        hashtable.put("two", 2);
        hashtable.put("three", 3);
        hashtable.put("four", 4);
        hashtable.put("five" , 5);
        hashtable.put("six" , 5);


        Iterator<String> keysIterator = hashtable.keySet().iterator();
        Iterator<Integer> valuesIterator = hashtable.values().iterator();
        // iterating keys
        System.out.println("keys: ");
        while(keysIterator.hasNext()){
            System.out.print(keysIterator.next());
        }
        // iterate values

        System.out.println("values: ");
        while(valuesIterator.hasNext()){
            System.out.print(valuesIterator.next());
        }


    }
}
