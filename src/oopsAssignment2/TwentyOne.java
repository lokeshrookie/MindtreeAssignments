package oopsAssignment2;

import java.util.Scanner;

public class TwentyOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Customer[] customers = new Customer[N];
        for(int  i = 0 ;i<customers.length; i++){
            customers[i] = new Customer();
        }
        customers[0].feedbackRating = 3;
        customers[1].feedbackRating = 4;
        customers[2].feedbackRating = 2.5;
        for (Customer customer : customers) {
            System.out.println(customer.feedbackRating);
        }
    }
}
class Customer{
    String name;
    String mobileNo;
    double feedbackRating;

    public Customer(){
    }

    public Customer(String name, String mobileNo, double feedbackRating) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.feedbackRating = feedbackRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public double getFeedbackRating() {
        return feedbackRating;
    }

    public void setFeedbackRating(double feedbackRating) {
        this.feedbackRating = feedbackRating;
    }
}
