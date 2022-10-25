public class SurfaceArea{
    
    static double pi = 3.14;
    
    public static double circle(double r){
        return pi*r*r;
    }
    public static double rectangle(double a, double b){
        return a*b;
    }
    public static double triangle(double a, double h){
        return a*h/2.0;
    }
    
    public static void main(String[] args){
        System.out.println("Given data: r=2 a=3 b=4 h=5");
        System.out.println("Displaying areas of:\nCircle: "+circle(2)
        +"\nRectangle: "+rectangle(3,4)+"\nTriangle: "+triangle(3,5));
    }
}