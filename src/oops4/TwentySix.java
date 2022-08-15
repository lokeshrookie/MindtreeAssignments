package oops4;

import java.util.ArrayList;
import java.util.Scanner;

public class TwentySix {
    static  Scanner s = new Scanner(System.in);
    static int accountNumber = 0;
    public static void main(String[] args) {
        ArrayList<BankUser> users = new ArrayList<>();

//        { users.gert(
        while(true){
            System.out.println("Enter a number b/w 1 and 5: ");
            System.out.println("1. Create Bank user");
            System.out.println("2. Update user details");
            System.out.println("3. Delete user details");
            System.out.println("4. Display users sorted based on Address");
            System.out.println("5. Display users sorted based on Name");
            int input = s.nextInt();
            switch (input){
                case 1:
                    System.out.println("Enter First Name: ");
                    String fname = s.next();
                    System.out.println("Enter Last Name: ");
                    String lname = s.next();
                    String name = fname + " " + lname;
                    int id = accountNumber++;
                    String[] type = {"saving", "loan", "current"};
                    System.out.println("Enter 1,2 or 3 to select account type: ");
                    System.out.println("1 -> saving");
                    System.out.println("2 -> loan");
                    System.out.println("3 -> current");
                    int inputType = s.nextInt();
                    String accountType = null;
                    if(inputType == 1){
                        accountType =type[0];
                    }
                    else if(inputType == 2){
                        accountType = type[1];
                    }
                    else if(inputType == 3){
                        accountType = type[2];
                    }
                    System.out.println("Enter DOB in  DD/MM/YY format : ");
                    String DOB = s.next();
                    System.out.println("Enter balance: ");
                    double balance = s.nextDouble();
                    System.out.println("Enter address and press enter: ");
                    String address = s.next();
                    System.out.println();
                    users.add(new BankUser(accountNumber, name, accountType,DOB, balance, address));
                    System.out.println("User created with following data: ");
                    System.out.println(users.get(users.size()-1).toString());
                    break;
                case 2:
                    if(!users.isEmpty()) {
                        System.out.println("Enter 1 or 2 to select an option: ");
                        System.out.println("1 -> Update Name");
                        System.out.println("2 -> Update Address");
                        int update = s.nextInt();
                        System.out.println("Enter account id to update name: ");
                        int number = s.nextInt();
                        BankUser user = null;
                        for (BankUser bankUser : users) {
                            if (bankUser.accountId == number) {
                                user = bankUser;
                            }
                        }
                        switch (update) {
                            case 1:
                                System.out.println("Enter name to update: ");
                                System.out.println("First name: ");
                                String f = s.next();
                                String l = s.next();
                                user.name = f + " " + l;
                                System.out.println(user.toString());
                                break;
                            case 2:
                                System.out.println("Enter address to update: ");
                                user.address = s.next();
                                System.out.println(user);
                                break;
                        }
                        break;
                    }
                    else{
                        System.out.println("Record is empty.");
                    }
                case 3:
                    System.out.println("List of users: ");
                    for (BankUser value : users) {
                        System.out.println(value.toString());
                    }
                    System.out.println();
                    System.out.println("Enter account Number to delete user data from record: ");
                    int acc = s.nextInt();
                    for(int i = 0; i<users.size(); i++){
                        if(users.get(i).accountId == acc){
                            users.remove(i);
                        }
                    }
                    System.out.println("Remaining users: ");
                    if(users.size() <= 0 ){
                        System.out.println("Empty Record ");
                        System.out.println();
                    }
                    for (BankUser bankUser : users) {
                        System.out.println(bankUser.toString());
                    }
                    break;
                case 4:
                    System.out.println("Enter 1,2,3,4 or 5 to select an option: ");
                    System.out.println("1. Display user details by Account Number: ");
                    System.out.println("2. Display user details by Name: ");
                    System.out.println("3. Display all users who have non-zero balance; ");
                    System.out.println("4. Display users sorted based on Address: ");
                    System.out.println("5. Display users sorted based on Account Number: ");
                    int option = s.nextInt();
                    switch (option){
                        case 1:
                            // by id
                            System.out.println("Enter account number to get the user details: ");
                            int number = s.nextInt();
                            for(int i = 0; i<users.size(); i++){
                                if(number == users.get(i).accountId){
                                    System.out.println(users.get(i).toString());
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Enter name to get the user details: ");
                            String f = s.next();
                            String l = s.next();
                            String fullName  = f + " " + l;
                            for (BankUser user : users) {
                                if (fullName.equals(user.name)) {
                                    System.out.println(user.toString());
                                }
                            }
                            break;
                        case 3:
                            System.out.println("List of all users with non-zero balance: ");
                            for (BankUser user : users) {
                                if (user.balance > 0) {
                                    System.out.println(user.toString());
                                }
                            }
                            break;
                        case 4:
                            System.out.println("List of users sorted by address: ");
                            sortByAddress(users);
                            break;
                        case 5:
                            System.out.println("List of users sorted by address: ");
                            for (BankUser user : users) {
                                System.out.println(user.toString());
                            }
                            break;
                    }


                    break;
                case 5:
                    System.exit(0);
            }

        }

    }

    private static void sortByAddress(ArrayList<BankUser> users) {
            int first = 0;
            for(int i = 0;  i<users.size(); i++){
                int last = users.size()-i-1;
                int maxIndex = findMax(users, first, last);
                swap(users, maxIndex, last);
            }

        for (BankUser user: users){
            System.out.println(user.toString());
        }
    }
    static int findMax(ArrayList<BankUser> users, int first, int last){
        int max = first;
        for(int i = first;  i<=last; i++){
            if(users.get(i).address.charAt(0) > users.get(i).address.charAt(0)){
                max = i;
            }
        }
        return max;
    }
    static void swap(ArrayList<BankUser> users,  int first , int second){
        String temp = users.get(first).address;
        users.get(first).address = users.get(second).address;
        users.get(second).address = temp;
    }
}
class BankUser {


    @Override
    public String toString() {
        return "BankUser{" +
                "accountId=" + accountId +
                ", name='" + name + '\'' +
                ", accountType='" + accountType + '\'' +
                ", DOB='" + DOB + '\'' +
                ", balance=" + balance +
                ", address='" + address + '\'' +
                '}';
    }

    long accountId;
    String name;
    String accountType;
    String DOB;
    double balance;
    String address;

    public BankUser(){}


    public BankUser(long accountId, String name, String accountType, String DOB, double balance, String address) {
        this.accountId = accountId;

        this.name = name;
        this.accountType = accountType;
        this.DOB = DOB;
        this.balance = balance;
        this.address = address;
    }
}