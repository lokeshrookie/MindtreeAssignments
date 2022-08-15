package JavaAssignments.arrayLab.stringLab;

import java.util.Scanner;
public class StringThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(countVowels(str));
    }
    static int countVowels(String str){
        int vowels = 0;
        for(int i = 0; i<str.length(); i++){
            if(isVowel(str.charAt(i))){
                vowels++;
            }
        }
        return vowels;
    }
    static boolean isVowel(char ch){
        String vowels = "aeiouAEIOU";
        return vowels.contains(String.valueOf(ch));
    }
}
