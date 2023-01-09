public class Pizza extends Food implements Extra {
    private int size;
    
    public Pizza(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void setPrice() {
        setPrice(size-10);
    }

    @Override
    public float delivery() {
        if(size < 50){
            return 6;
        }
        else{
            return 8;
        }
    }

    @Override
    public float delivery(int tip) {
        if(size < 50){
            return 6 + tip;
        }
        else{
            return 8 + tip;
        }
    }

    @Override
    public float discount() {
        if(size>=30){
            return 5;
        }
        return 0;
    }
    
    
}
