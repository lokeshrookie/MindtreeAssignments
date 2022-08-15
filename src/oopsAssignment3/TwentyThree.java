package oopsAssignment3;

public class TwentyThree {
    public static void main(String[] args){
        Student one = new Student(1, "Ram", true);
        Student two = new Student(2, "Prudhvi", false);
        Student three = new Student(3, "DurgaPrasad", true);
        one.identifyMarks(34, 55);
        System.out.println(one.getMarks());
        two.identifyMarks(36);
        System.out.println(two.getMarks());
        three.identifyMarks(40, 56);
        System.out.println(three.getMarks());
    }
}
class Student{
    private int studentId;
    private float marks;
    private String studentName;
    private Boolean secondChance;

    public Student(){

    }

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(int studentId, String studentName, boolean secondChance) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.secondChance = secondChance;
    }

    public Student(String lokesh) {
    }




     public void identifyMarks(float marks){
        if(!this.secondChance){
            this.setMarks(marks);
        }
    }

    public void identifyMarks(float firstMarks, float secondMarks){
        if(this.secondChance){
            this.setMarks(Math.max(firstMarks, secondMarks));
        }
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public Boolean getSecondChance() {
        return secondChance;
    }

    public void setSecondChance(Boolean secondChance) {
        this.secondChance = secondChance;
    }
}

