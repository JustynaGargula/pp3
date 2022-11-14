
public class MyArrays{

    public static int even(int[] array){
        int noE = 0;         //number of even values
        for(int i: array){
            if(i%2==0){
                noE++;
            }
        }
        return noE;
    }

    public static int positiveOdd(int[] array){
        int noO = 0;         //number of poitive odd values
        for(int i: array){
            if(i>0 && i%2==1){
                noO++;
            }
        }
        return noO;
    }
    //public MyArrays(){ }

    public static void main(String[] args){
        int[] arr1 = {2,-6,5,8};
        int[] arr2 = {3,2,-5,4,1,-7};
        System.out.println(MyArrays.even(arr1));
        System.out.println(MyArrays.positiveOdd(arr2));
    }
    
}