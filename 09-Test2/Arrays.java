
public class Arrays {
    
    public static boolean arr(int[] arr1, int[] arr2){
        int count1 = 0;
        for(int no: arr1){
            if(no>=10 && no<=99){
                count1++;
            }
        }
        int count2 = 0;
        for(int no: arr2){
            if(no>=10 && no<=99){
                count2++;
            }
        }

        if(count1 == count2){
            return true;
        }
        else{
            return false;
        }

    }
}
