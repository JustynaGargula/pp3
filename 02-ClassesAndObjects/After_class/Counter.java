public class Counter{
    int value = 0;
    
    public void inc1(){
        value+=1;
    }
    
        public void dec1(){
        value-=1;
    }
    
        public void inc10(){
        value+=10;
    }
    
        public void dec10(){
        value-=10;
    }
    
    public void reset(){
        value = 0;
    }
    
    public static void main(String[] args){
        Counter c1 = new Counter();
        c1.inc10();
        c1.inc10();
        c1.inc1();
        c1.inc1();
        c1.inc1();
        System.out.println("Value of counter1: " + c1.value);
        
        Counter c2 = new Counter();
        c2.dec10();
        c2.dec10();
        c2.dec10();
        c2.dec10();
        c2.dec10();
        c2.inc1();
        c2.inc1();
        c2.inc1();
        System.out.println("Value of counter2: " + c2.value);
    }
}