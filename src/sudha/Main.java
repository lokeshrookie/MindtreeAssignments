package sudha;

public class Main {
        public static void main(String[] args) {
            Employee emp=new Employee();
            emp.setid(1);
            emp.setempname(null);
            emp.setempdesign("eveloper");
            emp.setempdept("evops");

            String getdesign=emp.getempdesign();
            String getdep=emp.getempDept();
            String getname=emp.getempname();
            System.out.println(emp);
            if(getdesign.equals("developer") ||getdesign.equals("tester") || getdesign.equals("leader") ||
                    getdesign.equals("Manager"))
            {
                emp.setempdesign(getdesign);

            }
            else{
                emp.setempdesign("invalid designation");
            }
            if(getdep.equals("tth") ||getdep.equals("rcm") || getdep.equals("digital") ||
                    getdep.equals("devops"))
            {
                emp.setempdept(getdep);

            }
            else{
                emp.setempdept("invalid department");

            }
            if(getname==null)
            {
                emp.setempname("error");

            }
            else{
                emp.setempname(getname);

            }
            System.out.println(emp);
        }
    }
    class Employee
    {
        int empid;
        String empName;
        String empDesign;
        String empDept;
        public void setid(int id)
        {
            this.empid=id;
        }
        public void setempname(String name)
        {
            this.empName=name;
        }
        public void setempdesign(String design){

            this.empDesign=design;
        }
        public void setempdept(String Dept)
        {
            this.empDept=Dept;
        }
        public int getid()
        {
            return empid;
        }
        public String getempname()
        {
            return empName;
        }
        public String getempdesign(){
            return empDesign;
        }
        public String getempDept()
        {
            return empDept;
        }
        public String toString() {
            return "Employee [emp_id = " + empid + ", empname = " + empName + ", empdesign = " + empDesign + ", empdep = " + empDept + "]";
        }

}
