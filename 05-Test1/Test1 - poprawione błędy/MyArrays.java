public class MyArrays {
    
    public static int odd(int[] array){
        int counter = 0;
        for(int i: array){
            if(i>0 && i%2==1){
                counter++;
            }
        }
        return counter;
    }

    public static int above(int[] array){
        int sum = 0;
        int tempSum = 0;

        for(int i: array){
            tempSum+=i;
        }
        double av = tempSum/array.length;
        
        for(int j: array){
            if(j>av){
                sum+=j;
            }
        }
        
        return sum;
    }

    public static void main(String[] args){

    }
}
