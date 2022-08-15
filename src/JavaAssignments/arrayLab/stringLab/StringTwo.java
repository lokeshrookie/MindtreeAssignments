package JavaAssignments.arrayLab.stringLab;

import java.util.Scanner;
public class StringTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String  str = s.nextLine();
        words(str);
    }
    static void words(String str){
        String word = "";
        str = str + " "; // extra space added to str to consider the last word.
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            word = word + ch;
            if(str.charAt(i) == ' '){
                System.out.println(word);
                word = "";
            }
        }
    }
}
