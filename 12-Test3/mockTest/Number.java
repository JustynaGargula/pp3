
public class Number {
    private int system;
    private String value;
    
    public int getSystem() {
        return system;
    }
    public void setSystem(int system) {
        this.system = system;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    
    public int get10(){
        int decVal = 0;
        int power = 0;
        char[] digits = {'0', '1','2', '3', '4', '5', '6', '7', '8', '9'};
        int currentNo = 0;
        char currChar = '0';
        for(int i=value.length()-1; i>=0; i--){
            currChar = value.charAt(i);
            for(int j=0; j<10; j++){
                if(currChar == digits[j] ){
                    currentNo = j;
                }
            }

            if(currentNo >= system){
                return -1;
            }
            decVal += ((int) Math.pow(system, power)) * currentNo;
            power++;

        }
        return decVal;
    }
}
