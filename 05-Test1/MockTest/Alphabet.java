
public class Alphabet {

    public static String sortString(String text){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String sorted = "";
        for(int i=0; i<alphabet.length(); i++){
            for(int j=0; j<text.length(); j++){
                if(text.charAt(j)==alphabet.charAt(i)){
                    sorted+=alphabet.charAt(i);
                }
            }
        }
        return sorted;
    }
    
    public static boolean isAlphabet(String t){
        if(t.equals(sortString(t))){
            return true;
        }
        else{
            return false;
        }        
    }
    
    public static void main(String[] args){
        System.out.println(Alphabet.isAlphabet("abegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhsw"));
    }
}
