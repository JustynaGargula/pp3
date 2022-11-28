package Sales;

public class PurchasedProduct {
    
    String name;
    String buyerName;

    public void setName(String name) {
        this.name = name;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public PurchasedProduct(String name, String buyerName) {
        setBuyerName(buyerName);
        setName(name);
    }

    public void dipsplayInfo(){
        System.out.println("Name: "+name+" was/were bought by "+buyerName);
    }


    public static void main(String[] args){
        PurchasedProduct s = new PurchasedProduct("Milk", "Joanna");
        s.dipsplayInfo();
        
    }
}
