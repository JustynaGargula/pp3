
public class Isogram{

    public static boolean isogram(String text){
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        int[] table = new int[26*2+1];
        for (int i=0; i<26*2+1; i++){
            table[i] = 0;
        }
        for (int i=0; i<text.length(); i++){
            table[base.indexOf(text.charAt(i))]++;
        }
        for (int i=0; i<text.length(); i++){
            if(table[i]>1){
                return false;
            }
        }
        return true;
    }
}