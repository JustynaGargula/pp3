
public class Writer {
    private String name;
    private String lastName;
    
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Writer(String name, String lastName) {
        setName(name);
        setLastName(lastName);
    }

    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Last name: "+lastName);
    }

    public static void main(String[] args){

    }
    
}
