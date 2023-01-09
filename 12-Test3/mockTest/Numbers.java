public class Numbers implements Ok{
    private int[] array;

    public Numbers(int[] array) {
        this.array = array;
    }

    @Override
    public boolean ok() {
        for(int i=0; i<array.length; i++){
            if(i%2==0){
                if(array[i]%2!=0){
                    return false;
                }
            }
            else{
                if(array[i]%2==0){
                    return false;
                }
            }
        }
        return true;
    }
    
}
