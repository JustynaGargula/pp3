import java.util.Collections;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /* 
        Person p = new Person("anna", "may");
        System.out.println(p);

        System.out.println(Isogram.isogram("BLUE water"));
        
        boolean[] arr = {true,false,true,true,false,true,false,true,false};
        Logic l = new Logic(arr);
        System.out.println(l.opposite());

        Number n = new Number();
        n.setSystem(5);
        n.setValue("101");
        System.out.println("Zad 4: "+n.get10());

        String[] arr2 = {"Warszawa","Sopot","Kielce","Szczecin"};
        Cities c = new Cities(arr2);
        System.out.println("Zad 5: "+c.filter('S').cities());

        Pizza pizza = new Pizza("Capri", 32);
        System.out.println("Zad 6: "+pizza.discount());
        System.out.println(pizza.delivery());
        System.out.println(pizza.delivery(2));

        int[] arr3 = {6,7,6,1,4};
        int[] arr4 = {2,5,2,8,4};
        Numbers no = new Numbers(arr3);
        System.out.println("Zad 7: "+no.ok());
        Numbers no1 = new Numbers(arr4);
        System.out.println(no1.ok());
*/
/* 
        Product p1 = new Product("Toilet paper",3);
        Product p2 = new Product("Bread",5);
        Product p3 = new Product("Notebook",10);
        Product p4 = new Product("Apple",2);
        Product[] coll = {p1, p2, p3, p4};
        System.out.print(p1.compareTo(p2)); */


        ArrayList<Product> al = new ArrayList<Product>();
        al.add(new Product("marchew", 13));
        al.add(new Product("ziemniak", 2));
        al.add(new Product("owoce", 12));     

        Collections.sort(al);
        for (Product st : al) {
            System.out.println( st.getName() + " " + st.getPrice());
        }
    }
}
