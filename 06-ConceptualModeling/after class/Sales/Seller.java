package Sales;

public class Seller {
    private String name;
    private boolean isCompany;

    public void sell(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(boolean isCompany) {
        this.isCompany = isCompany;
    }
    public Seller(String name, boolean isCompany){
        setCompany(isCompany);
        setName(name);
    }


    public void displayInfo(){
        System.out.print("Name: "+name+". ");
        if(isCompany){
            System.out.println(" That's a company.");
        }
        else{
            System.out.println(" That's not a company.");
        }
    }

    public static void main(String[] args){
        Seller s = new Seller("GoodSeller", true);
        s.displayInfo();
    }

}
