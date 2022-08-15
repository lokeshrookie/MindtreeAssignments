import java.util.Random;

public class o16 {
}


class RetailStore {
    private int itemId;
    private int itemName;
    private int itemPrice;
    private int itemQuantity;
    private int purchaseId;
    private int customerId;
     int billId;

    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemName() {
        return itemName;
    }
    public void setItemName(int itemName) {
        this.itemName = itemName;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    public int getItemQuantity() {
        return itemQuantity;
    }
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    public int getPurchaseId() {
        return purchaseId;
    }
    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public RetailStore(int itemId, int itemPrice, int itemQuantity, int purchaseId, int customerId) {
        super();
        this.itemId = itemId;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.purchaseId = purchaseId;
        this.customerId = customerId;
    }
    public RetailStore() {
        super();
    }


}


class RetailDisplay {
    RetailStore store=new RetailStore();
    int items[]=new int[50];
    public static void main(String[] args) {



    }
    void getAllItems()
    {

        for(int i=0;i<store.getItemQuantity();i++)
        {
            items[i]=store.getItemId();

        }
        System.out.println(items);
    }

    void seacrhItem() throws Exception
    {
        for(int i=0;i<items.length;i++)
        {
            if(store.getPurchaseId()==items[i])
            {
                int bill=store.getItemQuantity()*store.getItemPrice();
//                store.billId = gen();
                System.out.println(store.billId+ " "+
                                store.getCustomerId()+ "  " +
                                store.getPurchaseId()+ " "
                                +store.getItemQuantity());

            }
            else
            {
                System.out.println("Not found");

            }
        }
    }






}
