public class Calculation{
    //Zad. 15
    
    public static int numberOfItems(int beginning, int end){
        return end-beginning+1;
    }
    
    public static int sum(int beginning, int end){
        return (end+beginning)/2*numberOfItems(beginning, end);
    }
    
    public static int ArithmeticMean(int beginning, int end){
        return sum(beginning, end)/numberOfItems(beginning, end);
    }
    
    public static void main(String[] args){
        System.out.println("Number of items in range <5,10>:\t"+numberOfItems(5,10));
        System.out.println("Sum of numbers in range <5,10>:\t"+sum(5,10));
        System.out.println("Arithmetic mean   of numbers in range <5,10>:\t"+ArithmeticMean(5,10));
    }
}