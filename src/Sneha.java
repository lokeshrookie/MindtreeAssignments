//public class Sneha {
//}
import java.util.*;
 class Hello {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Boolean bool=true;
        ArrayList<Bank> bank=new ArrayList<Bank>();
        Bank b=new Bank();
        while(true)
        {
            System.out.println("1. Create bank user ");
            System.out.println("2. Update user details ");
            System.out.println("3. Delete user details  ");
            System.out.println("4. Display user details ");
            System.out.println("5. Exit ");
            System.out.println();
            System.out.println("Enter Option");
            int opt=s.nextInt();
            switch(opt)
            {
                case 1:
                    b=new Bank();
                    System.out.println("Enter account number : ");
                    long no=s.nextLong();
                    b.setaccountnumber(no);
                    s.nextLine();
                    System.out.println("Enter name : ");
                    String name=s.nextLine();
                    b.setname(name);
                    System.out.println("Enter account type : ");
                    String type=s.nextLine();
                    b.setaccounttype(type);
                    System.out.println("Enter Date of Birth : ");
                    String birthdate=s.nextLine();
                    b.setdateofbirth(birthdate);
                    System.out.println("Enter Balance : ");
                    double balan=s.nextDouble();
                    b.setbalance(balan);
                    s.nextLine();
                    System.out.println("Enter address : ");
                    String addre=s.nextLine();
                    b.setaddress(addre);
                    bank.add(b);
                    break;
                case 2:
                    System.out.println("1. To change the name");
                    System.out.println("2. To change the address");
                    System.out.println("Enter either 1 or 2 :");
                    int op=s.nextInt();
                    if(op==1)
                    {
                        System.out.println("Enter Account Number : ");
                        long accno=s.nextLong();
                        s.nextLine();
                        for(Bank l:bank)
                        {
                            if(l.accountNumber == accno)
                            {
                                System.out.println("Account no is found,enter new name : ");
                                String changename=s.nextLine();
                                l.Name=changename;
                                System.out.println("After Modification : ");
                                System.out.println(l);
                            }
                        }

                    }
                    else
                    {
                        System.out.println("Enter Account Number : ");
                        long accno=s.nextLong();
                        s.nextLine();
                        for(Bank l:bank)
                        {
                            if(l.accountNumber == accno)
                            {
                                System.out.println("Account no is found,enter new address : ");
                                String changeaddress=s.nextLine();
                                l.address=changeaddress;
                                System.out.println("After Modification : ");
                                System.out.println(l);
                            }
                        }

                    }
//                    else{
//                        System.out.println("Wrong input");
//                    }
                    break;
                case 3:
                    System.out.println("Enter Account No : ");
                    boolean found = false;
                    int accno=s.nextInt();
                    for(int i=0;i<bank.size();i++)
                    {
                        if(bank.get(i).accountNumber==accno)
                        {
                            bank.remove(bank.get(i));
                            found = true;
                        }
                    }
                    if(found){
                        System.out.println( accno  + " is Deleted");
                    }
                    else{
                        System.out.println("Account not found");
                    }
                    break;
                case 4:

                    while(true)
                       {
                        System.out.println("1.Display user details based on ID : ");
                        System.out.println("2.Display user details based on Name : ");
                        System.out.println("3.Display all users who have non-zero balance  : ");
                        System.out.println("4.Display user sorted based on address location wise : ");
                        System.out.println("5.Display user sorted based on account ID  : ");
                        System.out.println("6.EXIT : ");
                        System.out.println("Select any of the above options : ");
                        int z=s.nextInt();

                        switch(z)
                        {
                            case 1:
                                System.out.println("Enter Account Id : ");
                                long accid=s.nextInt();
                                for(Bank k:bank)
                                {
                                    if(k.accountNumber==accid)
                                    {
                                        System.out.println(k);
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Enter Account Name : ");
                                s.nextLine();
                                String NAME=s.nextLine();
                                for(Bank k:bank)
                                {
                                    if((k.Name).equals(NAME))
                                    {
                                        System.out.println(k);
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("accounts with non-zero balance ");
                                for(Bank k:bank)
                                {
                                    if(k.balance>0)
                                        System.out.println(k);
                                }
                                break;

                            case 4:
                                ArrayList<String> list2=new ArrayList<String>();
                                for(int i=0;i<bank.size();i++)
                                {
                                    list2.add(bank.get(i).address);
                                }
                                Collections.sort(list2);
                                for(int i=0;i<list2.size();i++)
                                {
                                    for(int j=0;j<bank.size();j++)
                                    {
                                        if(bank.get(j).address.equals(list2.get(i)))
                                        {
                                            System.out.println(bank.get(j));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ArrayList<Long> list1=new ArrayList<Long>();
                                for(int i=0;i<bank.size();i++)
                                {
                                    list1.add(bank.get(i).accountNumber);
                                }
                                Collections.sort(list1);
                                for(int i=0;i<list1.size();i++)
                                {
                                    for(int j=0;j<bank.size();j++)
                                    {
                                        if(bank.get(j).accountNumber==list1.get(i))
                                        {
                                            System.out.println(bank.get(j));
                                        }
                                    }
                                }
                                break;
                            case 6:
                                System.out.println("Exiting!!! ");
//                                bool2=false;



                        }
                    }


                case 5:
                    System.out.println("EXITING!! ");
                    bool=false;
                    break;

            }
        }


        //System.out.println("USERS ARE : "+ bank);
    }
}

 class Bank {

    long accountNumber;
    String Name;
    String accountType;
    String dateOfBirth;
    double balance;
    String address;
    public void setaccountnumber(long accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public void setname(String Name)
    {
        this.Name=Name;
    }
    public void setaccounttype(String  accountType)
    {
        this.accountType=accountType;
    }
    public void setdateofbirth(String dateOfBirth)
    {
        this.dateOfBirth=dateOfBirth;
    }
    public void setbalance(double  balance)
    {
        this.balance=balance;
    }
    public void setaddress(String  address)
    {
        this.address=address;
    }
    public String toString()
    {
        return "Account Number : "+accountNumber+'\n'+"name : "+Name+'\n'+"account type : "+accountType+'\n'+"date of birth : "+dateOfBirth+'\n'+"Balance : "+balance+'\n'+"address : "+address;
    }

}