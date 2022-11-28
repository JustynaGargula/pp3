
public class Food {
    private String name;    
    private String expiryDate;
    private String category;


    public void setName(String name) {
        this.name = name;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public Food(String name, String expiryDate, String category) {
        setName(name);
        setExpiryDate(expiryDate);
        setCategory(category);
    }

    public void displayInfo(){
        System.out.println("Name: "+name+" Expiry date: "+expiryDate+" Category: "+category);
    }

    public void changeCategory(String newCategory){
        category = newCategory;
    }

    public String checkDate(){
        return expiryDate;
    }

    public static void main(String[] args){
        Food f1 = new Food("banana", "2.12.2022", "fruit");
        f1.displayInfo();
        f1.changeCategory("yellow fruit");
        System.out.println(f1.checkDate());
        f1.displayInfo();

        Food f2 = new Food("apple", "30.12.2022", "fruit");
        f2.displayInfo();
        f2.changeCategory("red fruit");
        System.out.println(f2.checkDate());
        f2.displayInfo();
    }
    
}
