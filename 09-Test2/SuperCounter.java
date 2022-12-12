
public class SuperCounter extends Counter{
    
    public SuperCounter(int initialCounter){
        super(initialCounter);
    }

    public void addN(int n){
        for(int i=0; i<n; i++){
            add1();
        }
    }
}
