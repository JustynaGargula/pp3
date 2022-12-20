
public class Rectangle extends Shape{
    
    private double a;
    private double b;

    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area(){
        return a*b;
    }
    public double perimeter(){
        return 2*a+2*b;
    }

    public static void main(String[] args) {
        
    }
}
