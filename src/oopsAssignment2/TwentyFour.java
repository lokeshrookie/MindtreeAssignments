package oopsAssignment2;


import java.util.ArrayList;
import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Student> studentRecord = new ArrayList<>();
        while (true){
            System.out.println("Enter 1,2 or 3: ");
            System.out.println("1. Create student record. ");
            System.out.println("2. Display Student names in sorted order based on branch: ");
            System.out.println("3. Display student ID in sorted ascending order: ");
            System.out.println("4. Exit.");
            int option = s.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter number of students: ");
                    int size  = s.nextInt();
                    for(int i = 0; i<size; i++){
                        System.out.println("Enter student Name (without spaces) : " );
                        String name =  s.next();
                        System.out.println("Enter branch: ");
                        String branch = s.next();
                        int id = i+1;
                        studentRecord.add(new Student(id, name, branch));
                    }
                    for(Student student : studentRecord){
                        System.out.println(student.toString());
                    }
                    break;
                case 2:
                    if(studentRecord.size() <= 0){
                        System.out.println("No data found. ");
                    }
                    else{
                        sortByBranch(studentRecord);
                    }
                    break;
                case 3:
                    if(studentRecord.size() <= 0){
                        System.out.println("No data found. ");
                    }
                    else{
                        System.out.println("Students in ascending order based on ID: ");
                        for (Student student : studentRecord) {
                            System.out.println(student.toString());
                        }
                    }

                    break;
                case 4:
                    System.exit(0);


            }

        }




    }
    private static void sortByBranch(ArrayList<Student> students) {
        ArrayList<Student> branchwise = new ArrayList<>(students);
        int first = 0;

        for(int i = 0;  i<branchwise.size(); i++){
            int last = branchwise.size()-i-1;
            int maxIndex = findMax(branchwise, first, last);
            swap(branchwise, maxIndex, last);
        }

        for (Student user: branchwise){
            System.out.println(user.toString());
        }
    }
    static int findMax(ArrayList<Student> users, int first, int last){
        int max = first;
        for(int i = first;  i<=last; i++){
            if(users.get(i).branch.compareTo(users.get(max).branch) > 0 ){
                max = i;
            }
        }
        return max;
    }
    static void swap(ArrayList<Student> students,  int first , int second){
        Student temp = students.get(first);
        students.set(first,students.get(second));
        students.set(second, temp);
    }

}
class Student{
    int studentId;
    String studentName;
    String branch;


    public Student(int studentId, String studentName, String branch){
        this.studentId = studentId;
        this.studentName = studentName;
        this.branch = branch;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
