package oopsAssignments;

import java.util.Locale;

public class Seventeen {
    public static void main(String[] args) {
//        Employee lokesh = new Employee(1, "Lokesh", "Developer","Devops");
        Employee ram = new Employee();
        ram.setEmpId(2);
        ram.setEmpName(null); //  It will throw null pointer exception
        ram.setEmpDept("Photography"); // It will throw invalid designation error message
        ram.setEmpDesig("Devloper"); // It will throw invalid
    }
}
class Employee{
    int empId;
    String empName;
    String empDesig;
    String empDept;

    public Employee(){
    }

    public Employee(int empId, String empName, String empDesig, String empDept) {
        this.empId = empId;
        this.empName = empName;
        this.empDesig = empDesig;
        this.empDept = empDept;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
        if(empName == null){
            throw new NullPointerException("Empty String");
        }
    }

    public String getEmpDesig() {
        return empDesig;
    }

    public void setEmpDesig(String empDesig) {
        empDesig = empDesig.toLowerCase();
        if(empDesig.equals("manager") ||
                empDesig.equals("lead") ||
                empDesig.equals("developer") ||
                empDesig.equals("tester"))
        {
            this.empDesig = empDesig;
        }
        else{
            throw new RuntimeException("Invalid designation");
        }

    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
            empDept = empDept.toLowerCase();
        if(empDept.equals("tth") || empDept.equals("rcm")
                || empDept.equals("devops") || empDept.equals("digital"))
        {
            this.empDept = empDept;
        }
        else {
            throw  new RuntimeException("Invalid Dept");
        }
    }
}
