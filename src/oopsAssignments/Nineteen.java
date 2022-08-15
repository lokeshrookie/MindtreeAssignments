package oopsAssignments;

public class Nineteen {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1001,
                "Kumar","Rajajinagar, Bangalore-10");
        Customer customer2 = new Customer(1002, "Raja");
        Customer customer3 = new Customer(1003, "Shanthi",
                "Jayanagar, Bangalore-20");

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
    }
}
class Customer{
    private int custId;
    String custName;
    String custAddress;
    String accType;
    double custBalance;

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", accType='" + accType + '\'' +
                ", custBalance=" + custBalance +
                '}';
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public double getCustBalance() {
        return custBalance;
    }

    public void setCustBalance(double custBalance) {
        this.custBalance = custBalance;
    }

    public Customer(int custId, String custName, String custAddress){
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    public Customer(int custId, String custName){
        this.custId = custId;
        this.custName = custName;
    }

    public Customer(int custId, String custName, String custAddress, String accType, double custBalance) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.accType = accType;
        this.custBalance = custBalance;
    }
}
