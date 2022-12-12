
public class Main {

    public static void main(String[] args){
        Numbers n1 = new Numbers(3,4,2,1,6);
        System.out.println(n1.different());
        Numbers n2 = new Numbers(9,7,4,3,7);
        System.out.println(n2.different());
        System.out.println();

        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};
        System.out.println(Arrays.arr(arr1,arr2));
        System.out.println();

        Person p1 = new Person("Joanna", 45);
        Person p2 = new Person("Mathew", 51);
        Person p3 = new Person("Ann", 19);
        Person p4 = new Person("Jimmy", 12);
        Person[] family = {p1, p2, p3, p4};
        Family f = new Family(family);
        System.out.println(f.adults());
        System.out.println();

        Product pr1 = new Product("apple", 3);
        Product pr2 = new Product("milk", 10);
        ShoppingList s = new ShoppingList();
        s.add(pr1);
        s.add(pr2);
        System.out.println(s);
        System.out.println(s.total());
        System.out.println();

        SuperCounter sc = new SuperCounter(10);
        System.out.println(sc.getCounter());
        sc.add1();
        System.out.println(sc.getCounter());
        sc.addN(5);
        System.out.println(sc.getCounter());
        System.out.println();

        Car car = new Car(5, 160);
        for(int item: car.spec())
            System.out.println(item);
        System.out.println();        
    }
}
