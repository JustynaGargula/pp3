package Sales;

public class Customer {
    
    private String name;
    private boolean isPerson;

    public void setName(String name) {
        this.name = name;
    }

    public void setPerson(boolean isPerson) {
        this.isPerson = isPerson;
    }

    public Customer(String name, boolean isPerson) {
        setName(name);
        setPerson(isPerson);
    }

    public void buy(){}

    public void displayInfo(){
        System.out.print("Name: "+name+". ");
        if(isPerson){
            System.out.println(" That's a person.");
        }
        else{
            System.out.println(" Something is wrong. It must be person.");
        }
    }

    public static void main(String[] args){
        Customer c = new Customer("Joanna", true);
        c.displayInfo();
    }
}
