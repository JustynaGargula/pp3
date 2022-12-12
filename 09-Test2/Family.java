
public class Family {
    private Person[] family;
    
    public Family(Person[] family){
        this.family = family;
    }

    public int adults(){
        int counter = 0;
        for(Person person: family){
            if(person.getAge()>=18){
                counter++;
            }
        }
        return counter;
    }
}
