package JavaAssignments.arrayLab.stringLab;

import java.util.Scanner;
public class StringFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(alternate(str));
    }
    static String alternate(String str){
        StringBuilder sb =  new StringBuilder(str);
        str = str.toLowerCase(); // make all lowercase
        for(int i = 0; i<str.length(); i++){
            if(i%2 == 0){ // make characters at even index capital
                sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }
        return  sb.toString();
    }
}
