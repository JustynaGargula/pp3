import java.util.ArrayList;

public class ShoppingList {
    private ArrayList <Product> shoppingList = new ArrayList<Product>();
    
    public void add(Product product){
        shoppingList.add(product);
    }

    public String toString(){
        String text = "";
        for(Product item: shoppingList){
            text=item.getName()+","+text;
        }
        text = text.substring(0, text.length()-1);
        return text;
    }

    public int total(){
        int sum = 0;
        for(Product item: shoppingList){
            sum+=item.getQuantity();
        }
        return sum;
    }
}
