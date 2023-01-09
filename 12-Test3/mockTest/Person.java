
public class Person {
    private String name;
    private String surname;
    
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        String text = "";
        text += name.charAt(0);
        text += surname.charAt(0);
        return text.toUpperCase();
    }
}
