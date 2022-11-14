
public class Counter {
    int counter = 0;

    public void increase(){
        counter++;
    }

    public void decrease(){
        counter--;
    }

    public void increase(int n){
        counter+=n;
    }

    public void decrease(int n){
        counter-=n;
    }

    public int value(){
        return counter;
    }
    public Counter(){
        counter = 0;
    }

    public static void main(String[] args){
        Counter c = new Counter();
        System.out.println(c.value());
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value());
    }
}
