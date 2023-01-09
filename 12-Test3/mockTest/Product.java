import java.util.Collections;

public class Product implements Comparable<Product>{
    private String name;
    private float price; 

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    
    @Override
    public int compareTo(Product p) {
        return this.name.compareTo(p.name);
    }
    
    /*
    public static Product[] sort(Product[] products){
        return Arrays.sort(products);
    }
 */

    /* 
    public static Product[] sort(Product[] products){
        String[] names = new String[products.length];

        for(int i=0; i<products.length; i++){
            names[i] = products[i].getName();
        }
        Collections.sort(names);
    }
  */  
/* 
    @Override
    public Product[] sort(Product[] products) {
        Product[] sorted = products;
        String[] names = new String[products.length];

        for(int i=0; i<products.length; i++){
            names[i] = products[i].getName();
        }
        
        for(int i=0; i<names.length-1; i++){
            for(int j=i+1; j<names.length; j++){
                if(name)
            }
        }
        
        return products;
    }
    */

    public static void main(String[] args) {

    }
}
