package oopsAssignments;

import java.util.Random;
import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int itemId = 5000;
        Item[] items = new Item[5];
        items[0] = new Item();
        items[0].id = itemId++;
        items[0].price = 100;
        items[1] = new Item();
        items[1].id = itemId++;
        items[1].price = 150;
        items[2] = new Item();
        items[2].id = itemId++;
        items[2].price = 200;
        items[3] = new Item();
        items[3].id = itemId++;
        items[3].price = 250;
        items[4] = new Item();
        items[4].id = itemId;
        items[4].price = 300;
        System.out.println("Items available at retail store are: ");
        for(Item item : items){
            System.out.println(item.id + " " + item.price);
        }
        Item customerBoughtItem = new Item();
        System.out.println("As a Customer,Enter item id to buy: ");
        customerBoughtItem.id = s.nextInt();
        System.out.println("Enter quantity: ");
        customerBoughtItem.quantity = s.nextInt();
        boolean found = false;
        for(Item item : items){
            if(item.id == customerBoughtItem.id){
                found = true;
                customerBoughtItem.price = item.price;
            }
        }
        if(!found){
            System.out.println("Item not found.");
        }
        else{
            Bill bill = new Bill();
            bill.billId = bill.gen()-9;
            bill.customerId = bill.gen()-100;
            bill.purchaseId = bill.gen()-200;
            bill.quantityPurchased = customerBoughtItem.quantity;
            bill.amount = customerBoughtItem.quantity * customerBoughtItem.price;
            System.out.println("Bill : ");
            System.out.println(bill.toString());
        }
    }
}

class Bill{
    int billId;
    int customerId;
    int purchaseId;
    int quantityPurchased;
    double amount;
    public int gen()
    {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", customerId=" + customerId +
                ", purchaseId=" + purchaseId +
                ", quantityPurchased=" + quantityPurchased +
                ", amount=" + amount +
                '}';
    }
}
class Item{
    int id;
    double price;
    int quantity;
    public Item(int id, double price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }
    public Item(int id, double price) {
        this.id = id;
        this.price = price;
    }
    public Item(){

    }
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}