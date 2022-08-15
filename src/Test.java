import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;



public class Test {

    public static void main(String[] args) {


        ArrayList<Student> list = new ArrayList<>();
        ArrayList<BankUser> list1 = new ArrayList<>();


        Student sai = new Student("Sai");
        Student sudha = new Student("Sudha");



        list.add(sai);
        list.add(sudha);





        /*
        Arraylist = collections .
        stack
        queue.

        int
        floatr
        char

        Student{
        int number;
        float sage;

        }



         */






//        Student lokesh = new Student("Lokesh");
//        Student Ram = new Student("Ram");
//        Student Rakesh = new Student("Rakesh");
//        Student[] students = new Student[3];
//        students[1] = lokesh;
//        students[0] = Ram;
//        students[2] = Rakesh;
//
//        for (Student student: students){
//            System.out.println(student);
//        }
//
//        System.out.println("After sorting : ");
//        Arrays.sort(students, Comparator.comparing( Student-> Student.name));
//        //syntax for sorting objects based on specific class property.
////        Arrays.sort(array_name, Comparator.comparing(class_name -> class_name.property_name);
//
//
//
//
//        for (Student student: students){
//            System.out.println(student);
//        }

    }
}

class BankUser{
    int account;
    String name;

    public BankUser(){}


    public BankUser(int accountId){
        this.account = accountId;
    }
    public BankUser(int accountId, String name){
        this.name = name;
        this.account = accountId;

    }



}



class Student{
    String name;
    int rollno;
    String branch;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public Student(String name) {
        this.name = name;
    }
}



