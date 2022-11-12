
//zadanie 11
public class Product{

    private String productName;
    private boolean isVegetarian;

    public String getProductName(){
        return productName;
    }
    public void setProductName(String name){
        productName = name;
    }

    public boolean getIsVegetarian(){
        return isVegetarian;
    }
    public void setIsVegetarian(boolean isVegetarian){
        this.isVegetarian = isVegetarian;
    }

    public void displayInfo(){
        System.out.print("Your product is: " + getProductName()+". ");
        if(getIsVegetarian()){
            System.out.println("It is vagetarian.");
        }
        else{
            System.out.println("It isn't vagetarian.");
        }
    }

    public static void main(String[] args){
        Product p = new Product();
        p.setProductName("Banana");
        p.setIsVegetarian(true);

        p.displayInfo();
    }



}