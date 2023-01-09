
public class Logic{
    private boolean[] arr = {};

    public Logic(boolean[] arr) {
        this.arr = arr;
    }

    public int opposite(){
        if(arr.length<3){
            return 0;
        }
        int counter = 0;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                counter++;
            }
        }
        return counter;
    }
}