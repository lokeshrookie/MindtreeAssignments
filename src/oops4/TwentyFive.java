package oops4;

public class TwentyFive {
    public static void main(String[] args) {
        Student[] students =  new Student[3];

        students[0] = new Student(1, "Lokesh", "ECE", 99);
        students[1] = new Student(2, "Ram", "Ece", 98);
        students[2] = new Student(3, "Rakesh", "Ece" , 97);
        System.out.println(sortStudents(students));

    }
    static Student sortStudents(Student[] student){
        Student max = student[0];
        for(int i = 0; i<student.length; i++){
            if(student[i].score >  max.score){
                max = student[i];
            }
        }
        return max;
    }
}

class Student{
    int id;
    String name;
    String branch;
    double score;

    public Student(int id , String name, String branch, double score){
        this.id = 0;
        this.name = name;
        this.branch = branch;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", score=" + score +
                '}';
    }
}
