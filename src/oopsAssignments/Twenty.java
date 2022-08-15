package oopsAssignments;

public class Twenty {
    public static void main(String[] args) {
        SavingsAccount one = new SavingsAccount(5000, 5, 1005 );
        System.out.println(one);
        one.calculateInterest();
        one.withDraw(50);
        System.out.println(one.balance);
        one.calculateInterest();
    }
}
class SavingsAccount{
    double balance;
    int interestRate;
    int accountNo;
    public SavingsAccount(){
        this.balance = 0;
        this.interestRate = 4;
    }
    public SavingsAccount(double balance, int interestRate, int accountNo) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.accountNo = accountNo;
    }
    public void withDraw(double amount){
        if(amount > balance){
            System.out.println("Balance is not enough");
        }
        else{
            balance = balance - amount;
            System.out.println("successfully withdrawn " + amount);
        }
    }
    public void calculateInterest(){
        int years = 1;
        double simpleInterest = (balance * years * interestRate)/100;
        System.out.println( "simpleInterest: " + simpleInterest);
    }
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                ", interestRate=" + interestRate +
                ", accountNo=" + accountNo +
                '}';
    }
}