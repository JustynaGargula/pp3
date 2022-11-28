import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    
    ArrayList<String> items = new ArrayList<String>();
    Scanner in = new Scanner(System.in);

    public void addItem(String item){
        items.add(item);
    }

    public void addItemFromKeyboard(){
        System.out.println("Enter new item for shopping list: ");
        items.add(in.nextLine());
    }

    public int numberOfItems(){
        return items.size();
    }

    public String displayList(){
        String currentList = "";
        for(String item: items){
            currentList+=item;
            currentList+="\n";
        }
        return currentList;
    }

    public static void main(String[] args){
        ShoppingList list1 = new ShoppingList();
        System.out.println(list1.displayList());
        System.out.println(list1.numberOfItems());
        list1.addItem("milk");
        list1.addItem("cheese");
        list1.addItem("bread");
        System.out.println(list1.displayList());
        System.out.println(list1.numberOfItems());
        list1.addItem("potato");
        System.out.println(list1.displayList());
        System.out.println(list1.numberOfItems());
        list1.addItemFromKeyboard();
        System.out.println(list1.displayList());
        System.out.println(list1.numberOfItems());
    }
}
