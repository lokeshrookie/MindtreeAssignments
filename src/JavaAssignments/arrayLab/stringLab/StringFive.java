package JavaAssignments.arrayLab.stringLab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StringFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        countOccurrence(str);
    }
    static void countOccurrence(String  str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0 ;i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)+1);
//                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
